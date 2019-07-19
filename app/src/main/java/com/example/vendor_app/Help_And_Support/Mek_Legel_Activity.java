package com.example.vendor_app.Help_And_Support;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.vendor_app.MainActivity;
import com.example.vendor_app.R;

public class Mek_Legel_Activity extends AppCompatActivity {

    private TextView txtdisclaimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mek__legel_);

        txtdisclaimer = findViewById(R.id.disclaimer);

        txtdisclaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent disclaimIntent = new Intent(Mek_Legel_Activity.this, Disclaimer.class);
                startActivity(disclaimIntent);
            }
        });


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>Order #123</font>"));

        final Drawable upArrow =  ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_black_24dp);
        upArrow.setColorFilter(ContextCompat.getColor(this, R.color.red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
    }
}
