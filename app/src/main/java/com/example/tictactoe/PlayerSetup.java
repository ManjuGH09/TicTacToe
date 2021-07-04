package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);

        player1 = findViewById(R.id.editTextTextPersonName);
        player2 = findViewById(R.id.editTextTextPersonName2);
    }

    public void submitButtonClick(View view){
        String playerName1 = player1.getText().toString();
        String playerName2 = player2.getText().toString();

        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("Player_Name", new String[] {playerName1, playerName2});
        startActivity(intent);
    }
}