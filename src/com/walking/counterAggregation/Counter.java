package com.walking.counterAggregation;

public class Counter {
    private final String name;
    private int counter;
    private final String measureUnit;

    static int arrCounter = 0;

    Counter (String name, int counter){
        this.name=name;
        this.counter = counter;
        this.measureUnit = "Кубический метр";
        ++arrCounter;

    }


    public String getMeasureUnit() {
        return measureUnit;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
                return name + "," + counter + "," + measureUnit;
    }


    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }
    public void zeroing(){
        counter = 0;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }


}


