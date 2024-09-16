package services;

import java.util.ArrayList;

import interfaces.Count;

public class Counter {
    Integer userId;

    public ArrayList<Count> counters = new ArrayList<>();

    protected boolean isLoggedIn = false;

    public Counter(int userId) {
        this.userId = userId;
    }

    protected void increment() {

    }
}
