package com.ZiMax;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private List<RecyclerViewItem> listViewItem;


    public RecyclerViewAdapter(List<RecyclerViewItem> listAdapter) {
        this.listViewItem = listAdapter;
    }

    public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewInCard);
            textView1 = itemView.findViewById(R.id.textViewInCard1);
            textView2 = itemView.findViewById(R.id.textViewInCard2);

        }
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card, parent, false);

        return new RecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {

        RecyclerViewItem recyclerViewItem = listViewItem.get(position);

        holder.imageView.setImageResource(recyclerViewItem.getImageResource());
        holder.textView1.setText(recyclerViewItem.getText1());
        holder.textView2.setText(recyclerViewItem.getText2());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SecondActivity.class);
                intent.putExtra("image", recyclerViewItem.getImageResource());
                intent.putExtra("mainText", recyclerViewItem.getText1());
                intent.putExtra("moreText", recyclerViewItem.getText3());

                intent.putExtra(SecondActivity.EXTRA_POS, position);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listViewItem.size();
    }


}



