package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    int j = 1;
                    for (int i = 0; i < (args.length - 1) / 3; i++) {
                        if (args[j + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[j], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[j + 2])));
                            System.out.println(allPeople.size() - 1);
                            j += 3;
                        } else if (args[j + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(args[j], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[j + 2])));
                            System.out.println(allPeople.size() - 1);
                            j += 3;
                        }
                    }

                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String sb = simpleDateFormat.format(person.getBirthDate());
                        System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + sb);
                    }
                    break;
                }
            case "-u":
               synchronized (allPeople) {
                   int j = 1;
                   for (int i = 0; i < (args.length - 1) / 4; i++) {
                       int id = Integer.parseInt(args[j]);
                       Person person = allPeople.get(id);
                       person.setName(String.valueOf(args[j + 1]));

                       if (args[j + 2].equals("м")) {
                           person.setSex(Sex.MALE);
                       } else if (args[j + 2].equals("ж")) {
                           person.setSex(Sex.FEMALE);
                       }

                       person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[j + 3]));
                       allPeople.set(id, person);
                       j += 4;
                   }
                   break;
               }

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        Person person = allPeople.get(id);


                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                        allPeople.set(id, person);
                    }
                }
        }
    }
}
