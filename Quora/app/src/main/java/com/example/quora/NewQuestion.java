package com.example.quora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_question);
        getSupportActionBar().setTitle("Post a question");
    }

    public void onpress(View view) {
        switch (view.getId())
        {
            case R.id.post:
                finish();
                break;
            case R.id.cancel:
                finish();
                break;
        }
    }
}
