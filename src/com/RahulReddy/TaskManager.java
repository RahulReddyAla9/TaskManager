package com.RahulReddy;

import java.text.ParseException;
import java.util.List;

public class TaskManager {
    static void ToAdd(Task t, List<Task> li) throws ParseException {

        li.add(t);
        // System.out.println("hey");
    }
    static void ToDisplayList(List<Task> li){

        for (Task str:li) {
            System.out.println(str);

        }
    }
    static void ToDelete(String s,List<Task> li){
        for(Task x:li){
            if(x.getName().equals(s)){
                li.remove(x);
                break;
            }
        }
    }
    static boolean ToSearch(String name,List<Task> li){
        for(Task x:li){
            if(x.getName().equals(name)){
                System.out.println(x);
                return true;
            }
        }
        return false;
    }
    public void listByStatus(taskStatus status,List<Task> li){
              for(Task i:li){
                  if(i.getStatus().equals(status)){
                      System.out.println(i);
                  }
              }
    }
}
