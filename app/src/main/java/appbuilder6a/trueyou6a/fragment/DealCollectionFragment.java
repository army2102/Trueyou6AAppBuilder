package appbuilder6a.trueyou6a.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.activity.DealInformationActivity;
import appbuilder6a.trueyou6a.adapter.DealsCollectionAdapter;
import appbuilder6a.trueyou6a.adapter.DealsListAdapter;
import appbuilder6a.trueyou6a.fragment.Dialog.PrivilegeDialogFragment;


public class DealCollectionFragment extends Fragment {

    private ListView listView;

    public DealCollectionFragment() {
        super();
    }

    public static DealCollectionFragment newInstance() {
        DealCollectionFragment fragment = new DealCollectionFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_deal_collection, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        listView = rootView.findViewById(R.id.listView);
        DealsCollectionAdapter dealsCollectionAdapter = new DealsCollectionAdapter();
        listView.setAdapter(dealsCollectionAdapter);


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
            PrivilegeDialogFragment privilegeDialogFragment = new PrivilegeDialogFragment();
            privilegeDialogFragment.show(getFragmentManager(), "dealCollection");
        }
    };


}
