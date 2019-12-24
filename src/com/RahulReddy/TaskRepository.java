package com.RahulReddy;

import java.util.List;

public interface TaskRepository {
    public void toAddTask(Task task);
    public List<Task> toDisplayTask();
    public void toDeleteTask(int taskId);
    public Task toSearchById(int taskId);
    public List<Task> listByStatus(TaskStatus status);
    public void updateStatus(int taskId,TaskStatus status);
}
