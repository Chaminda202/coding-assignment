package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.enume.Colour;
import com.coding.callenge.enume.Size;

public class Shark extends Fish {
    @Override
    public String size() {
        return Size.LARGE.getValue();
    }

    @Override
    public String color() {
        return Colour.GREY.getValue();
    }

    public void eatOtherFish(){
        System.out.println(Message.EAT);
    }
}
