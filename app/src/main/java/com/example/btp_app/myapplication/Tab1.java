package com.example.btp_app.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

/**
 * Created by Amit garg on 1/24/2016.
 */
public class Tab1 extends Fragment {
    MyAdapter myAdapter;
    ListView listview;
    ArrayAdapter<String> adapter;
    String[] item_name = {"Tropicana(Select flavours)","Coca-Cola 6 can pack","Maggi Masala Noodles","Surf Excel Quick wash"};
    String[] item_quantity={"1 litre","330ml x 6 cans","4 x 98 gm super saver pack","1 kg pack"};
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_1, container, false);
        RecyclerView recList = (RecyclerView) v.findViewById(R.id.recyclerView1);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        myAdapter = new MyAdapter(Arrays.asList(item_name),Arrays.asList(item_quantity));

        recList.setAdapter(myAdapter);
        return v;
    }

}
