package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String data = fileScanner.nextLine();
            String[] dataArrayStrings = data.split(" ");
            String lastName = dataArrayStrings[0];
            String firstName = dataArrayStrings[1];
            String middleName = dataArrayStrings[2];
            Calendar calendar = new GregorianCalendar(Integer.parseInt(dataArrayStrings[5]), Integer.parseInt(dataArrayStrings[4])-1,
                    Integer.parseInt(dataArrayStrings[3]));
            Date birthDate = calendar.getTime();

            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
