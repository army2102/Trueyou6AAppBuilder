package appbuilder6a.trueyou6a.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.activity.CouponActivity;
import appbuilder6a.trueyou6a.activity.MainActivity;


public class CouponFragment extends Fragment implements View.OnClickListener {

    private Button btnConfirmCoupon;

    public CouponFragment() {
        super();
    }

    public static CouponFragment newInstance() {
        CouponFragment fragment = new CouponFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_coupon, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        btnConfirmCoupon = rootView.findViewById(R.id.btnConfirmCoupon);
        btnConfirmCoupon.setOnClickListener(this);
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
        if (view == btnConfirmCoupon){
            Intent intent = new Intent(getActivity(), CouponActivity.class);
            startActivity(intent);
        }
    }
}
