package com.myorg.learn_spring.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){};
record Address (String firstLine, String City){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Rishu";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 23, new Address("Lois Lane", "Gotham" ));
    }

    @Bean(name = "hakunamatata")
    public Person person2(){
        return new Person(name(), age(), address());
    }

    @Bean // creating bean with the use of parameters.
    @Primary
    public Person person3(String name, int age, Address address){
        return new Person(name, age, address);
    }


    @Bean
    public Address address(){
        return new Address("PuraniBazar", "Rajgir" );
    }
}
