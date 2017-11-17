package appbuilder6a.trueyou6a.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.fragment.SearchFragment;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, SearchFragment.newInstance())
                    .commit();
        }
    }
}
