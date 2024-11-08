package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

    public static void exercise1(){
        System.out.println("Creating a List list: ");
        List<String> list = new ArrayList<String>();
        System.out.println("Populating the list with days of week: ");
        for(int i = 0; i < 7; i++){
            String day = String.valueOf(LocalDate.now().plusDays(i).getDayOfWeek());
            list.add(day);
        }
        System.out.println("list: ");
        for(String element : list){
            System.out.println(element);
        }
    }
}
