package com.mixtile.loftqgpio;

/**
 * Created by kurain on 7/9/15.
 */

public class GPIOGpio {
    static String gpiozone = "J4";
    static int j4_00 = 0;
    static int j4_01 = 1;
    static int j4_02 = 2;
    static int j4_03 = 3;

    static int j4_06 = 6;
    static int j4_07 = 7;
    static int j4_08 = 8;
    static int j4_09 = 9;
    GPIOLoftq wrapper = new GPIOLoftq();

    public void init(){

        // enable output gpios
        wrapper.export(gpiozone, j4_00);
        wrapper.enable_out(gpiozone, j4_00);

        wrapper.export(gpiozone, j4_01);
        wrapper.enable_out(gpiozone, j4_01);

        wrapper.export(gpiozone, j4_02);
        wrapper.enable_out(gpiozone, j4_02);

        wrapper.export(gpiozone, j4_03);
        wrapper.enable_out(gpiozone, j4_03);

        // enable input gpios

        wrapper.export(gpiozone, j4_06);
        wrapper.enable_in(gpiozone, j4_06);

        wrapper.export(gpiozone, j4_07);
        wrapper.enable_in(gpiozone, j4_07);

        wrapper.export(gpiozone, j4_08);
        wrapper.enable_in(gpiozone, j4_08);

        wrapper.export(gpiozone, j4_09);
        wrapper.enable_in(gpiozone, j4_09);


    }

    public void set_00(int value){

        wrapper.write(gpiozone, j4_00, value);
    }

    public void set_01(int value){

        wrapper.write(gpiozone, j4_01, value);
    }

    public void set_02(int value){

        wrapper.write(gpiozone, j4_02, value);
    }

    public void set_03(int value){

        wrapper.write(gpiozone, j4_03, value);
    }

    public int get_06(){

        return wrapper.read(gpiozone, j4_06);
    }

    public int get_07(){

        return wrapper.read(gpiozone, j4_07);
    }

    public int get_08(){

        return wrapper.read(gpiozone, j4_08);
    }

    public int get_09(){

        return wrapper.read(gpiozone, j4_09);
    }

    public void fini(){
        wrapper.unexport(gpiozone, j4_00);
        wrapper.unexport(gpiozone, j4_01);
        wrapper.unexport(gpiozone, j4_02);
        wrapper.unexport(gpiozone, j4_03);

        wrapper.unexport(gpiozone, j4_06);
        wrapper.unexport(gpiozone, j4_07);
        wrapper.unexport(gpiozone, j4_08);
        wrapper.unexport(gpiozone, j4_09);
    }
}
