package com.RahulReddy;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository {
    List<Task> list=new ArrayList<>();
    public void toAddTask(Task task) {
        list.add(task);
    }
    public List<Task> toDisplayTask(){
        return list;
    }
    public void toDeleteTask(int id){
        for(Task x:list){
            if(x.getId()==id){
                list.remove(x);
                break;
            }
        }
    }
    public Task toSearchById(int id){
        for(Task t:list){
            if(t.getId()==id){
                return t;
            }
        }
        return null;
    }
    public List<Task> listByStatus(TaskStatus status){
        List<Task> list= new ArrayList<>();
        for(Task t:list){
            if(t.getStatus().equals(status)){
                list.add(t);
            }
        }
        return list;
    }
    public void updateStatus(int id,TaskStatus status){
        for(Task t: list ){
            if(t.getId()==id){
                t.setStatus(status);
            }
        }
    }
}
