package com.example.vendor_app;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vendor_app.AboutUS.AboutUs;
import com.example.vendor_app.FeedbackPage.feedbackPage;
import com.example.vendor_app.Help_And_Support.Disclaimer;
import com.example.vendor_app.Help_And_Support.Help;
import com.example.vendor_app.Help_And_Support.Help_and_Support;
import com.example.vendor_app.Help_And_Support.Previous_Orders;
import com.example.vendor_app.Help_And_Support.Terms_and_Conditions;
import com.example.vendor_app.Sp_Technical_Support.Technical_Support_01;
import com.example.vendor_app.Transaction_History.Transaction_details_02;
import com.example.vendor_app.Sp_Technical_Support.call_02;

public class MainActivity extends AppCompatActivity {

    private Button btnClitransaction_details_02,sp_technical_Support_call_02,sp_technical_Support_call_01;
    Button feedbaclForm,btn_aboutUs, btn_help_and_support,btn_previousOrdes,btn_Help,btn_terms_and_conditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClitransaction_details_02 = findViewById(R.id.btn_transaction_detaiols_02);
        sp_technical_Support_call_02 = findViewById(R.id.btn_sp_technical_call_02);
        sp_technical_Support_call_01 = findViewById(R.id.btn_sp_technical_call_01);
        feedbaclForm = findViewById(R.id.btn_feedback);
        btn_aboutUs  = findViewById(R.id.btn_about_us);
        btn_help_and_support = findViewById(R.id.btn_help_and_support);
        btn_previousOrdes = findViewById(R.id.btn_previousOrders);
        btn_Help = findViewById(R.id.btn_Help);
        btn_terms_and_conditions = findViewById(R.id.btn_terms_and_conditions);

        btn_terms_and_conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tandCIntent = new Intent(MainActivity.this, Terms_and_Conditions.class);
                startActivity(tandCIntent);
            }
        });

        btnClitransaction_details_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent transsaction_details_02 = new Intent(MainActivity.this, Transaction_details_02.class);
                startActivity(transsaction_details_02);
            }
        });

        sp_technical_Support_call_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent transsaction_details_02 = new Intent(MainActivity.this,call_02.class);
                startActivity(transsaction_details_02);
            }
        });

        sp_technical_Support_call_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent technicalSupport_01 = new Intent(MainActivity.this, Technical_Support_01.class);
                startActivity(technicalSupport_01);
            }
        });

        feedbaclForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent feedbackIntent = new Intent(MainActivity.this, feedbackPage.class);
                startActivity(feedbackIntent);
            }
        });

        btn_aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent feedbackIntent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(feedbackIntent);
            }
        });

        btn_help_and_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent needHelpIntent = new Intent(MainActivity.this, Help_and_Support.class);
                startActivity(needHelpIntent);
            }
        });

        btn_previousOrdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent previousOrderIntent = new Intent(MainActivity.this, Previous_Orders.class);
                startActivity(previousOrderIntent);
            }
        });

        btn_Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent helpIntent = new Intent(MainActivity.this, Help.class);
                startActivity(helpIntent);
            }
        });
    }
}
