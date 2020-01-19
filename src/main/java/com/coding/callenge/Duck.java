package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.enume.SoundEnum;
import com.coding.callenge.type.FlyAction;
import com.coding.callenge.type.SwimAction;

public class Duck extends Bird implements SwimAction, FlyAction {
    @Override
    public void fly() {
        System.out.println(Message.FLY);
    }

    @Override
    public void swim() {
        System.out.println(Message.SWIM);
    }

    @Override
    public void speak(SoundEnum sound) {
        super.speak(sound);
    }

    @Override
    public void speak() {
        System.out.println(SoundEnum.DUCK.getSound());
    }
}
