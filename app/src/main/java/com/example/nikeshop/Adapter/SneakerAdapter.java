package com.example.nikeshop.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.nikeshop.InfoActivity;
import com.example.nikeshop.Model.sneaker;
import com.example.nikeshop.R;

import java.util.List;

public class SneakerAdapter extends BaseAdapter {
    List<sneaker> list;

    public SneakerAdapter(List<sneaker> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class viewSnaker {
        ImageView imageView;
        TextView txtName, txtGhichu, txtPrice;
        FrameLayout frameLayout;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        viewSnaker holder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (view == null) {
            view = inflater.inflate(R.layout.sneaker_layout, null);
            holder = new viewSnaker();
            holder.imageView = view.findViewById(R.id.imgSnaker);
            holder.txtName = view.findViewById(R.id.txtName);
            holder.txtGhichu = view.findViewById(R.id.txtGhichu);
            holder.txtPrice = view.findViewById(R.id.txtPrice);
            holder.frameLayout = view.findViewById(R.id.productItem);
            view.setTag(holder);
        } else {
            holder = (viewSnaker) view.getTag();
        }
        sneaker s = list.get(position);
        holder.imageView.setImageResource(s.getHinh());
        holder.txtName.setText(s.getName());
        holder.txtGhichu.setText(s.getGhichu());
        holder.txtPrice.setText("$" + String.valueOf(s.getPrice()));
        holder.frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parent.getContext(), InfoActivity.class);
                parent.getContext().startActivity(intent);
            }
        });
        return view;
    }
}
