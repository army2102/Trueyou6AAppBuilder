package appbuilder6a.trueyou6a.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.adapter.DealsListAdapter;
import appbuilder6a.trueyou6a.adapter.HistorysListAdapter;


public class DealsFragment extends Fragment {

    private ListView listView;

    public DealsFragment() {
        super();
    }

    public static DealsFragment newInstance() {
        DealsFragment fragment = new DealsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_deals, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        listView = rootView.findViewById(R.id.listView);
        DealsListAdapter dealsListAdapter = new DealsListAdapter();
        listView.setAdapter(dealsListAdapter);
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
}
