package com.mixtile.loftqgpio;

/**
 * Created by kurain on 7/9/15.
 */

public class GPIOGpio {
    static String gpiozone = "J4";
    static int j4_00 = 0;
    static int j4_01 = 1;
    static int j4_02 = 2;
    GPIOLoftq wrapper = new GPIOLoftq();

    public void init(){
        wrapper.export(gpiozone, j4_00);
        wrapper.enable_out(gpiozone, j4_00);

        wrapper.export(gpiozone, j4_01);
        wrapper.enable_out(gpiozone, j4_01);

        wrapper.export(gpiozone, j4_02);
        wrapper.enable_out(gpiozone, j4_02);
    }

    public void set_01(int value){

        wrapper.write(gpiozone, j4_00, value);
    }

    public void set_02(int value){

        wrapper.write(gpiozone, j4_01, value);
    }

    public void set_03(int value){
        wrapper.write(gpiozone, j4_02, value);
    }

    public void fini(){
        wrapper.unexport(gpiozone, j4_00);
        wrapper.unexport(gpiozone, j4_01);
        wrapper.unexport(gpiozone, j4_02);
    }
}
