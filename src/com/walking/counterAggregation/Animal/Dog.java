package com.walking.counterAggregation.Animal;

import java.util.SortedMap;

public class Dog extends Animal{
    private Dog(){
        System.out.println("I’m a dog");
    }
    public Dog(String color){
    this();
        System.out.printf("I’m a %s dog \n", color);
    }
}
