package com.lianxi.zy.myrookie.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lianxi.zy.myrookie.R;

/**
 * Created by jiajiajia on 2017/12/19.
 */

public class FragmentFive extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.f5,null);
        return view;
    }
}
