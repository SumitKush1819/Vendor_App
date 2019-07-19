package com.example.vendor_app.Sp_Technical_Support;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vendor_app.R;

import java.util.ArrayList;

public class New_calls_fragment extends Fragment {

    private RecyclerView newcall_RecycleView;
    private RecyclerView.Adapter callAdapter;
    private View mMainView;

    public New_calls_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mMainView =  inflater.inflate(R.layout.fragment_new_calls, container, false);

        ArrayList<newCallsData> list = initCarData();

        newcall_RecycleView = mMainView.findViewById(R.id.newCalls_RecycleView);
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(getContext());
        newcall_RecycleView.setLayoutManager(mlayoutManager);

        callAdapter = new newCallsAdapter(list);
        newcall_RecycleView.setAdapter(callAdapter);

        return mMainView;
    }

    private ArrayList<newCallsData> initCarData(){

        ArrayList<newCallsData> list = new ArrayList<>();

        list.add(new newCallsData("Wagon R","DL1PB3201","Mechanical Fault","9864531286",R.drawable.s_vehicle));
        list.add(new newCallsData("Wagon R","DL1PB3201","Mechanical Fault","9864531286",R.drawable.s_vehicle));

        return list;

    }

}
