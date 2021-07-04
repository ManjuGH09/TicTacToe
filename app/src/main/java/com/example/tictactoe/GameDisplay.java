package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {

    private TicTacToeBoard ticTacToeBoard;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);

        String[] playerNames = getIntent().getStringArrayExtra("Player_Name");
        Button playAgain = findViewById(R.id.button4);
        Button home = findViewById(R.id.button3);
        TextView playerTurn = findViewById(R.id.textView5);

        playAgain.setVisibility(View.GONE);
        home.setVisibility(View.GONE);

        if (playerNames != null)
            playerTurn.setText((playerNames[0] + "'s Turn"));

        ticTacToeBoard = findViewById(R.id.ticTacToeBoard);
        ticTacToeBoard.setUpGame(playAgain, home, playerTurn, playerNames);
    }

    public void playAgainButton(View view){
        ticTacToeBoard.resetGame();
        ticTacToeBoard.invalidate();
    }

    public void homeButton(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}