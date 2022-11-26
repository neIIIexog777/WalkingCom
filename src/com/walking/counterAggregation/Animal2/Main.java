package com.walking.counterAggregation.Animal2;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Вася");
        Dog dog = new Dog("Жужа");
        Cow cow = new Cow("Зорька");



        Animal[] animals = {cat,dog,cow};
        AnimalSound(animals);
    }
    public static void AnimalSound(Animal ...animals){
        for( int i = 0; i < animals.length; i++){
            System.out.println(animals[i].name + " says " + animals[i].toString());
        }
        System.out.println("What Does The Fox Say?");
    }
}
