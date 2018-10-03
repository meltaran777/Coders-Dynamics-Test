package com.fil.githubapiexample.screens.base;

import android.support.annotation.StringRes;

public interface IBaseActivity {
    void setupTitle(String title);

    void setupTitle(@StringRes int resId);

    void enableBackButton();
}
