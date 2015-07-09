package com.mixtile.loftqgpio;

/**
 * Created by kurain on 7/9/15.
 */

enum GPIOState {
    GPIO_OUT,
    GPIO_IN,
};

public class GPIOGpio {
    public String zone;
    public int id;
    public GPIOState state;
}
