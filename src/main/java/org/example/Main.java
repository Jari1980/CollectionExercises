package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        while(true){
            System.out.println("Which exercise do you want to see 1-12? (close program with non number) :");
            try{
                int num = scan.nextInt();
                switch(num){
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
                        break;
                    case 3:
                        exercise3();
                        break;
                    case 4:
                        exercise4();
                        break;
                    case 5:
                        exercise5();
                        break;
                    case 6:
                        exercise6();
                        break;
                    case 7:
                        exercise7();
                        break;
                    default:
                        System.out.println("There is no such exercise.");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Closing");
                System.exit(0);
            }
        }
    }
    public static void exercise7(){
        System.out.println("Creating HashSet hashSet and populating it with random names: ");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jari Testar");
        hashSet.add("Billy Gate");
        hashSet.add("Michel Jeckson");
        hashSet.add("Super Broccoli");
        System.out.println("Converting hashSet to ArrayList: ");
        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll(hashSet);
        System.out.println("arrList: " + arrList); //[Billy Gate, Jari Testar, Super Broccoli, Michel Jeckson]
        System.out.println("Sorting arrList manually in alphabetic order: ");
        arrList.remove(2);
        arrList.add(3, "Super Broccoli");
        System.out.println("arrList sorted manually: " + arrList);
    }

    public static void exercise6(){
        System.out.println("Creating HashSet hashSet and populating it with days of week: ");
        HashSet<String> hashSet = new HashSet<String>();
        System.out.println("Populating hashSet with weekdays: ");
        for(int i = 0; i < 7; i++){
            String day = String.valueOf(LocalDate.now().plusDays(i).getDayOfWeek());
            hashSet.add(day);
        }
        System.out.println("Converting hashSet to arrayList: ");
        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll(hashSet);
        System.out.println("hashSet: " + hashSet);
        System.out.println("arrList: " + arrList);
    }

    public static void exercise5(){
        System.out.println("Creating HashSet hashSet: ");
        HashSet<String> hashSet = new HashSet<String>();
        System.out.println("Populating hashSet with weekdays: ");
        for(int i = 0; i < 7; i++){
            String day = String.valueOf(LocalDate.now().plusDays(i).getDayOfWeek());
            hashSet.add(day);
        }
        System.out.println("Printing out hashSet: ");
        System.out.println(hashSet);
    }

    public static void exercise4(){
        System.out.println("Creating a List list1: ");
        List<String> list1 = new ArrayList<String>();
        System.out.println("Populating the list1 with days of week: ");
        for(int i = 0; i < 7; i++){
            String day = String.valueOf(LocalDate.now().plusDays(i).getDayOfWeek());
            list1.add(day);
        }
        System.out.println("Creating list2 with subset of the first 3 elements in list1: ");
        List<String> list2 = list1.subList(0,3);
        System.out.println("list1: ");
        for(String element : list1){
            System.out.println(element);
        }
        System.out.println("list2: ");
        for(String element : list2){
            System.out.println(element);
        }
    }

    public static void exercise3(){
        System.out.println("Creating a List list: ");
        List<String> list = new ArrayList<String>();
        System.out.println("Populating the list with days of week excluding \"THURSDAY\": ");
        for(int i = 0; i < 7; i++){
            String day = String.valueOf(LocalDate.now().plusDays(i).getDayOfWeek());
            if(!day.equals("THURSDAY")){
                list.add(day);
            }
        }
        System.out.println("List w/o Thursday: ");
        for(String element : list){
            System.out.println(element);
        }
        System.out.println("Finding out index of friday since this is where thursday is going to be placed: ");
        int index = list.indexOf("FRIDAY");
        System.out.println("Adding thursday to correct place: ");
        list.add(index, "THURSDAY");
        System.out.println("List after adding thursday to correct place: ");
        for(String element : list){
            System.out.println(element);
        }
    }

    public static void exercise2(){
        System.out.println("Creating a List list: ");
        List<String> list = new ArrayList<String>();
        System.out.println("Populating the list with days of week: ");
        for(int i = 0; i < 7; i++){
            String day = String.valueOf(LocalDate.now().plusDays(i).getDayOfWeek());
            list.add(day);
        }
        System.out.println("Printing out each element in list:");
        for(String element : list){
            System.out.println(element);
        }
    }

    public static void exercise1(){
        System.out.println("Creating a List list: ");
        List<String> list = new ArrayList<String>();
        System.out.println("Populating the list with days of week: ");
        for(int i = 0; i < 7; i++){
            String day = String.valueOf(LocalDate.now().plusDays(i).getDayOfWeek());
            list.add(day);
        }
        System.out.println("Printing list ");
        System.out.println(list);
    }
}
