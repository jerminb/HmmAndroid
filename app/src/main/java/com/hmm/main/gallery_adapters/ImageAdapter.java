package com.hmm.main.gallery_adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.hmm.R;
import com.hmm.utils.Utils;
import com.hmm.viewmodels.ImagePath;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arash on 2/3/16.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private List<ImagePath> mImagePaths;

    public ImageAdapter(Context context) {
        mContext = context;
        mImagePaths = new ArrayList<ImagePath>();
    }

    public int getCount() {
        return mImagePaths.size();
    }

    public long getItemId(int position){
        return 0;
    }

    public ImagePath getItem(int position) {
        return mImagePaths.get(position);
    }

    public void addImagePath(ImagePath imagePath)
    {
        mImagePaths.add(imagePath);
        this.notifyDataSetChanged();
    }

    public void SetImagePathList(List<ImagePath> pathList) {
        mImagePaths.clear();
        mImagePaths = pathList;
        this.notifyDataSetChanged();
    }

    public View getView(int position, View counterView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v;
        ImagePath item = getItem(position);
        if(counterView == null) {
            v = new View(mContext);
            v = inflater.inflate(R.layout.image_item_layout, null);
            v.setLayoutParams(new GridView.LayoutParams(
                    Utils.getScreenWidth(mContext) / 3,
                    Utils.getScreenWidth(mContext) / 3));
        }
        else {
            v = counterView;
        }
        View overlay = v.findViewById(R.id.image_item_overlay);
        if(item.isSelected()) {
            overlay.setVisibility(View.VISIBLE);
        }
        else {
            overlay.setVisibility(View.INVISIBLE);
        }
        ImageView image = (ImageView)v.findViewById(R.id.image_item_image);
        Glide.with(mContext).load(item.getmThumbnailPath()).into(image);
        return v;
    }
}
