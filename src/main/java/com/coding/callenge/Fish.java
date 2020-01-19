package com.coding.callenge;

import com.coding.callenge.common.Message;
import com.coding.callenge.type.SwimAction;

public class Fish implements Animal, SwimAction {
    @Override
    public void swim() {
      System.out.println(Message.SWIM);
    }
}
