package com.myorg.learn_spring;


import com.myorg.learn_spring.game.GameRunner;
import com.myorg.learn_spring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args){
//

        var context = new AnnotationConfigApplicationContext(GamingConfuguration.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }
}
