package com.personal.liumn.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.personal.liumn.nightcat.R;


public class StartFragment extends Fragment {


    public StartFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onAttach(Activity act)
    {
        super.onAttach(act);
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
    }
}
