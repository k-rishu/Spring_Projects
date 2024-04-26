package com.myorg.learn_spring;

import com.myorg.learn_spring.game.GameRunner;
import com.myorg.learn_spring.game.PackManGame;

public class App01GamingBasicJava {
    public static void main(String[] args){
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PackManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
