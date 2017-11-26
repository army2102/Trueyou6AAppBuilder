package appbuilder6a.trueyou6a.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.fragment.GachaponFragment;
import appbuilder6a.trueyou6a.fragment.GachaponOverlayFragment;

public class GachaponDiscountDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        initInstancecs();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, GachaponFragment.newInstance())
                    .add(R.id.contentContainer, GachaponOverlayFragment.newInstance())
                    .commit();
        }

    }

    private void initInstancecs() {
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
