package com.example.nikeshop.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.nikeshop.Adapter.SneakerAdapter;
import com.example.nikeshop.InfoActivity;
import com.example.nikeshop.Model.sneaker;
import com.example.nikeshop.R;

import java.util.ArrayList;
import java.util.List;


public class ProductListFragment extends Fragment {

    public ProductListFragment() {
        // Required empty public constructor
    }

    List<sneaker> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_list, container, false);
        GridView gridView = view.findViewById(R.id.gridView);
        list = new ArrayList<>();
        list.add(new sneaker(R.drawable.image_3, "Nike", "Air Force 1 Shadow Beige Pale Ivory", 115.0));
        list.add(new sneaker(R.drawable.image_3, "Nike", "Air Force 1 Shadow Beige Pale Ivory", 115.0));
        list.add(new sneaker(R.drawable.image_3, "Nike", "Air Force 1 Shadow Beige Pale Ivory", 115.0));
        list.add(new sneaker(R.drawable.image_3, "Nike", "Air Force 1 Shadow Beige Pale Ivory", 115.0));
        list.add(new sneaker(R.drawable.image_3, "Nike", "Air Force 1 Shadow Beige Pale Ivory", 115.0));
        list.add(new sneaker(R.drawable.image_3, "Nike", "Air Force 1 Shadow Beige Pale Ivory", 115.0));

        SneakerAdapter adapter = new SneakerAdapter(list);
        gridView.setAdapter(adapter);
        return view;
    }
}