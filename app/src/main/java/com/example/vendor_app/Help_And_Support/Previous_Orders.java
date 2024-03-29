package com.example.vendor_app.Help_And_Support;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;

import com.example.vendor_app.R;

import java.util.ArrayList;

public class Previous_Orders extends AppCompatActivity {

    private RecyclerView previousOrderRecyclerView;
    private RecyclerView.Adapter preAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous__orders);

        ArrayList<PreviousOrdersData> list = initCarData();

        previousOrderRecyclerView = findViewById(R.id.previousOrderRecyclerView);
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(this);
        previousOrderRecyclerView.setLayoutManager(mlayoutManager);

        preAdapter = new Previous_order_adapter(list);
        previousOrderRecyclerView.setAdapter(preAdapter);

        //Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>Previous Orders</font>"));

        final Drawable upArrow =  ContextCompat.getDrawable(this, R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(ContextCompat.getColor(this, R.color.red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
    }

    private ArrayList<PreviousOrdersData> initCarData(){

        ArrayList<PreviousOrdersData> list = new ArrayList<>();

        list.add(new PreviousOrdersData("Wagonar R","DL1PB3201","Denting Painting","Service Completed",R.drawable.maruti_suzuki_logo,R.drawable.denting_panting));
        list.add(new PreviousOrdersData("Audi","DL1PB3201","Car Wash","Service Completed",R.drawable.audi_logo,R.drawable.flat_tyre));
        list.add(new PreviousOrdersData("Audi","DL1PB3201","Flat Tyre","Service Cancelled",R.drawable.audi_logo,R.drawable.flat_tyre));

        return list;

    }
}
