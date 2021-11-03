package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }
    @Override
    public void onTurn(int x){
        setCellNumber(1, 1, x);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                setCellColor(i,j, x%2==0 ? Color.GREEN : Color.ORANGE);
            }
        }
    }
    //напишите тут ваш код
}
