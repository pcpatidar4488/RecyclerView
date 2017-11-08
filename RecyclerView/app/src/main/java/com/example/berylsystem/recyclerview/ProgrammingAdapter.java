package com.example.berylsystem.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder>{

    private String[] data;
    Context context;
    public ProgrammingAdapter(String[] data,Context context){
        this.data=data;
        this.context=context;
    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);

        return new ProgrammingViewHolder(view);
    }
    
    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, final int position) {

        String title = data[position];
        holder.txtView.setText(title);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Click "+position, Toast.LENGTH_SHORT).show();
            }
        });

        return;
    }

    @Override
    public int getItemCount() {

        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtView;

        public ProgrammingViewHolder(View itemView) {

            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_icon);
            txtView = (TextView) itemView.findViewById(R.id.text_title);

            //itemView.setOnClickListener(this);

        }

       /* @Override
        public void onClick(View view) {

            Toast.makeText(context, "Clicking", Toast.LENGTH_SHORT).show();
        }*/
    }
}