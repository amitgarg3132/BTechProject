package com.example.btp_app.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Amit garg on 1/27/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContactViewHolder> {

    private List<String> contactList1,contactList2;

    public MyAdapter(List<String> contactList1,List<String> contactList2) {
        this.contactList1 = contactList1;
        this.contactList2 = contactList2;
    }

    @Override
    public int getItemCount() {
        return contactList1.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, int i) {
        contactViewHolder.textView.setText(contactList1.get(i));
        contactViewHolder.textView1.setText(contactList2.get(i));
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_view_tab1, viewGroup, false);

        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        private TextView textView,textView1;



        public ContactViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.item_title);
            textView1=(TextView)itemView.findViewById(R.id.item_quantity);
        }
    }
}