package com.example.btp_app.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

/**
 * Created by Amit garg on 2/7/2016.
 */
public class SelectOffer extends Fragment {
    MyAdapter2 myAdapter2;
    ListView listview;
    ArrayAdapter<String> adapter;
    String[] item_name = {"Tropicana(Select flavours)","Coca-Cola 6 can pack","Maggi Masala Noodles","Surf Excel Quick wash"};
    String[] item_quantity={"1 litre","330ml x 6 cans","4 x 98 gm super saver pack","1 kg pack"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static SelectOffer newInstance() {
        return new SelectOffer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.select_offer_on_bill, container, false);
        RecyclerView recList3 = (RecyclerView) v.findViewById(R.id.recyclerView3);
        RecyclerView recList4 = (RecyclerView) v.findViewById(R.id.recyclerView4);
        recList3.setHasFixedSize(true);
        recList4.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        LinearLayoutManager llm2 = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList3.setLayoutManager(llm);
        recList4.setLayoutManager(llm2);

        myAdapter2 = new MyAdapter2(Arrays.asList(item_name),Arrays.asList(item_quantity));

        recList3.setAdapter(myAdapter2);
        recList4.setAdapter(myAdapter2);
        return v;
    }
}
