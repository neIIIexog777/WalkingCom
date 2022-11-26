package com.walking.counterAggregation.Animal2;

public class Cow extends Animal{
    Cow(String name){
        super(name);
    }
    final void moo(){
        System.out.println("moo");
    }
    public String toString(){
        return "moo";
    }
}
