package com.example.letters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LetterAdapter extends RecyclerView.Adapter<LetterAdapter.MyViewHolder>{

    Context context;

    ArrayList<Letter> letterList;


    public LetterAdapter(Context context, ArrayList<Letter> letterList) {
        this.context = context;
        this.letterList = letterList;
    }

    @NonNull
    @Override
    public LetterAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.letter_model, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LetterAdapter.MyViewHolder holder, int position) {
        holder.index_letter.setText("Номер буквы " + letterList.get(position).getIndex());
        holder.char_letter.setText("Буква " +letterList.get(position).getLetter());
    }

    @Override
    public int getItemCount() {
        return letterList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView index_letter, char_letter;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            index_letter = itemView.findViewById(R.id.set_index);
            char_letter = itemView.findViewById(R.id.set_letter);
        }

    }
}
