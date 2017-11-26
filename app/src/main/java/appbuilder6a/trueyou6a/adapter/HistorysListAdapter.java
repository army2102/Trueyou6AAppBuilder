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
        return 3;
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
        if (i == 0) {
            if (view != null) {
                item = (HistoryListItem) view;
            } else {
                item = new HistoryListItem(viewGroup.getContext());
                item.setIvHistoryListItemDealContent(R.drawable.mock_deal_content_movie);
                item.setTvHistoryListItemDealName("Major Cineplex");
                item.setTvHistoryListItemDealDescription("ลูกค้าทรู รับส่วนลดตั๋วภาพยนต์ Justice League สูงสุด 30%");
            }

        } else if (i == 1) {
            if (view != null) {
                item = (HistoryListItem) view;
            } else {
                item = new HistoryListItem(viewGroup.getContext());
                item.setIvHistoryListItemDealContent(R.drawable.mock_deal_content_food);
                item.setTvHistoryListItemDealName("ปิ้งย่าง Paradise");
                item.setTvHistoryListItemDealDescription("ลูกค้าทรู BlackCard รับส่วนลดสูงสุด 20%");
            }

        } else {
            if (view != null) {
                item = (HistoryListItem) view;
            } else {
                item = new HistoryListItem(viewGroup.getContext());
                item.setIvHistoryListItemDealContent(R.drawable.mock_deal_content_coffee);
                item.setTvHistoryListItemDealName("COFFEE HAROCK");
                item.setTvHistoryListItemDealDescription("ลูกค้าทรู BlackCard รับส่วนลดสูงสุด 90%");
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
