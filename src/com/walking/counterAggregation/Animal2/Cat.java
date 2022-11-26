package com.walking.counterAggregation.Animal2;

public class Cat extends Animal {
    Cat(String name){
        super(name);
    }
    final void meow(){
        System.out.println("meow");
    }
   public String toString(){
       return "meow";
    }
}
