package com.design.observer;

import java.util.ArrayList;

interface Observer {
    public void update(float interest);
}

interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}

class Loan implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String type;
    private float interest;
    private String bank;

    public Loan(String type, float interest, String bank) {
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
        notifyObservers();
    }

    public String getBank() {
        return this.bank;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            System.out
                    .println("Notifying Observers on change in Loan interest rate");
            ob.update(this.interest);
        }

    }

}

class Newspaper implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
    }
}

class Internet implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Internet: Interest Rate updated, new Rate is: "
                + interest);
    }
}


