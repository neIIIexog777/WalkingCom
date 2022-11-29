package com.walking.counterAggregation.Animal2;

public class Dog extends Animal{

    Dog(String name){
        super(name,"woof");
    }
    final void woof(){
        System.out.println(Sound(sound));
    }
}
