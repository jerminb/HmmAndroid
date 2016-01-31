package com.hmm.main;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.hmm.DI.ServiceModule_ProvideUserRemoteServiceFactory;
import com.hmm.R;
import com.hmm.application.HmmApp;
import com.hmm.enums.MenuEnum;
import com.hmm.models.User;
import com.hmm.models.mission.CoopMission;
import com.hmm.models.mission.Mission;
import com.hmm.models.service_entities.ServiceUser;
import com.hmm.services.UserRemoteService;
import com.hmm.utils.ICallBack;
import com.hmm.utils.Response;
import com.hmm.viewmodels.Feed;
import com.hmm.viewmodels.TextFeed;
import com.hmm.views.adapters.FeedViewListAdapter;

import java.util.ArrayList;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        populateList();
        addFab();
    }

    @Override
    protected void initView(MenuEnum currentMenu) {
        currentMenu = MenuEnum.HOME;
        super.initView(currentMenu);

        viewContainer.addView(View.inflate(getApplicationContext(), R.layout.activity_home, null));
    }

    private void addFab() {
        initFab();
        FloatingActionButton fabAddCampaign = new FloatingActionButton(getApplicationContext());
        fabAddCampaign.setIcon(R.drawable.ic_search_white_24dp);
        fabAddCampaign.setColorNormal(ContextCompat.getColor(getBaseContext(), R.color.fab_normal));
        //fabAddCampaign.setOnClickListener(fabListener);
        fabMenu.addButton(fabAddCampaign);

    }
    private void populateList() {
        ServiceUser user = new ServiceUser(new User());

        ((HmmApp)getApplication()).getServiceComponent().inject(user);

        user.postAMission(new CoopMission());


        ArrayList<Feed> arrayOfFeeds = new ArrayList<Feed>();
        arrayOfFeeds.add(new TextFeed("1", "JJ3", "JJContent"));
        arrayOfFeeds.add(new TextFeed("2", "JJ4", "JJContent2"));
        FeedViewListAdapter myAdapter=new
                FeedViewListAdapter(
                this,
                arrayOfFeeds);
        ListView myList=
                (ListView) viewContainer.findViewById(R.id.feedListView);
        myList.setAdapter(myAdapter);
    }
}
