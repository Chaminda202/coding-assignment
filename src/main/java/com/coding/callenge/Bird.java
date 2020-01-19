package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.enume.SoundEnum;
import com.coding.callenge.type.SpeakAction;
import com.coding.callenge.type.WalkAction;

class Bird implements Animal, SpeakAction, WalkAction {

    public void speak() {
        System.out.println(SoundEnum.DEFAULT.getSound());
    }

    @Override
    public void speak(SoundEnum sound) {
        System.out.println(sound.getSound());
    }

    @Override
    public void walk() {
        System.out.println(Message.WALK);
    }
}