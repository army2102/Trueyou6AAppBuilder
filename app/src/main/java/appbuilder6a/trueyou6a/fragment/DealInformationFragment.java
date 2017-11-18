package appbuilder6a.trueyou6a.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.fragment.Dialog.PrivilegeDialogFragment;


public class DealInformationFragment extends Fragment implements View.OnClickListener {

    Button btnAcceptPrivilege1;
    Button btnAcceptPrivilege2;
    Button btnAcceptPrivilege3;

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
        btnAcceptPrivilege1 = rootView.findViewById(R.id.btnAcceptPrivilege1);
        btnAcceptPrivilege2 = rootView.findViewById(R.id.btnAcceptPrivilege2);
        btnAcceptPrivilege3 = rootView.findViewById(R.id.btnAcceptPrivilege3);

        btnAcceptPrivilege1.setOnClickListener(this);
        btnAcceptPrivilege2.setOnClickListener(this);
        btnAcceptPrivilege3.setOnClickListener(this);


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

        if (view == btnAcceptPrivilege1) {
            PrivilegeDialogFragment privilegeDialogFragment = new PrivilegeDialogFragment();
            privilegeDialogFragment.show(getFragmentManager(), "privilegeDialogFragment");

        } else if (view == btnAcceptPrivilege2) {
            PrivilegeDialogFragment privilegeDialogFragment = new PrivilegeDialogFragment();
            privilegeDialogFragment.show(getFragmentManager(), "privilegeDialogFragment");
        } else if (view == btnAcceptPrivilege3) {
            PrivilegeDialogFragment privilegeDialogFragment = new PrivilegeDialogFragment();
            privilegeDialogFragment.show(getFragmentManager(), "privilegeDialogFragment");
        }

    }
}
