package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://datausa.io/api/data?drilldowns=Nation&measures=Population");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);
        //напишите тут ваш код
        try (OutputStream outPutStream = urlConnection.getOutputStream();
             PrintStream printStream = new PrintStream(outPutStream)){
             printStream.println("Hallo");
        }

        try (InputStream inputStream =urlConnection.getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }

    }
}

