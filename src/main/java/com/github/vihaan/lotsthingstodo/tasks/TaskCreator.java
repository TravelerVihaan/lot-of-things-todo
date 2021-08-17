package com.github.vihaan.lotsthingstodo.tasks;

import com.github.vihaan.lotsthingstodo.categories.Category;

import java.time.LocalDate;

class TaskCreator {

    Task createTask(String title, String description, Severity severity, LocalDate deadline, Category category){
        Task task = new Task(title, description, severity, Status.NEW, 0, deadline, category);
        return task;
    }
}
