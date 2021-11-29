package com.javarush.task.task19.task1905;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String result = "";
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName())) {
                   result =  entry.getKey();
                }
            }
            return result;
        }

        @Override
        public String getCompany() {return customer.getCompanyName();}

        @Override
        public String getContactFirstName() {
            return contact.getName().substring(contact.getName().indexOf(",")+2);
        }

        @Override
        public String getContactLastName() {return contact.getName().substring(0, contact.getName().indexOf(","));}

        @Override
        public String getDialString() {
            String string = contact.getPhoneNumber() ;
            byte[] array = string.getBytes();
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if ((array[i] > 47) && (array[i] < 58)){
                    j++;
                }
            }
            byte[] array2 = new byte[j];
            int a = 0;
            for (int i = 0; i < array.length; i++) {
                if ((array[i] > 47) && (array[i] < 58)){
                    array2[a++] += array[i];
                }
            }

            return  String.format("callto://+%s",new String(array2));
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}