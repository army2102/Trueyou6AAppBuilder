package appbuilder6a.trueyou6a.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.fragment.CouponFragment;
import appbuilder6a.trueyou6a.fragment.DealListFragment;
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
    Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, DealListFragment.newInstance())
                    .commit();
        }

        btnCouponPage.setOnClickListener(this);
        btnSummaryPage.setOnClickListener(this);
        btnHistorysPage.setOnClickListener(this);
        btnDealsPage.setOnClickListener(this);
        btnLogout.setOnClickListener(this);


    }

    private void initInstances() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnCouponPage = findViewById(R.id.btnCouponPage);
        btnSummaryPage = findViewById(R.id.btnSummaryPage);
        btnHistorysPage = findViewById(R.id.btnHistorysPage);
        btnDealsPage = findViewById(R.id.btnDealsPage);
        btnLogout = findViewById(R.id.btnLogout);

        drawerLayout = findViewById(R.id.drawerLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerLayout,
                R.string.open_drawer,
                R.string.close_drawer
        );

        //TODO setDrawer
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

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
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View view) {
        if (view == btnCouponPage) {
//            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.contentContainer);
//            if (!(fragment instanceof CouponFragment)){
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.contentContainer, CouponFragment.newInstance())
//                        .addToBackStack(null)
//                        .commit();
//            }
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(
                            R.anim.from_right, R.anim.to_left,
                            R.anim.from_left, R.anim.to_right
                    )
                    .replace(R.id.contentContainer, CouponFragment.newInstance())
                    .commit();
        } else if (view == btnSummaryPage) {
//            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.contentContainer);
//            if (!(fragment instanceof SummaryFragment)){
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.contentContainer, SummaryFragment.newInstance())
//                        .addToBackStack(null)
//                        .commit();
//            }
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(
                            R.anim.from_right, R.anim.to_left,
                            R.anim.from_left, R.anim.to_right
                    )
                    .replace(R.id.contentContainer, SummaryFragment.newInstance())
                    .commit();
        } else if (view == btnHistorysPage) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(
                            R.anim.from_right, R.anim.to_left,
                            R.anim.from_left, R.anim.to_right
                    )
                    .replace(R.id.contentContainer, HistoryListFragment.newInstance())
                    .commit();
        } else if (view == btnDealsPage) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(
                            R.anim.from_right, R.anim.to_left,
                            R.anim.from_left, R.anim.to_right
                    )
                    .replace(R.id.contentContainer, DealListFragment.newInstance())
                    .commit();
        }else if (view == btnLogout) {
            finish();
        }
    }
}
