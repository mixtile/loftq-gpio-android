package com.mixtile.loftqgpio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

/**
 * Created by kurain on 15-7-9.
 */
public class GPIOCommon {
    private static String sys_gpio_path = "/sys/class/gpio";
    private static String export_path = "/sys/class/gpio/export";
    private static String unexport_path = "/sys/class/gpio/unexport";

    public int export(int id){
        try {
            File file = new File(export_path);
            FileOutputStream fos = new FileOutputStream(file);
            byte [] bytes = new String().valueOf(id).getBytes();

            fos.write(bytes);
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    public int unexport(int id){
        try {
            File file = new File(unexport_path);
            FileOutputStream fos = new FileOutputStream(file);
            byte [] bytes = new String().valueOf(id).getBytes();

            fos.write(bytes);
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public int enable_out(int id){
        try {
            // the final direction path looks like "/sys/class/gpio/gpioXXX/direction"
            String out_path = sys_gpio_path + "/gpio" + String.valueOf(id) + "/direction";
            File file = new File(out_path);
            FileOutputStream fos = new FileOutputStream(file);
            byte [] bytes = new String("out").getBytes();
            fos.write(bytes);
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public int enable_in(int id){
        try {
            // the final direction path looks like "/sys/class/gpio/gpioXXX/direction"
            String in_path = sys_gpio_path + "/gpio" + String.valueOf(id) + "/direction";
            File file = new File(in_path);
            FileOutputStream fos = new FileOutputStream(file);
            byte [] bytes = new String("in").getBytes();
            fos.write(bytes);
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public int read(int id){
        int ret = -1;
        try {
            // the final direction path looks like "/sys/class/gpio/gpioXXX/value"
            String in_path = sys_gpio_path + "/gpio" + String.valueOf(id) + "/value";
            File file = new File(in_path);
            FileInputStream fos = new FileInputStream(file);
            byte [] bytes = new byte[16] ;
            if(0 == fos.read(bytes))
            {
                String ret_str = new String(bytes);
                ret_str = String.copyValueOf(ret_str.toCharArray(), 0, bytes.length);
                ret =Integer.parseInt(ret_str);
            }
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }

    public int write(int id, int bon){
        try {
            // the final direction path looks like "/sys/class/gpio/gpioXXX/value"
            String in_path = sys_gpio_path + "/gpio" + String.valueOf(id) + "/value";
            File file = new File(in_path);
            FileOutputStream fos = new FileOutputStream(file);
            byte [] bytes = String.valueOf(0 == bon ? 0:1).getBytes();
            fos.write(bytes);
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

}
