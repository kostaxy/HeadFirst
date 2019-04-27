package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveActivity extends AppCompatActivity {
    public final static String MESSAGE = "Message";

    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);


        messageTextView = findViewById(R.id.message_text_view);
        loadMessage();
    }

    private void loadMessage() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE);
        if (message.equals("")) {
            messageTextView.setText("Please type some text :)");
        } else {

            messageTextView.setText(message);
        }
    }
}
