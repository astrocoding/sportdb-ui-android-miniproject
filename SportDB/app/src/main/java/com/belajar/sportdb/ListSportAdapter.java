package com.belajar.sportdb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSportAdapter extends RecyclerView.Adapter<ListSportAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Sport> listSport;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListSportAdapter(ArrayList<Sport> list){
        this.listSport = list;
    }

    @NonNull
    @Override
    public ListSportAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_sport, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListSportAdapter.ListViewHolder holder, int position) {
        Sport sport = listSport.get(position);
        Glide.with(holder.itemView.getContext()).load(sport.getPhoto()).apply(new RequestOptions().override(55, 55)).into(holder.imgPhoto);
        holder.tvName.setText(sport.getName());
        holder.tvDetail.setText(sport.getDetail());
        holder.tvDesc.setText(sport.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailSportAdapter.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", sport.getName());
                bundle.putString("detail", sport.getDetail());
                bundle.putString("desc", sport.getDesc());
                bundle.putString("link", sport.getLink());
                bundle.putInt("photo", sport.getPhoto());
                intent.putExtras(bundle);
                context.startActivity(intent);
                Toast.makeText(holder.itemView.getContext(), "" + listSport.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return listSport.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Sport data);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvDesc;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);

        }
    }
}
