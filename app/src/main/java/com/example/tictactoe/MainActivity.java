package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
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
    private Switch aSwitch;
    private Switch aSwitch2;
    TextView result;
    String winnerResult = null;
    ArrayList<Integer>currentState;
    Integer upper = 0;



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
        aSwitch = findViewById ( R.id.switch1);
        aSwitch2 = findViewById ( R.id.switch2);


        aSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    xOSelect ();

                }else{

                    xOSelect ();
                }
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    upper = 1;

                }else{
                    upper = 2;

                }
            }
        });

        currentState = new ArrayList<Integer> ( 9);
        for (int i = 0; i<9 ;i++)
        {
            currentState.add ( 0 );
        }

            }

    WhoWin winner = new WhoWin ();
    ComputerActivity pc = new ComputerActivity ();
    void xOSelect()
    {
        if (aSwitch2.isChecked () == true){
            currentPlayer = 1;
        }
        else {
            currentPlayer = 0;
        }
    }


    void currentShower(){



        if(currentState.get ( 0 ).equals ( 1 ))
        {
            oneView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 1 ).equals ( 1 ))
        {
            twoView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 2 ).equals ( 1 ))
        {
            threeView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 3 ).equals ( 1 ))
        {
            fourView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 4 ).equals ( 1 ))
        {
            fiveView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 5 ).equals ( 1 ))
        {
            sixView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 6 ).equals ( 1 ))
        {
            sevenView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 7 ).equals ( 1 ))
        {
            eightView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 8 ).equals ( 1 ))
        {
            nineView.setImageResource ( R.drawable.x );
        }
        if(currentState.get ( 0 ).equals ( 2 ))
        {
            oneView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 1 ).equals ( 2 ))
        {
            twoView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 2 ).equals ( 2 ))
        {
            threeView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 3 ).equals ( 2 ))
        {
            fourView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 4 ).equals ( 2 ))
        {
            fiveView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 5 ).equals ( 2 ))
        {
            sixView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 6 ).equals ( 2 ))
        {
            sevenView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 7 ).equals ( 2 ))
        {
            eightView.setImageResource ( R.drawable.o );
        }
        if(currentState.get ( 8 ).equals ( 2 ))
        {
            nineView.setImageResource ( R.drawable.o );
        }

    }

    public void oneOne(View view) {

        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 0, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 0, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }
    }
    public void oneTwo(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 1, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 1, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }


    }



    public void oneThree(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 2, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 2, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }
    }
    public void twoOne(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 3, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 3, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }
    }
    public void twoTwo(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 4, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 4, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }
    }
    public void twoThree(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 5, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 5, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }
    }
    public void threeOne(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 6, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 6, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }
    }
    public void threeTwo(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 7, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 7, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
        }
    }
    public void threeThree(View view) {
        if(winnerResult == null) {
            if ((currentPlayer % 2) == 0) {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 8, 1 );
                if (upper.equals ( 2)) {
                    pc.pcMove2 ( currentState );
                }
            } else {
                currentPlayer = currentPlayer + upper;
                currentState.set ( 8, 2 );
                if (upper.equals ( 2)) {
                    pc.pcMove1 ( currentState );
                }
            }
            winnerResult = winner.winnerIs ( currentState );
            currentShower ();
            if (winnerResult != null) {
                result.setText ( winnerResult );
            }
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
        result.setText ( "Nobody" );
        currentPlayer = 0;
        winnerResult = null;
        xOSelect ();

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
