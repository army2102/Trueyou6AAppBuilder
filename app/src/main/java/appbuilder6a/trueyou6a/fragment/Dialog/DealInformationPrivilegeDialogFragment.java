package appbuilder6a.trueyou6a.fragment.Dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.fragment.DealInformationLayoutOverlay;


public class DealInformationPrivilegeDialogFragment extends DialogFragment {
    private ImageView ivCodeImage;
    private TextView tvOneTwoThree;
    private BottomNavigationView navigation;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigationQrCode:
                    tvOneTwoThree.setVisibility(View.INVISIBLE);
                    ivCodeImage.setImageResource(R.drawable.mock_qrcode);
                    ivCodeImage.setVisibility(View.VISIBLE);
                    return true;
                case R.id.navigationNumberCode:
                    ivCodeImage.setVisibility(View.INVISIBLE);
                    tvOneTwoThree.setVisibility(View.VISIBLE);
                    return true;
                case R.id.navigationBarCode:
                    tvOneTwoThree.setVisibility(View.INVISIBLE);
                    ivCodeImage.setImageResource(R.drawable.mock_barcode);
                    ivCodeImage.setVisibility(View.VISIBLE);
                    return true;
            }
            return false;
        }
    };



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View rootView = inflater.inflate(R.layout.dialog_privilege, null);

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(rootView);
        ivCodeImage = rootView.findViewById(R.id.ivCodeImage);
        tvOneTwoThree = rootView.findViewById(R.id.tvOneTwoThree);
        navigation = rootView.findViewById(R.id.navigationGetDealChoice);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        ivCodeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                getFragmentManager().beginTransaction()
                        .add(R.id.contentContainer, DealInformationLayoutOverlay.newInstance())
                        .commit();
            }
        });



        // Add action buttons
//                .setPositiveButton(R.string.signin, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int id) {
//                        // sign in the user ...
//                    }
//                })
//                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        LoginDialogFragment.this.getDialog().cancel();
//                    }
//                });
        return builder.create();
    }
}
