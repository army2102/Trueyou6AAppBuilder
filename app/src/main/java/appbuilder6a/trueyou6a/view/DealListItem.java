package appbuilder6a.trueyou6a.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.inthecheesefactory.thecheeselibrary.view.BaseCustomViewGroup;
import com.inthecheesefactory.thecheeselibrary.view.state.BundleSavedState;

import appbuilder6a.trueyou6a.R;


public class DealListItem extends BaseCustomViewGroup {

    private ImageView ivCustomViewGroupDealContent;
    private ImageView ivCustomViewGroupIconDealType;
    private ImageView ivCustomViewGroupIconRedCard;
    private ImageView ivCustomViewGroupIconBlackCard;
    private TextView tvCustomViewGroupDealType;
    private TextView tvCustomViewGroupDiscountPrice;
    private TextView tvCustomViewGroupDealName;
    private TextView tvCustomViewGroupDescription;
    private TextView tvCustomViewGroupDealLockDay;
    private TextView tvCustomViewGroupDealLockDescription;
    private LinearLayout linearLayoutCustomViewGroupSectionDealInformation;

    public void setTvCustomViewGroupDealLockDay(String text) {
        linearLayoutCustomViewGroupSectionDealInformation.setVisibility(INVISIBLE);
        this.tvCustomViewGroupDealLockDay.setVisibility(VISIBLE);
        this.tvCustomViewGroupDealLockDay.setText(text);
    }

    public void setTvCustomViewGroupDealLockDescription(String text) {
        linearLayoutCustomViewGroupSectionDealInformation.setVisibility(INVISIBLE);
        this.tvCustomViewGroupDealLockDescription.setVisibility(VISIBLE);
        this.tvCustomViewGroupDealLockDescription.setText(text);
    }

    public void setIvCustomViewGroupDealContent(Integer imageID) {
        this.ivCustomViewGroupDealContent.setImageResource(imageID);
    }

    public void setIvCustomViewGroupIconDealType(Integer imageID) {
        this.ivCustomViewGroupIconDealType.setImageResource(imageID);
    }

    public void setIvCustomViewGroupIconRedCard(boolean isOn) {
        if (isOn)
            this.ivCustomViewGroupIconRedCard.setVisibility(VISIBLE);
        else
            this.ivCustomViewGroupIconRedCard.setVisibility(INVISIBLE);
    }

    public void setIvCustomViewGroupIconBlackCard(boolean isOn) {
        if (isOn)
            this.ivCustomViewGroupIconBlackCard.setVisibility(VISIBLE);
        else
            this.ivCustomViewGroupIconBlackCard.setVisibility(INVISIBLE);
    }

    public void setTvCustomViewGroupDealType(String text) {
        this.tvCustomViewGroupDealType.setText(text);
    }

    public void setTvCustomViewGroupDiscountPrice(String text) {
        this.tvCustomViewGroupDiscountPrice.setText(text);
    }

    public void setTvCustomViewGroupDealName(String text) {
        this.tvCustomViewGroupDealName.setText(text);
    }

    public void setTvCustomViewGroupDescription(String text) {
        this.tvCustomViewGroupDescription.setText(text);
    }


    public DealListItem(Context context) {
        super(context);
        initInflate();
        initInstances();
    }

    public DealListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
        initInstances();
        initWithAttrs(attrs, 0, 0);
    }

    public DealListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
        initInstances();
        initWithAttrs(attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public DealListItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflate();
        initInstances();
        initWithAttrs(attrs, defStyleAttr, defStyleRes);
    }

    private void initInflate() {
        inflate(getContext(), R.layout.list_item_deal, this);
    }

    private void initInstances() {
        // findViewById here
        ivCustomViewGroupDealContent = findViewById(R.id.ivCustomViewGroupDealContent);
        ivCustomViewGroupIconDealType = findViewById(R.id.ivCustomViewGroupIconDealType);
        ivCustomViewGroupIconRedCard = findViewById(R.id.ivCustomViewGroupIconRedCard);
        ivCustomViewGroupIconBlackCard = findViewById(R.id.ivCustomViewGroupIconBlackCard);
        tvCustomViewGroupDealType = findViewById(R.id.tvCustomViewGroupDealType);
        tvCustomViewGroupDiscountPrice = findViewById(R.id.tvCustomViewGroupDiscountPrice);
        tvCustomViewGroupDealName = findViewById(R.id.tvCustomViewGroupDealName);
        tvCustomViewGroupDescription = findViewById(R.id.tvCustomViewGroupDescription);
        tvCustomViewGroupDealLockDay = findViewById(R.id.tvCustomViewGroupDealLockDay);
        tvCustomViewGroupDealLockDescription = findViewById(R.id.tvCustomViewGroupDealLockDescription);
        linearLayoutCustomViewGroupSectionDealInformation = findViewById(R.id.linearLayoutCustomViewGroupSectionDealInformation);
    }

    private void initWithAttrs(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        /*
        TypedArray a = getContext().getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.StyleableName,
                defStyleAttr, defStyleRes);

        try {

        } finally {
            a.recycle();
        }
        */
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();

        BundleSavedState savedState = new BundleSavedState(superState);
        // Save Instance State(s) here to the 'savedState.getBundle()'
        // for example,
        // savedState.getBundle().putString("key", value);

        return savedState;
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        BundleSavedState ss = (BundleSavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());

        Bundle bundle = ss.getBundle();
        // Restore State from bundle here
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = width * 2 / 5;
//        int height = width * 2 / 4;
        int newHieightMeasureSpec = MeasureSpec.makeMeasureSpec(
                height,
                MeasureSpec.EXACTLY
        );
        //child views
        super.onMeasure(widthMeasureSpec, newHieightMeasureSpec);
        // self
        setMeasuredDimension(width, height);
    }


}
