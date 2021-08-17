package com.github.vihaan.lotsthingstodo.tasks;

import com.github.vihaan.lotsthingstodo.categories.Category;

import java.time.LocalDate;
import java.util.Objects;

public class Task {

    private final String title;
    private final String description;
    private final Severity severity;
    private final Status status;
    private final int progress;

    private final LocalDate creationDate;
    private final LocalDate deadline;

    private final Category category;

    public Task(String title, String description,
                Severity severity, Status status,
                int progress, LocalDate deadline,
                Category category) {
        this.title = title;
        this.description = description;
        this.severity = severity;
        this.status = status;
        this.progress = progress;
        creationDate = LocalDate.now();
        this.deadline = deadline;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public Status getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) && severity == task.severity && status == task.status && Objects.equals(creationDate, task.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, severity, status, creationDate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", severity=" + severity +
                ", status=" + status +
                ", progress=" + progress +
                ", creationDate=" + creationDate +
                ", deadline=" + deadline +
                '}';
    }
}
