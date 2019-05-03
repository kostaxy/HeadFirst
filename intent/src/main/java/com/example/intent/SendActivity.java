package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendActivity extends AppCompatActivity {

    private EditText messageEditText;

    private String bannk = "Alfabank";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        messageEditText = findViewById(R.id.message_edit_text);
    }

    public void sendMessageToActivity(View view) {

        String myMessage = String.valueOf(messageEditText.getText());
        Intent intent = new Intent(this, RecieveActivity.class);
        intent.putExtra(RecieveActivity.MESSAGE, myMessage);
        startActivity(intent);
    }

    public void sendMessageToAnotherApp(View view) {

        String myMessage = String.valueOf(messageEditText.getText());
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);
        Intent chosenIntent = Intent.createChooser(intent,"You may choose :)");
        startActivity(chosenIntent);
    }
}
