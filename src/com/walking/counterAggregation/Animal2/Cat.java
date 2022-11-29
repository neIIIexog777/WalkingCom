package com.walking.counterAggregation.Animal2;

public class Cat extends Animal {

    Cat(String name){
        super(name, "meow");

    }
    final void meow(){
        System.out.println(Sound(sound));
    }

}
