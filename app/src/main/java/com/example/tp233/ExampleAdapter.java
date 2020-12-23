package com.example.tp233;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExapleView> {
  private List<example> mexple;
  private Context co;
  private onNoteListnner monNoteListenner;
    public static class ExapleView extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView textview1;
        public TextView textview2;
        onNoteListnner noteListnner;
        public ExapleView(@NonNull View itemView, onNoteListnner onNoteListnner)  {
            super(itemView);
            textview1=(TextView) itemView.findViewById(R.id.textView);
            textview2=(TextView) itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(this);
            this.noteListnner=onNoteListnner;
        }

        @Override
        public void onClick(View view) {
            noteListnner.onNoteClick(getAdapterPosition(),view);


        }
    }
    public ExampleAdapter (ArrayList<example> exampleList,Context c ,onNoteListnner onNoteListnner){mexple=exampleList;co=c;this.monNoteListenner=onNoteListnner;}

    @NonNull
    @Override
    public ExapleView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //definition item
        View v= LayoutInflater.from(co).inflate(R.layout.activity_example,parent,false);
        ExapleView evh=new ExapleView(v,monNoteListenner);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExapleView holder, int position) {
        //envoi data
example currentItem=mexple.get(position);
holder.textview2.setText(currentItem.getText2());
        holder.textview1.setText(currentItem.getText1());

    }

    @Override
    public int getItemCount() {
        return mexple.size();
    }

public interface onNoteListnner{
        void onNoteClick(int position,View v);
}

}
