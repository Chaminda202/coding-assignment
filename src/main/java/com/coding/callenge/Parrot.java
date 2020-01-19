package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.enume.SoundEnum;
import com.coding.callenge.type.FlyAction;

public class Parrot extends Bird implements FlyAction {
    @Override
    public void speak(SoundEnum sound) {
        super.speak(sound);
    }

    @Override
    public void fly() {
        System.out.println(Message.FLY);
    }
}
