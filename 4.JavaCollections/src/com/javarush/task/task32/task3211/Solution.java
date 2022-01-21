package com.javarush.task.task32.task3211;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;

/* 
Целостность информации
*/

public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {

        MessageDigest messageDigest1 = MessageDigest.getInstance("MD5");
        messageDigest1.update(byteArrayOutputStream.toByteArray());
        byte[] digest2 = messageDigest1.digest();

        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < digest2.length; i++) {
            String str = Integer.toHexString(0xFF & digest2[i]);
            if (str.length() < 2) str = "0" + str;
            hexString.append(str);
            
        }
        return hexString.toString().equals(md5);
    }
}
