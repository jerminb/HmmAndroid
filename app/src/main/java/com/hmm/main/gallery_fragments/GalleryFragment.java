package com.hmm.main.gallery_fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.hmm.R;
import com.hmm.main.gallery_adapters.ImageAdapter;
import com.hmm.services.ImageProviderService;
import com.hmm.utils.Utils;
import com.hmm.viewmodels.ImagePath;
import com.hmm.widgets.CustomButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GalleryFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment implements View.OnTouchListener {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private float startY = 0f;
    private float pointsDragged = 0f;
    private static final float POINTS_TO_DETACH = 300;
    private View ownView;
    private GridView gridView;
    private ImageAdapter ia;
    private List<ImagePath> selectedImages;
    private IGalleryFragmentHandler galleryFragmentHandler;

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */

    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            selectedImages = new ArrayList<ImagePath>();
            ia = new ImageAdapter(getActivity().getBaseContext());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);
        ownView = v;
        gridView = (GridView)v.findViewById(R.id.gallery_image_gridview);
        initGridView();
        addControlEventListeners();
        return v;
    }

    private void initGridView() {
        gridView.setAdapter(ia);
        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {;
                ImagePath item = (ImagePath)gridView.getItemAtPosition(position);
                if(item != null) {
                    View v = view.findViewById(R.id.image_item_overlay);
                    if(item.isSelected()) {
                        v.setVisibility(View.INVISIBLE);
                        removeImageFromList(item.getmOriginalId());
                    }
                    else {
                        v.setVisibility(View.VISIBLE);
                        selectedImages.add(item);
                    }
                    item.setIsSelected(!item.isSelected());
                }
            }
        };
        gridView.setOnItemClickListener(listener);
        initImages();
    }

    private void initImages() {
        ImageProviderService ips = new ImageProviderService(getActivity().getBaseContext());
        List<ImagePath> list = ips.getAllThumbnails();
        Collections.reverse(list);
        ia.SetImagePathList(list);
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            galleryFragmentHandler = (IGalleryFragmentHandler) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement IGalleryFragmentHandler");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        final float Y = event.getRawY();
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            {
                startY = Y;
            };break;
            case MotionEvent.ACTION_MOVE:
            {
                if(Y > startY) {
                    pointsDragged = Y - startY;
                    FrameLayout.LayoutParams lparams = (FrameLayout.LayoutParams) ownView.getLayoutParams();
                    lparams.topMargin = (int) (Y - startY);
                    ownView.setLayoutParams(lparams);
                }
            };break;
            case MotionEvent.ACTION_UP:{
                if(pointsDragged >= POINTS_TO_DETACH) {
                    getActivity().getFragmentManager().popBackStack();
                }
                else {
                    Animation anim = new Animation() {
                        @Override
                        protected void applyTransformation(float interpolatedTime, Transformation t) {
                            FrameLayout.LayoutParams lparams = (FrameLayout.LayoutParams) ownView.getLayoutParams();
                            lparams.topMargin = (int)-pointsDragged;
                            ownView.setLayoutParams(lparams);
                        }
                    };
                    anim.setInterpolator(getActivity().getBaseContext(), android.R.anim.cycle_interpolator);
                    anim.setDuration(900);
                    ownView.startAnimation(anim);
                }
                startY = 0f;
                pointsDragged = 0f;
            }
        }
        return true;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Uri uri);
    }

    private void addControlEventListeners() {
        CustomButton cancelButton = (CustomButton) ownView.findViewById(R.id.gallery_control_cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedImages.clear();
                getActivity().getFragmentManager().popBackStack();
            }
        });
        CustomButton doneButton = (CustomButton) ownView.findViewById(R.id.gallery_control_done);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                galleryFragmentHandler.imageSelectionFinished(selectedImages);
            }
        });
    }
    private void removeImageFromList(long imageId) {
        for(Iterator<ImagePath> iterator = selectedImages.iterator();iterator.hasNext();) {
            ImagePath item = iterator.next();
            if(item.getmOriginalId() == imageId) {
                iterator.remove();
                break;
            }
        }
    }
}
