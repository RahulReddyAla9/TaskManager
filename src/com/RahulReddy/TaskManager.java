package com.RahulReddy;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

class TaskManager {
    TaskRepository repository=new TaskFileRepository();

    public void toAddTask(Task task) {repository.toAddTask(task); }
    public List<Task> toDisplayTask(){
        return repository.toDisplayTask();
    }
    public void toDeleteTask(int taskId){
        repository.toDeleteTask(taskId);
    }
    public Task toSearchById(int taskId){
        return repository.toSearchById(taskId);
    }
    public List<Task> listByStatus(TaskStatus status){
        return repository.listByStatus(status);
    }
    public void updateStatus(int taskId,TaskStatus status) {
        repository.updateStatus(taskId, status);
    }
    public int totalTasks(){return repository.totalTasks();}
    public List<Task> getPendingTasks(){return repository.getPendingTasks(); }
    public List<Task> getTodayTasks(){ return repository.getTodayTasks();}
}

