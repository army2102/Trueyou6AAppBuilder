package appbuilder6a.trueyou6a.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.TrueyouApplication;
import appbuilder6a.trueyou6a.activity.MainActivity;


public class DealInformationLayoutOverlay extends Fragment implements View.OnClickListener {
    private ImageView ivCoinHeart;

    public DealInformationLayoutOverlay() {
        super();
    }

    public static DealInformationLayoutOverlay newInstance() {
        DealInformationLayoutOverlay fragment = new DealInformationLayoutOverlay();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_deal_information_layout_overlay, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        ivCoinHeart = rootView.findViewById(R.id.ivCoinHeart);
        ivCoinHeart.setOnClickListener(this);
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
        TrueyouApplication.pageStatus = 2;
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();
    }
}
