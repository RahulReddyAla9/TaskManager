package com.RahulReddy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        //System.out.println("hey");
        Scanner sc=new Scanner(System.in);

        List<Task> li=new ArrayList<>();
        while(true){
            System.out.println("Enter number choice");
            System.out.println("1.ToAdd\t2.ToDisplayList\t3.ToDelete\t4.ToSearch\t5.Exit");
            int ch=sc.nextInt();
            swi(ch,li);

        }
    }
    static void swi(int ch,List<Task> li) throws ParseException {
    TaskManager tm=new TaskManager();
    Scanner sc=new Scanner(System.in);

        switch (ch){
            case 1:
                System.out.println("Enter name to add:");
              //  Scanner sc=new Scanner(System.in);
                String n=sc.nextLine();
                System.out.println("Enter details:");
                String des=sc.nextLine();
                System.out.println("Enter Date in dd/mm/yyyy format:");
                Date d=new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
                System.out.println("Enter Status(CREATED|IN_PROGRESS|DONE):");
                taskStatus stat=taskStatus.valueOf(sc.nextLine());
                Task t=new Task(n,des,d,stat);
                tm.ToAdd(t,li);
                break;
            case 2:
                tm.ToDisplayList(li);
                break;
            case 3:
                System.out.println("Enter name to delete:");
                String s=sc.next();
                System.out.println(s + " is deleted");
                tm.ToDelete(s, li);
//                else
//                    System.out.println("No such task");
                break;
            case 4:
                System.out.println("Enter name to Search:");
                String a=sc.next();
                if(tm.ToSearch(a,li))
                    System.out.println("Task "+a+" Found!");
                else
                    System.out.println("No such task!");
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid Input");
        }
    }
}
