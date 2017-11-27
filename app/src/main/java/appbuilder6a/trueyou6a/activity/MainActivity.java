package appbuilder6a.trueyou6a.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.TrueyouApplication;
import appbuilder6a.trueyou6a.fragment.DealCollectionFragment;
import appbuilder6a.trueyou6a.fragment.DealListFragment;
import appbuilder6a.trueyou6a.fragment.GachaponFragment;
import appbuilder6a.trueyou6a.fragment.HistoryListFragment;
import appbuilder6a.trueyou6a.fragment.SummaryFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Button btnCouponPage;
    Button btnSummaryPage;
    Button btnHistorysPage;
    Button btnDealsPage;
    Button btnCollectionPage;
//    Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();


        if (savedInstanceState == null) {
            if (TrueyouApplication.pageStatus == 1) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.contentContainer, DealCollectionFragment.newInstance())
                        .commit();
                TrueyouApplication.pageStatus = 0;
            } else if (TrueyouApplication.pageStatus == 2) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.contentContainer, GachaponFragment.newInstance())
                        .commit();
                TrueyouApplication.pageStatus = 0;
            } else {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.contentContainer, DealListFragment.newInstance())
                        .commit();
            }

        }


    }

    private void initInstances() {
        setTitle("");
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnCouponPage = findViewById(R.id.btnCouponPage);
        btnSummaryPage = findViewById(R.id.btnSummaryPage);
        btnHistorysPage = findViewById(R.id.btnHistorysPage);
        btnDealsPage = findViewById(R.id.btnDealsPage);
        btnCollectionPage = findViewById(R.id.btnCollectionPage);
//        btnLogout = findViewById(R.id.btnLogout);

        btnCouponPage.setOnClickListener(this);
        btnSummaryPage.setOnClickListener(this);
        btnHistorysPage.setOnClickListener(this);
        btnDealsPage.setOnClickListener(this);
        btnCollectionPage.setOnClickListener(this);
//        btnLogout.setOnClickListener(this);

        drawerLayout = findViewById(R.id.drawerLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerLayout,
                R.string.open_drawer,
                R.string.close_drawer
        );

        //TODO setDrawer
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }


    @Override
    public void onClick(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.contentContainer);
        if (view == btnCouponPage) {
            if (!(fragment instanceof GachaponFragment)) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.from_right, R.anim.to_left,
                                R.anim.from_left, R.anim.to_right
                        )
                        .replace(R.id.contentContainer, GachaponFragment.newInstance())
                        .commit();
                drawerLayout.closeDrawers();
            }

        } else if (view == btnSummaryPage) {
            if (!(fragment instanceof SummaryFragment)) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.from_right, R.anim.to_left,
                                R.anim.from_left, R.anim.to_right
                        )
                        .replace(R.id.contentContainer, SummaryFragment.newInstance())
                        .commit();
                drawerLayout.closeDrawers();
            }

        } else if (view == btnHistorysPage) {
            if (!(fragment instanceof HistoryListFragment)) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.from_right, R.anim.to_left,
                                R.anim.from_left, R.anim.to_right
                        )
                        .replace(R.id.contentContainer, HistoryListFragment.newInstance())
                        .commit();
                drawerLayout.closeDrawers();
            }

        } else if (view == btnDealsPage) {
            if (!(fragment instanceof DealListFragment)) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.from_right, R.anim.to_left,
                                R.anim.from_left, R.anim.to_right
                        )
                        .replace(R.id.contentContainer, DealListFragment.newInstance())
                        .commit();
                drawerLayout.closeDrawers();
            }

        } else if (view == btnCollectionPage) {
            if (!(fragment instanceof DealCollectionFragment)) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.from_right, R.anim.to_left,
                                R.anim.from_left, R.anim.to_right
                        )
                        .replace(R.id.contentContainer, DealCollectionFragment.newInstance())
                        .commit();
                drawerLayout.closeDrawers();
            }

        } //TODO: Login / Logout
//        else if (view == btnLogout) {
//            finish();
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        } else {
            switch (item.getItemId()) {
                case R.id.actionSearch:
                    Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                    startActivity(intent);
                    break;
            }

            return true;
        }


    }
}
