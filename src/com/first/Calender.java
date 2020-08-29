package com.first;

public class Calender {
    private int year;
    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
            } else
                isLeap = true;
        }

        return isLeap;
    }
}
