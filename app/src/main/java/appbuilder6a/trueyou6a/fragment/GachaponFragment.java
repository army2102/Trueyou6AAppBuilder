package appbuilder6a.trueyou6a.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import appbuilder6a.trueyou6a.R;


public class GachaponFragment extends Fragment implements View.OnClickListener {

    private Button btnConfirmCoupon;

    public GachaponFragment() {
        super();
    }

    public static GachaponFragment newInstance() {
        GachaponFragment fragment = new GachaponFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gachapon, container, false);
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
        if (view == btnConfirmCoupon) {
            getFragmentManager().beginTransaction()
                    .setCustomAnimations(
                            R.anim.from_right, R.anim.to_left,
                            R.anim.from_left, R.anim.to_right
                    )
                    .replace(R.id.contentContainer, GachaponFinishFragment.newInstance())
                    .commit();
        }
    }
}
