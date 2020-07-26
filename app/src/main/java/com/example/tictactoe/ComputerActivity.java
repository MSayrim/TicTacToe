package com.example.tictactoe;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class ComputerActivity {


    ArrayList<String> arrayList;

    public void pcMove1(ArrayList current){
        Random  rand = new Random (  );


        for (int i=0; i<1000;i++ ) {
            int rnumber = rand.nextInt (9);
            if (current.get(rnumber).equals ( 0 ))
            {
                current.set ( rnumber, 1 );

                break;
            }

        }
    }
    public void pcMove2(ArrayList current){
        Random  rand = new Random (  );

        for (int i=0; i<1000;i++ ) {
            int rnumber = rand.nextInt (9);
            if (current.get(rnumber).equals ( 0 ))
            {
                current.set ( rnumber, 2 );

                break;
            }

        }
    }






}
