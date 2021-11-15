package com.javarush.task.task17.task1710;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код



            switch (args[0]){
                case "-c":
                    if (args[2].equals("м")){
                        allPeople.add(Person.createMale(args[1],new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                        System.out.println(allPeople.size()-1);
                    }else if (args[2].equals("ж")){
                        allPeople.add(Person.createFemale(args[1],new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                        System.out.println(allPeople.size()-1);
                    }
                    break;

                case "-r":
                    Person person = allPeople.get(Integer.parseInt(args[1]));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    String sb = simpleDateFormat.format(person.getBirthDate());
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м": "ж")  + " " + sb);
                    break;

                case "-u":
                    int id = Integer.parseInt(args[1]);
                    person = allPeople.get(id);
                    person.setName(String.valueOf(args[2]));

                    if (args[3].equals("м")){
                        person.setSex(Sex.MALE);
                    }else if (args[3].equals("ж")){
                        person.setSex(Sex.FEMALE);
                    }
                    person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                    allPeople.set(id, person);
                    break;

                case "-d":
                    id = Integer.parseInt(args[1]);
                    person = allPeople.get(id);
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                    allPeople.set(id,person);
            }
        }
    }

