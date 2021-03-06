package com.yuehai.android.main.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.yuehai.android.common.base.BaseFragment;
import com.yuehai.android.main.R;
import com.yuehai.android.main.contract.ChannelContract;

/**
 * 频道
 * Created by 月海 on 2018/4/20.
 */

public class ChannelFragment extends BaseFragment implements ChannelContract.ChannelView {
    @Override
    protected int getViewResource() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        TextView home_tv = findViewById(R.id.home_tv);
        home_tv.setText("频道");
    }

    @Override
    public void changeTheme(int themeType) {

    }

    @Override
    public void showErrorView() {

    }

    @Override
    public void showEmptyView() {

    }

    @Override
    public void showLoadingView() {

    }
}
