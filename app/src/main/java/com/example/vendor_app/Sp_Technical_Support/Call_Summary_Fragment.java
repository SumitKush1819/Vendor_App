package com.example.vendor_app.Sp_Technical_Support;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vendor_app.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Call_Summary_Fragment extends Fragment {

    private RecyclerView callSummary_RecycleView;
    private RecyclerView.Adapter callSummaryAdapter;
    private View mMainView;

    public Call_Summary_Fragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,Bundle savedInstanceState) {

        mMainView =  inflater.inflate(R.layout.fragment_call__summary, container, false);

        ArrayList<CallSummaryData> list = initCarData();

        callSummary_RecycleView = mMainView.findViewById(R.id.callSummary_RecycleView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        callSummary_RecycleView.setLayoutManager(layoutManager);

        callSummaryAdapter = new CallSummaryAdapter(list);
        callSummary_RecycleView.setAdapter(callSummaryAdapter);

        return mMainView;
    }

    private ArrayList<CallSummaryData> initCarData(){

        ArrayList<CallSummaryData> list = new ArrayList<>();

        list.add(new CallSummaryData("Wagon R","DL1PB3201","Mechanical Fault","9864531286",R.drawable.s_vehicle));
        list.add(new CallSummaryData("Wagon R","DL1PB3201","Mechanical Fault","9864531286",R.drawable.s_vehicle));

        return list;

    }


}
