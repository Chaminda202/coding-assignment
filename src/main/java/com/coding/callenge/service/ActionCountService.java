package com.coding.callenge.service;

import com.coding.callenge.Animal;
import com.coding.callenge.type.FlyAction;
import com.coding.callenge.type.SpeakAction;
import com.coding.callenge.type.SwimAction;
import com.coding.callenge.type.WalkAction;

public class ActionCountService {
    private int countFly =0;
    private int countWalk = 0;
    private int countSing = 0;
    private int countSwim = 0;

    public void actionCount(Animal[] animals){

        for(Animal animal : animals){
            if(animal instanceof FlyAction){
                countFly++;
            }
            if(animal instanceof WalkAction){
                countWalk++;
            }
            if(animal instanceof SpeakAction){
                countSing++;
            }
            if(animal instanceof SwimAction){
                countSwim++;
            }
        }
    }

    public int canFlyCount(){
        return countFly;
    }

    public int canWalkCount(){
        return countWalk;
    }

    public int canSingCount(){
        return countSing;
    }

    public int canSwimCount(){
        return countSwim;
    }
}
