package appbuilder6a.trueyou6a.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import appbuilder6a.trueyou6a.view.HistoryListItem;

/**
 * Created by Naetirat on 11/9/2017.
 */

public class HistoryListAdapter extends BaseAdapter {
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
        return item;
    }
}
