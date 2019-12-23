package com.RahulReddy;


import java.text.SimpleDateFormat;
import java.util.Date;

enum taskStatus{CREATED,IN_PROGRESS,DONE;}

class Task {
    private String name;
    private String details;
    private Date dueDate;
    private taskStatus status;


    //private TaskStatus status;
    Task(String name, String details, Date dueDate, taskStatus status) {
        this.name = name;
        this.details = details;
        this.dueDate = dueDate;
        this.status=status;
    }
    public taskStatus getStatus() {
        return status;
    }

    public void setStatus(taskStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat time=new SimpleDateFormat("dd/MM/yyyy");
        return "Task{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", dueDate=" + time.format(dueDate) +
                ", status=" + status +
                '}';
    }
}
