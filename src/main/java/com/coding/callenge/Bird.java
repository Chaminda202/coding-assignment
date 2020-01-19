package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.type.SpeakAction;
import com.coding.callenge.type.WalkAction;

class Bird implements Animal, SpeakAction, WalkAction {

    @Override
    public void speak(String sound) {
        System.out.println(sound);
    }

    @Override
    public void walk() {
        System.out.println(Message.WALK);
    }
}