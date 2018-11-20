package me.leap;

public class Leap {

    public boolean isLeapYear(int year) {

        boolean leap = false;
        if ((year % 400) == 0) {
            leap = true;
        }
        else if (((year % 4) == 0) && ((year % 100) != 0)) {
            leap = true;
        }

        return leap;
    }
}
