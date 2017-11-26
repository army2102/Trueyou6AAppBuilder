package appbuilder6a.trueyou6a.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.TrueyouApplication;
import appbuilder6a.trueyou6a.activity.MainActivity;
import appbuilder6a.trueyou6a.fragment.Dialog.PrivilegeDialogFragment;


public class GachaponOverlayFragment extends Fragment implements View.OnClickListener {
    private ImageView ivGetDivcount;
    private LinearLayout linearLayoutDealSection;
    private Button btnUseDeal;
    private ImageView ivKeepDeal;

    public GachaponOverlayFragment() {
        super();
    }

    public static GachaponOverlayFragment newInstance() {
        GachaponOverlayFragment fragment = new GachaponOverlayFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gachapon_layout_overlay, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        ivGetDivcount = rootView.findViewById(R.id.ivGetDivcount);
        linearLayoutDealSection = rootView.findViewById(R.id.linearLayoutDealSection);
        btnUseDeal = rootView.findViewById(R.id.btnUseDeal);
        ivKeepDeal = rootView.findViewById(R.id.ivKeepDeal);
        ivGetDivcount.setOnClickListener(this);
        btnUseDeal.setOnClickListener(this);
        ivKeepDeal.setOnClickListener(this);
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
        if (view == ivGetDivcount) {
            ivGetDivcount.setVisibility(View.GONE);
            linearLayoutDealSection.setVisibility(View.VISIBLE);
        }

        else  if (view == btnUseDeal) {
            PrivilegeDialogFragment privilegeDialogFragment = new PrivilegeDialogFragment();
            privilegeDialogFragment.show(getFragmentManager(), "GachaponOverlayFragment");

        } else if (view == ivKeepDeal) {
            TrueyouApplication.pageStatus = 1;
            Intent intent = new Intent(getActivity(), MainActivity.class);
            startActivity(intent);
            getActivity().finish();
        }


    }
}
