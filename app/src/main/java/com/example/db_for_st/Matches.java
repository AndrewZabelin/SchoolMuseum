package com.example.db_for_st;

import java.io.Serializable;

public class Matches implements Serializable {
    private long id;
    private String name;
    private String history;
    private int years;
    private int goalsguest;

    public Matches(long id, String nm, String hs, int ye, int gg) {
        this.id = id;
        this.name = nm;
        this.history = hs;
        this.years = ye;
        this.goalsguest=gg;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHistory() {
        return history;
    }

    public int getYears() {
        return years;
    }

    public int getGoalsguest() {
        return goalsguest;
    }
}