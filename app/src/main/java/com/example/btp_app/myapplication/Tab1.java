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
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Amit garg on 1/24/2016.
 */
public class Tab1 extends Fragment {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Beverages");
        listDataHeader.add("Food");
        listDataHeader.add("Coming Soon..");

        // Adding child data
        List<String> Beverages = new ArrayList<String>();
        Beverages.add("The Shawshank Redemption");
        Beverages.add("The Godfather");
        Beverages.add("The Godfather: Part II");
        Beverages.add("Pulp Fiction");
        Beverages.add("The Good, the Bad and the Ugly");
        Beverages.add("The Dark Knight");
        Beverages.add("12 Angry Men");

        List<String> Food = new ArrayList<String>();
        Food.add("The Conjuring");
        Food.add("Despicable Me 2");
        Food.add("Turbo");
        Food.add("Grown Ups 2");
        Food.add("Red 2");
        Food.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), Beverages); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Food);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_1, container, false);
        expListView = (ExpandableListView) v.findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        return v;
    }

}
