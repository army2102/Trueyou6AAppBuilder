package appbuilder6a.trueyou6a.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.inthecheesefactory.thecheeselibrary.view.BaseCustomViewGroup;
import com.inthecheesefactory.thecheeselibrary.view.state.BundleSavedState;

import appbuilder6a.trueyou6a.R;


public class HistoryListItem extends BaseCustomViewGroup {
    private ImageView ivHistoryListItemDealContent;
    private TextView tvHistoryListItemDealName;
    private TextView tvHistoryListItemDealDescription;

    public void setIvHistoryListItemDealContent(Integer imageId) {
        this.ivHistoryListItemDealContent.setImageResource(imageId);
    }

    public void setTvHistoryListItemDealName(String text) {
        this.tvHistoryListItemDealName.setText(text);
    }

    public void setTvHistoryListItemDealDescription(String text) {
        this.tvHistoryListItemDealDescription.setText(text);
    }

    public HistoryListItem(Context context) {
        super(context);
        initInflate();
        initInstances();
    }

    public HistoryListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
        initInstances();
        initWithAttrs(attrs, 0, 0);
    }

    public HistoryListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
        initInstances();
        initWithAttrs(attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public HistoryListItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflate();
        initInstances();
        initWithAttrs(attrs, defStyleAttr, defStyleRes);
    }

    private void initInflate() {
        inflate(getContext(), R.layout.list_item_history, this);
    }

    private void initInstances() {
        // findViewById here
        ivHistoryListItemDealContent = findViewById(R.id.ivHistoryListItemDealContent);
        tvHistoryListItemDealName = findViewById(R.id.tvHistoryListItemDealName);
        tvHistoryListItemDealDescription = findViewById(R.id.tvHistoryListItemDealDescription);
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
        int height = width * 2 / 3;
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
