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

public class newCallsAdapter extends RecyclerView.Adapter<newCallsAdapter.ViewHolder> {

    private ArrayList<newCallsData> carData;

    public newCallsAdapter(ArrayList<newCallsData> carData) {
        this.carData = carData;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_calls_items, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        newCallsData cardata = carData.get(position);

        holder.carModel.setText(cardata.getCarModel());
        holder.reason.setText(cardata.getReason());
        holder.numberPlate.setText(cardata.getNumberPlate());
        holder.contactNumber.setText(cardata.getContactNumber());

        holder.carImg.setImageResource(cardata.getCarImg());

    }

    @Override
    public int getItemCount() {
        if (carData != null) {
            return carData.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView carModel,numberPlate,reason,contactNumber;
        public ImageView carImg;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            carModel = view.findViewById(R.id.carModel);
            numberPlate = view.findViewById(R.id.NumberPlate);
            reason = view.findViewById(R.id.reason);
            carImg = view.findViewById(R.id.carImg);
            contactNumber = view.findViewById(R.id.contactNumber);
        }
    }
}
