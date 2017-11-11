package appbuilder6a.trueyou6a.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.view.HistoryListItem;

/**
 * Created by Naetirat on 11/9/2017.
 */

public class HistorysListAdapter extends BaseAdapter {
    private int lastPosition = -1;

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
    public View getView(int i, View view, ViewGroup viewGroup) {
        HistoryListItem item;
        if (view != null) {
            item = (HistoryListItem) view;
        } else {
            item = new HistoryListItem(viewGroup.getContext());
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
