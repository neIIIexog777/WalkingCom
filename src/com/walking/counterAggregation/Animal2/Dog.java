package com.walking.counterAggregation.Animal2;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    final void woof(){
        System.out.println("woof");
    }
    public String toString(){
        return "woof";
    }
}
