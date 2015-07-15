package com.mixtile.loftqgpio;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/**
 * Created by kurain on 7/13/15.
 */
public class GPIOCommonSu {
    private static final String TAG="GPIOSu";
    private int process_cmd(String cmd){
        Log.i(TAG, "process cmd: " + cmd);
        try {
            Process process = Runtime.getRuntime().exec("su");
            DataOutputStream dos = new DataOutputStream(process.getOutputStream());
            dos.writeBytes(cmd + "\n");
            dos.flush();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return 0;
    }

    private int process_read(String cmd){
        try {
            Process process = Runtime.getRuntime().exec("su");
            DataOutputStream dos = new DataOutputStream(process.getOutputStream());
            dos.writeBytes(cmd + "\n");
            dos.flush();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return 0;
    }

    public int export(int id){
        String cmd = "/system/bin/sh echo " + id + " > /sys/class/gpio/export";
        return process_cmd(cmd);
    }
    public int unexport(int id){
        String cmd = "/system/bin/sh echo " + id + " > /sys/class/gpio/unexport";
        return process_cmd(cmd);
    }

    public int enable_out(int id){
        String cmd = "/system/bin/sh echo out > " + " /sys/class/gpio/gpio" + id + "/direction";
        return process_cmd(cmd);
    }

    public int enable_in(int id){
        String cmd = "/system/bin/sh echo in > " + " /sys/class/gpio/gpio" + id + "/direction";
        return process_cmd(cmd);
    }

    public int read(int id){
        return 0;
    }

    public int write(int id, int bon){
        String cmd ="echo " + (0 == bon ? 0:1) + " > /sys/class/gpio/gpio" + id + "/value";
        return process_cmd(cmd);
    }
}
