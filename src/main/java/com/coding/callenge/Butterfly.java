package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.enume.SoundEnum;
import com.coding.callenge.type.FlyAction;
import com.coding.callenge.type.SpeakAction;

public class Butterfly implements Animal, FlyAction, SpeakAction {
    @Override
    public void fly() {
        System.out.println(Message.FLY);
    }

    @Override
    public void speak(SoundEnum sound) {
        System.out.println(sound.getSound());
    }
}
