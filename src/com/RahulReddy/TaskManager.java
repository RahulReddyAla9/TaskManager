package com.RahulReddy;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

class TaskManager {
    InMemoryTaskRepository repository=new InMemoryTaskRepository();

    public void toAddTask(Task task) {
        repository.toAddTask(task);
    }
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
}

