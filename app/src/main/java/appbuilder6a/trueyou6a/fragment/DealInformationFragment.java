package appbuilder6a.trueyou6a.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.fragment.Dialog.DealInformationPrivilegeDialogFragment;
import appbuilder6a.trueyou6a.fragment.Dialog.PrivilegeDialogFragment;


public class DealInformationFragment extends Fragment implements View.OnClickListener {

    Button btnAcceptPrivilege;


    public DealInformationFragment() {
        super();
    }

    public static DealInformationFragment newInstance() {
        DealInformationFragment fragment = new DealInformationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_deal_information, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        btnAcceptPrivilege = rootView.findViewById(R.id.btnAcceptPrivilege);
        btnAcceptPrivilege.setOnClickListener(this);



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

    @Override
    public void onClick(View view) {

        if (view == btnAcceptPrivilege) {
            DealInformationPrivilegeDialogFragment dialog = new DealInformationPrivilegeDialogFragment();
            dialog.show(getFragmentManager(), "DealInformationFragment");

        }
    }
}
