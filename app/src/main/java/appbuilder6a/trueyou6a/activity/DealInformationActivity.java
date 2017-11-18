package appbuilder6a.trueyou6a.activity;

import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.fragment.CouponFragment;
import appbuilder6a.trueyou6a.fragment.DealInformationFragment;
import appbuilder6a.trueyou6a.fragment.SummaryFragment;

public class DealInformationActivity extends AppCompatActivity {

    BottomNavigationView navigation;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.contentContainer);
            switch (item.getItemId()) {
                case R.id.navigation_back:
                    if (!(fragment instanceof DealInformationFragment)) {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.contentContainer, DealInformationFragment.newInstance())
                                .setCustomAnimations(
                                        R.anim.from_left, R.anim.to_right,
                                        R.anim.from_right, R.anim.to_left
                                )
                                .commit();
                        return true;
                    }
                    return true;
                case R.id.navigation_truepoint:
                    Toast.makeText(DealInformationActivity.this, "TruePoint : 20", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_saving:
                    if (!(fragment instanceof SummaryFragment)) {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.contentContainer, SummaryFragment.newInstance())
                                .setCustomAnimations(
                                        R.anim.from_right, R.anim.to_left,
                                        R.anim.from_left, R.anim.to_right
                                )
                                .commit();
                        return true;
                    }

                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_information);

        initInstancecs();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, DealInformationFragment.newInstance())
                    .commit();
        }


    }

    private void initInstancecs() {
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
