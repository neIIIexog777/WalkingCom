package com.walking.counterAggregation;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Counter coldWaterMeter = new Counter("Хол.Вода",50);
        Counter hotWaterMeter = new Counter("Гор.Вода",150);
        Counter gasMeter = new Counter("Газ",350);
        Counter electricityMeter = new Counter("электричество",1050);


        CounterService counterService = new CounterService(coldWaterMeter,hotWaterMeter,gasMeter,electricityMeter);

        CounterService.getInfo(coldWaterMeter,hotWaterMeter);



    }

    static class CounterService{
        static Counter[] arr;

        CounterService(Counter ...names){
            Counter[] arr = new Counter[Counter.arrCounter];
            for(int i = 0; i < arr.length; i++){
                arr[i] = names[i];
            }
        }

        static void zeroingCounter(Counter name){
            name.zeroing();
        }

        static void incrementCounter(Counter name){
            name.increment();
        }
        static void decrementCounter(Counter name){
            name.decrement();
        }

        static void decreaseCounter(Counter name, int value){
            name.decrease(value);
        }
        static void increaseCounter(Counter name, int value){
            name.increase(value);
        }


        private static void getInfo(Object ...objects){
           for(int i = 0; i <objects.length; i++){
               System.out.println(objects[i].toString());
           }


        }

    }
}


