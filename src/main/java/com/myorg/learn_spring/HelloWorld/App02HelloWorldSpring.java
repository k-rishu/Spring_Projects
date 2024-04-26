package com.myorg.learn_spring.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        // Launch a Spring Context

        var context  = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("hakunamatata"));
        System.out.println(context.getBean("person3"));
        System.out.println(context.getBean(Person.class)); // Getting Exception expected single matching bean but found 3: person,hakunamatata,person3
        //To resolve this we need to make any bean as primary using @Primary

//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);
        // configure the things for spring to manage -@Configuration

    }
}
