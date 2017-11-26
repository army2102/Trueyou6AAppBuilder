package appbuilder6a.trueyou6a.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;

import appbuilder6a.trueyou6a.R;
import appbuilder6a.trueyou6a.view.DealListItem;

/**
 * Created by Naetirat on 11/9/2017.
 */

public class DealsCollectionAdapter extends BaseAdapter {

    int lastPosition = -1;

    @Override
    public int getCount() {
        return 4;
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
        DealListItem item;
        if (i == 0) {

            item = new DealListItem(viewGroup.getContext());
            item.setIvCustomViewGroupDealContent(R.drawable.mock_deal_content_coffee);
            item.setIvCustomViewGroupIconBlackCard(true);
            item.setIvCustomViewGroupIconRedCard(true);
            item.setIvCustomViewGroupIconDealType(R.drawable.ic_discount_type_food);
            item.setTvCustomViewGroupDealType("รับส่วนลด");
            item.setTvCustomViewGroupDiscountPrice("90%");
            item.setTvCustomViewGroupDealName("COFFEE HAROCK");
            item.setTvCustomViewGroupDescription("ลูกค้าทรู BlackCard รับส่วนลดสูงสุด 90%");


        } else if (i == 1) {

            item = new DealListItem(viewGroup.getContext());
            item.setIvCustomViewGroupDealContent(R.drawable.mock_deal_content_coffee);
            item.setIvCustomViewGroupIconBlackCard(true);
            item.setIvCustomViewGroupIconRedCard(true);
            item.setIvCustomViewGroupIconDealType(R.drawable.ic_discount_type_food);
            item.setTvCustomViewGroupDealType("รับฟรี");
            item.setTvCustomViewGroupDiscountPrice("1แถม1");
            item.setTvCustomViewGroupDealName("COFFEE HAROCK");
            item.setTvCustomViewGroupDescription("ลูกค้าทรู BlackCard รับส่วนลดสูงสุด 90%");


        } else if (i == 2) {

            item = new DealListItem(viewGroup.getContext());
            item.setIvCustomViewGroupDealContent(R.drawable.mock_deal_content_movie);
            item.setIvCustomViewGroupIconBlackCard(false);
            item.setIvCustomViewGroupIconRedCard(false);
            item.setIvCustomViewGroupIconDealType(R.drawable.ic_discount_type_movie);
            item.setTvCustomViewGroupDealType("รับส่วนลด");
            item.setTvCustomViewGroupDiscountPrice("30%");
            item.setTvCustomViewGroupDealName("Major Cineplex");
            item.setTvCustomViewGroupDescription("ลูกค้าทรู รับส่วนลดตั๋วภาพยนต์ Justice League สูงสุด 30%");


        } else {

            item = new DealListItem(viewGroup.getContext());
            item.setIvCustomViewGroupDealContent(R.drawable.mock_deal_content_food);
            item.setIvCustomViewGroupIconBlackCard(true);
            item.setIvCustomViewGroupIconRedCard(true);
            item.setIvCustomViewGroupIconDealType(R.drawable.ic_discount_type_food);
            item.setTvCustomViewGroupDealType("รับส่วนลด");
            item.setTvCustomViewGroupDiscountPrice("20%");
            item.setTvCustomViewGroupDealName("ปิ้งย่าง Paradise");
            item.setTvCustomViewGroupDescription("ลูกค้าทรู BlackCard รับส่วนลดสูงสุด 20%");


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
