package com.example.vendor_app.Transaction_History;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.example.vendor_app.R;

public class Transaction_details_02 extends AppCompatActivity {

    private TextView subTotal, tax, additional_charges,total;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details_02);


        subTotal = findViewById(R.id.rupee_subTotal);
        tax = findViewById(R.id.rupeeTax);
        additional_charges = findViewById(R.id.rupeeAdditionalCharges);
        total = findViewById(R.id.rupeeTotal);

        subTotal.setText("\u20B9"+ "3,200");
        tax.setText("\u20B9"+ "200");
        additional_charges.setText("\u20B9"+ "100");
        total.setText("\u20B9"+ "200");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>Order #123</font>"));

        final Drawable upArrow =  ContextCompat.getDrawable(this, R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(ContextCompat.getColor(this, R.color.red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.transaction_details_02_menu,menu);
        menu.findItem(R.id.trackOrder).setTitle(Html.fromHtml("<font color='#c1bfbf'>Track Order</font>"));
        return true;
    }
}
