package appbuilder6a.trueyou6a.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.view.DealListItem;
import appbuilder6a.trueyou6a.view.HistoryListItem;

/**
 * Created by Naetirat on 11/9/2017.
 */

public class DealsListAdapter extends BaseAdapter {

    int lastPosition = -1;

    @Override
    public int getCount() {
        return 10000;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? 0 : 1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        DealListItem item;
        if (getItemViewType(i) == 0) {
            if (view != null) {
                item = (DealListItem) view;
            } else {
                item = new DealListItem(viewGroup.getContext());
                item.setTvDayDiscount("15%");
            }

        } else {
            if (view != null) {
                item = (DealListItem) view;
            } else {
                item = new DealListItem(viewGroup.getContext());
                item.setIvImg(R.drawable.mock_lock2);
                item.setTvDiscount("80%");
                item.setTvDayDiscount("M");
            }
        }

        if (i > lastPosition) {
            Animation anim = AnimationUtils.loadAnimation(viewGroup.getContext(),
                    R.anim.up_from_bottom);
            item.startAnimation(anim);
            lastPosition = i;
        }

        return item;

    }
}
