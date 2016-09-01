package com.ks17.bucketdrops.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ks17.bucketdrops.R;

import java.util.ArrayList;

/**
 * Created by karthik90 on 9/1/2016.
 */
public class AdapterDrops extends RecyclerView.Adapter<AdapterDrops.Holder> {
    private LayoutInflater mInflator;
    private ArrayList<String> list = new ArrayList<>();

    public AdapterDrops(Context context) {
        mInflator = LayoutInflater.from(context);
        genVal();
    }

    public void genVal() {
        for (int i = 0; i < 100; i++)
            list.add(Integer.toString(i));

    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mInflator.inflate(R.layout.row_drop, parent, false);
        Holder holder = new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.mText.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public static class Holder extends RecyclerView.ViewHolder {
        TextView mText;

        public Holder(View itemView) {
            super(itemView);
            mText = (TextView) itemView.findViewById(R.id.row_goal_text);
        }
    }
}
