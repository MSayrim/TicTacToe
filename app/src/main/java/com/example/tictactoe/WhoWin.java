package com.example.tictactoe;

import java.util.ArrayList;

public class WhoWin {


    public String  winnerIs(ArrayList<Integer> gameResult)
    {
        String winner =null;
        if(gameResult.get ( 0 ) == 1 && gameResult.get ( 1 ) == 1 && gameResult.get ( 2 ) == 1){
            winner = "X kazandı";
        }

        if(gameResult.get ( 3 ) == 1 && gameResult.get ( 4 ) == 1 && gameResult.get ( 5 ) == 1){
            winner = "X kazandı";
        }
        if(gameResult.get ( 6 ) == 1 && gameResult.get ( 7 ) == 1 && gameResult.get ( 8 ) == 1){
            winner = "X kazandı";
        }
        if(gameResult.get ( 0 ) == 1 && gameResult.get ( 4 ) == 1 && gameResult.get ( 8 ) == 1){
            winner = "X kazandı";
        }
        if(gameResult.get ( 2 ) == 1 && gameResult.get ( 4 ) == 1 && gameResult.get ( 6 ) == 1){
            winner = "X kazandı";
        }
        if(gameResult.get ( 0 ) == 1 && gameResult.get ( 3 ) == 1 && gameResult.get ( 6 ) == 1){
            winner = "X kazandı";
        }
        if(gameResult.get ( 2 ) == 1 && gameResult.get ( 5 ) == 1 && gameResult.get ( 8 ) == 1){
            winner = "X kazandı";
        }


        if(gameResult.get ( 0 ) == 2 && gameResult.get ( 1 ) == 2 && gameResult.get ( 2 ) == 2){
            winner = "o kazandı";
        }

        if(gameResult.get ( 3 ) == 2 && gameResult.get ( 4 ) == 2 && gameResult.get ( 5 ) == 2){
            winner = "o kazandı";
        }
        if(gameResult.get ( 6 ) == 2 && gameResult.get ( 7 ) == 2 && gameResult.get ( 8 ) == 2){
            winner = "o kazandı";
        }
        if(gameResult.get ( 0 ) == 2 && gameResult.get ( 4 ) == 2 && gameResult.get ( 8 ) == 2){
            winner = "o kazandı";
        }
        if(gameResult.get ( 2 ) == 2 && gameResult.get ( 4 ) == 2 && gameResult.get ( 6 ) == 2){
            winner = "o kazandı";
        }
        if(gameResult.get ( 0 ) == 2 && gameResult.get ( 3 ) == 2 && gameResult.get ( 6 ) == 2){
            winner = "o kazandı";
        }
        if(gameResult.get ( 2 ) == 2 && gameResult.get ( 5 ) == 2 && gameResult.get ( 8 ) == 2){
            winner = "o kazandı";
        }








        if((gameResult.get ( 0 ) != 0) && (gameResult.get ( 1 ) != 0) && (gameResult.get ( 2 ) != 0) && (gameResult.get ( 3 ) != 0) && (gameResult.get ( 4 ) != 0) && (gameResult.get ( 5 ) != 0) && (gameResult.get ( 6 ) != 0) && (gameResult.get ( 7 ) != 0) && (gameResult.get ( 8 ) != 0 ))
        {
            if(winner == null) {
                winner = "berabere";
            }
        }



        return winner;
    }
}
