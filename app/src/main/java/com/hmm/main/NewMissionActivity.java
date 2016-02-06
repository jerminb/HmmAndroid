package com.hmm.main;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.hmm.R;
import com.hmm.main.gallery_fragments.GalleryFragment;
import com.hmm.services.ImageProviderService;

public class NewMissionActivity extends AppCompatActivity {

    private EditText descriptionEditText;
    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_mission);

        initTopActions();
        initBottomActions();
        initEditText();
    }

    private void initEditText() {
        descriptionEditText = (EditText)findViewById(R.id.new_mission_description);
        LinearLayout textContainer = (LinearLayout)findViewById(R.id.new_mission_content_container);
        textContainer.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                descriptionEditText.requestFocus();
                descriptionEditText.showContextMenu();
                return true;
            }
        });
    }
    private void initBottomActions() {

        ImageButton cameraButton = (ImageButton) findViewById(R.id.new_mission_camera);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(
                        R.anim.slide_up,
                        R.anim.slide_down,
                        R.anim.slide_up,
                        R.anim.slide_down);
                GalleryFragment galleryFragment = GalleryFragment.newInstance("", "");
                transaction.addToBackStack(null);
                transaction.add(R.id.new_mission_fragment_container, galleryFragment);
                currentFragment = galleryFragment;
                transaction.commit();
            }
        });
    }

    public void detachCurrentFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.remove(currentFragment);
        transaction.commit();
        currentFragment = null;
    }

    private void initTopActions() {
        ImageView closeImage = (ImageView) findViewById(R.id.new_mission_close);
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView profileImage = (ImageView) findViewById(R.id.new_mission_profile_image);
        profileImage.setImageDrawable(ContextCompat.getDrawable(getBaseContext(), R.drawable.profile));
    }

    @Override
    public void onBackPressed() {
        if(currentFragment != null) {
            getFragmentManager().popBackStack();
            currentFragment = null;
        }
        else {
            super.onBackPressed();
        }
    }

    public void onCameraClicked(View v) {

    }

    public void onVideoClicked(View v) {

    }

    public void onGalleryClicked(View v) {

    }

    public void onPostClicked(View v) {

    }
}
