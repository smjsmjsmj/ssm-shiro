package com.ssm.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5Util {
    /*MD5���ܷ���*/
    public static String encryptPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        //��ֹ�����ַ����������
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String result = base64Encoder.encode(md5.digest(password.getBytes("utf-8")));
        return result;
    }

    /*�ж������Ƿ����*/
    public  static boolean  checkPassword(String inputPwd,String dbPwd) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String result = encryptPassword(inputPwd);
        if(result.equals(dbPwd)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception{
        String result = MD5Util.encryptPassword("123");
        System.out.println("result:"+result);
    }
}