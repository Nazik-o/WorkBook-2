package com.pluralsight;
//String title
//LocalDate Due date
//String reminder (yes or no boolean)
//Boolean Complete or incomplete
//String NotificationMessage
//Urgency

import java.time.LocalDateTime;

public class Task {
    //Instance variable: a variable linked to a Class / Object
    private String title;
    private LocalDateTime dueDate;
    private boolean completed;
    private String urgency;
    private String notificationMessage;
    private boolean reminder;

    //Create a constructor
    public Task (String _title){
        this.title = _title;
        this.completed = false;
    }

    //Step 4 — Add a toString() method
    //This controls how the task is printed:
    // Setters and Getters
    //dueDate
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
    public LocalDateTime getDueDate() {
        return dueDate;
    }
//urgency
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
    public String getUrgency() {
        return urgency;
    }
//notification
    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
    public String getNotificationMessage() {
        return notificationMessage;
    }
//reminder
    public void setReminder(boolean reminder) {
        this.reminder = reminder;
    }
    //for better understand used has instead of get
    public boolean hasReminder() {
        return reminder;
    }

//Setter
    public void markCompleted() {
        this.completed = true;
    }
    public boolean isCompleted() {
        return completed;
    }

    // Override toString
    @Override
    public String toString() {
        String status = completed ? "[✓]" : "[ ]";
        String due = (dueDate != null) ? dueDate.toString() : "No due date";
        String remind = reminder ? "Yes" : "No";
        String urgent = (urgency != null) ? urgency : "Normal";

        return String.format("%s %s (Due: %s, Urgency: %s, Reminder: %s)", status, title, due, urgent, remind);
    }


    }



