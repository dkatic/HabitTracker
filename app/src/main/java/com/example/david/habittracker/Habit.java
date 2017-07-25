package com.example.david.habittracker;

public class Habit {

    private int id;
    private String name;
    private String description;
    private long date;
    private long duration;

    public Habit(int id, String name, String description, long date, long duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
    }

    public Habit(String name, String description, long date, long duration) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public long getDate() {
        return date;
    }

    public long getDuration() {
        return duration;
    }

}
