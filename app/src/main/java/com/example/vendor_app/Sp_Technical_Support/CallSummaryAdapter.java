package com.example.vendor_app.Sp_Technical_Support;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vendor_app.R;

import java.util.ArrayList;

public class CallSummaryAdapter extends RecyclerView.Adapter<CallSummaryAdapter.ViewHolder> {

    private ArrayList<CallSummaryData> callSummaryData;

    public CallSummaryAdapter(ArrayList<CallSummaryData> callSummaryData) {
        this.callSummaryData = callSummaryData;
    }

    @NonNull
    @Override
    public CallSummaryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_summary_item, parent, false);
        return new CallSummaryAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CallSummaryAdapter.ViewHolder holder, int position) {

        CallSummaryData cardata = callSummaryData.get(position);

        holder.cs_carModel.setText(cardata.getCarModel());
        holder.cs_reason.setText(cardata.getReason());
        holder.cs_numberPlate.setText(cardata.getNumberPlate());
        holder.cs_contactNumber.setText(cardata.getContactNumber());

        holder.cs_carImg.setImageResource(cardata.getCarImg());

    }

    @Override
    public int getItemCount() {
        if (callSummaryData != null) {
            return callSummaryData.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView cs_carModel,cs_numberPlate,cs_reason,cs_contactNumber;
        public ImageView cs_carImg;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            cs_carModel = view.findViewById(R.id.cs_carModel);
            cs_numberPlate = view.findViewById(R.id.cs_NumberPlate);
            cs_reason = view.findViewById(R.id.cs_reason);
            cs_carImg = view.findViewById(R.id.cs_carImg);
            cs_contactNumber = view.findViewById(R.id.cs_contactNumber);
        }
    }
}
