package com.mixtile.loftqgpio;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.util.Log;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by kurain on 7/14/15.
 */
public class GPIOCommonSocket {
    private static final String SOCKET_ADDRESS = "mixtile.gpio_srv_port";
    private static final String TAG="GPIOSocket";
    private static LocalSocket socket = null;

    private byte[] process_cmd(char cmd_prefix, int id, int bon){
        byte[] cmd = new byte[4];
        cmd[0] = (byte)cmd_prefix;
        cmd[1] = (byte)(id>>8&0xff);
        cmd[2] = (byte)(id&0xff);
        cmd[3] = (byte)(bon);

        try {
            byte[] readbytes = new byte[4];
            socket = new LocalSocket(LocalSocket.SOCKET_STREAM);
            socket.connect(new LocalSocketAddress(SOCKET_ADDRESS, LocalSocketAddress.Namespace.RESERVED));
            socket.getOutputStream().write(cmd);
            socket.getInputStream().read(readbytes);
            socket.close();
            return readbytes;
        }catch (Exception e){
            e.printStackTrace();
            Log.e(TAG, e.toString());
        }

        return null;
    }

    public int export(int id){
        byte[] ret = process_cmd('E', id, 0);
        return (int)ret[1];
    }
    public int unexport(int id){
        byte[] ret = process_cmd('U', id, 0);
        return (int)ret[1];
    }

    public int enable_out(int id){
        byte[] ret = process_cmd('O', id, 0);
        return (int)ret[1];
    }

    public int enable_in(int id){
        byte[] ret = process_cmd('I', id, 0);
        return (int)ret[1];
    }

    public int read(int id){
        byte[] ret = process_cmd('R', id, 0);
        return (int)ret[1];
    }

    public int write(int id, int bon){
        bon = 0 == bon ? 0:1;
        byte[] ret = process_cmd('W', id, bon);
        return (int)ret[1];
    }
}
