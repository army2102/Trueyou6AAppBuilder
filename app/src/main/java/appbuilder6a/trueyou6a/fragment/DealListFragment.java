package appbuilder6a.trueyou6a.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.activity.DealInformationActivity;
import appbuilder6a.trueyou6a.adapter.DealsListAdapter;


public class DealListFragment extends Fragment {

    private ListView listView;

    public DealListFragment() {
        super();
    }

    public static DealListFragment newInstance() {
        DealListFragment fragment = new DealListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_deal_list, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        listView = rootView.findViewById(R.id.listView);
        DealsListAdapter dealsListAdapter = new DealsListAdapter();
        listView.setAdapter(dealsListAdapter);


        listView.setOnItemClickListener(listViewItemClickListener);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }

    final AdapterView.OnItemClickListener listViewItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            if (i % 5 == 0) {
                Log.d("DealList", "0 At position: " + i);
                Intent intent = new Intent(getActivity(), DealInformationActivity.class);
                startActivity(intent);
            } else if (i % 5 == 1) {
                Log.d("DealList", "1 At position: " + i);
            } else if (i % 5 == 2) {
                Log.d("DealList", "2 At position: " + i);
            } else if (i % 5 == 3) {
                Log.d("DealList", "3 At position: " + i);
            } else if (i % 5 == 4) {
                Log.d("DealList", "4 At position: " + i);
            }


        }
    };


}
