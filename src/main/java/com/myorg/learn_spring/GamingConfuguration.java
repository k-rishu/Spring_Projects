package com.myorg.learn_spring;

import com.myorg.learn_spring.game.GameRunner;
import com.myorg.learn_spring.game.GamingConsole;
import com.myorg.learn_spring.game.PackManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfuguration {

    @Bean
    public GamingConsole game(){
        return new PackManGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
