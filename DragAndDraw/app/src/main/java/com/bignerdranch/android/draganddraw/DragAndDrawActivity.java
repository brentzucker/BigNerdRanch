package com.bignerdranch.android.draganddraw;

import android.support.v4.app.Fragment;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}