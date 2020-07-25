package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView oneView;
    ImageView twoView;
    ImageView threeView;
    ImageView fourView;
    ImageView fiveView;
    ImageView sixView;
    ImageView sevenView;
    ImageView eightView;
    ImageView nineView;
    Button playButton;
    Integer currentPlayer = 0;

    TextView result;
    String winnerResult = null;
    ArrayList<Integer>currentState;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        oneView =findViewById(R.id.oneView);
        twoView =findViewById(R.id.twoView);
        threeView =findViewById(R.id.threeView);
        fourView =findViewById(R.id.fourView);
        fiveView =findViewById(R.id.fiveView);
        sixView =findViewById(R.id.sixView);
        sevenView =findViewById(R.id.sevenView);
        eightView =findViewById(R.id.eightView);
        nineView =findViewById(R.id.nineView);
        result = findViewById ( R.id.result );

        currentState = new ArrayList<Integer> ( 9);
        for (int i = 0; i<9 ;i++)
        {
            currentState.add ( 0 );
        }

            }

    WhoWin winner = new WhoWin ();



    public void oneOne(View view) {

            if ((currentPlayer % 2) == 0) {
                oneView.setImageResource ( R.drawable.x );
                currentPlayer = currentPlayer + 1;
                currentState.set ( 0, 1 );
            } else {
                oneView.setImageResource ( R.drawable.o );
                currentPlayer = currentPlayer + 1;
                currentState.set ( 0, 2 );
            }
        winnerResult = winner.winnerIs ( currentState );
            if(winnerResult != null)
            {
                result.setText ( winnerResult );
            }

    }
    public void oneTwo(View view) {
        if((currentPlayer % 2) == 0 ) {
            twoView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
            currentState.set ( 1, 1 );
        }
        else {
            twoView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
            currentState.set ( 1, 2 );
        }
        winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
        }



    public void oneThree(View view) {
        if((currentPlayer % 2) == 0 ) {
            threeView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
            currentState.set ( 2, 1 );
        }
        else {
            threeView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
            currentState.set ( 2, 2 );
        }
        winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
    }
    public void twoOne(View view) {
        if((currentPlayer % 2) == 0 ) {
            fourView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
            currentState.set ( 3, 1 );
        }
        else {
            fourView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
           currentState.set ( 3, 2 );
        }
        winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
    }
    public void twoTwo(View view) {
        if((currentPlayer % 2) == 0 ) {
            fiveView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
           currentState.set ( 4, 1 );
        }
        else {
            fiveView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
            currentState.set ( 4, 2 );
        }
        winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
    }
    public void twoThree(View view) {
        if((currentPlayer % 2) == 0 ){
            sixView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
           currentState.set ( 5, 1 );
        }
        else {
            sixView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
            currentState.set ( 5, 2 );
        }
        winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
    }
    public void threeOne(View view) {
        if((currentPlayer % 2) == 0 ) {
            sevenView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
            currentState.set ( 6, 1 );
        }
        else {
            sevenView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
            currentState.set ( 6, 2 );
        }
        winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
    }
    public void threeTwo(View view) {
        if((currentPlayer % 2) == 0 ) {
            eightView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
            currentState.set ( 7, 1 );
        }
        else {
            eightView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
            currentState.set ( 7, 2 );
        }
       winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
    }
    public void threeThree(View view) {
        if((currentPlayer % 2) == 0 ) {
            nineView.setImageResource ( R.drawable.x );
            currentPlayer = currentPlayer +1;
            currentState.set ( 8, 1 );
        }
        else {
            nineView.setImageResource ( R.drawable.o );
            currentPlayer = currentPlayer +1;
            currentState.set ( 8, 12 );
        }
        winnerResult = winner.winnerIs ( currentState );
        if(winnerResult != null)
        {
            result.setText ( winnerResult );
        }
    }


    public void playButton(View view) {

        oneView.setImageResource ( R.drawable.empty );
        twoView.setImageResource ( R.drawable.empty );
        threeView.setImageResource ( R.drawable.empty );
        fourView.setImageResource ( R.drawable.empty );
        fiveView.setImageResource ( R.drawable.empty );
        sixView.setImageResource ( R.drawable.empty );
        sevenView.setImageResource ( R.drawable.empty );
        eightView.setImageResource ( R.drawable.empty );
        nineView.setImageResource ( R.drawable.empty );
        currentPlayer = 0;


        if( currentState.get ( 0 ) == null)
        {
            for (int i = 0; i<9 ; i++)
            {
                currentState.add ( 0 );
            }
        }
        else {
            for (int i = 0; i<9 ; i++)
            {
                currentState.set ( i, 0 );
            }

        }

    }





}
