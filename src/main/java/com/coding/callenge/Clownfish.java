package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.enume.Colour;
import com.coding.callenge.enume.Size;

public class Clownfish extends Fish {
    @Override
    public String size() {
        return Size.SMALL.getValue();
    }

    @Override
    public String color() {
        return Colour.ORANGE.getValue();
    }

    public void makeJoke(){
        System.out.println(Message.JOKE);
    }
}
