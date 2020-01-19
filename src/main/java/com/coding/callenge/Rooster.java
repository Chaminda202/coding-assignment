package com.coding.callenge;

import com.coding.callenge.enume.SoundEnum;

public class Rooster extends Chicken {
    @Override
    public void speak(SoundEnum sound) {
        super.speak(sound);
    }
    @Override
    public void speak() {
        System.out.println(SoundEnum.ROOSTER.getSound());
    }
}
