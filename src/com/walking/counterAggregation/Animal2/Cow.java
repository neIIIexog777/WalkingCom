package com.walking.counterAggregation.Animal2;

public class Cow extends Animal{

    Cow(String name){
        super(name, "moo");
    }
    final void moo(){
        System.out.println(Sound(sound));
    }

}
