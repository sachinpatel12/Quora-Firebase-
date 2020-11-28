package com.example.quora;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionAdapter extends BaseAdapter {
    private ArrayList<question> questionArrayList;
    private Activity activity;
    public QuestionAdapter(ArrayList<question> questionArrayList,Activity activity ) {
        this.questionArrayList = questionArrayList;
        this.activity = activity;
    }
    @Override
    public int getCount() {
        return questionArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return questionArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=activity.getLayoutInflater();
        final View inflate=layoutInflater.inflate(R.layout.singlequestion,null,false);
        final TextView question = inflate.findViewById(R.id.question);
        TextView date = inflate.findViewById(R.id.date);
        TextView number=inflate.findViewById(R.id.numberofanswers);
        question.setText(questionArrayList.get(position).getQuestion());
        date.setText(questionArrayList.get(position).getDate());
        number.setText(questionArrayList.get(position).getAnswers());
        inflate.findViewById(R.id.ans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                activity.startActivity(new Intent(activity,answer.class));
            }
        });
        inflate.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question=questionArrayList.get(position).getQuestion();
                Intent sharingintent = new Intent(Intent.ACTION_SEND);
                sharingintent.setType("text/plain");
                sharingintent.putExtra(Intent.EXTRA_TEXT,question);
                activity.startActivity(sharingintent);
            }
        });




        return inflate;
    }
}

