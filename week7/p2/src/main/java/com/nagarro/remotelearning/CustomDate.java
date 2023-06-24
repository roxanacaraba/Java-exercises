package com.nagarro.remotelearning;

import java.util.Date;

public class CustomDate extends Date {
    private DaysOfTheWeek currentDay;
    private MonthsOfTheYear currentMonth;
    private int currentYear;

    public CustomDate() {
        this.setCurrentDay();
        this.setCurrentMonth();
        this.setCurrentYear();
        currentDay = this.getCurrentDay();
        currentMonth = this.getCurrentMonth();
        currentYear = this.getCurrentYear();
    }

    public DaysOfTheWeek getCurrentDay() {
        return this.currentDay;
    }

    public void setCurrentDay() {
        switch (super.getDay()) {
            case 0 -> currentDay = DaysOfTheWeek.SUNDAY;
            case 1 -> currentDay = DaysOfTheWeek.MONDAY;
            case 2 -> currentDay = DaysOfTheWeek.TUESDAY;
            case 3 -> currentDay = DaysOfTheWeek.WEDNESDAY;
            case 4 -> currentDay = DaysOfTheWeek.THURSDAY;
            case 5 -> currentDay = DaysOfTheWeek.FRIDAY;
            case 6 -> currentDay = DaysOfTheWeek.SATURDAY;
        }
    }

    public MonthsOfTheYear getCurrentMonth() {
        return this.currentMonth;
    }

    public void setCurrentMonth() {
        switch (super.getMonth()) {
            case 0 -> currentMonth = MonthsOfTheYear.JANUARY;
            case 1 -> currentMonth = MonthsOfTheYear.FEBRUARY;
            case 2 -> currentMonth = MonthsOfTheYear.MARCH;
            case 3 -> currentMonth = MonthsOfTheYear.APRIL;
            case 4 -> currentMonth = MonthsOfTheYear.MAY;
            case 5 -> currentMonth = MonthsOfTheYear.JUNE;
            case 6 -> currentMonth = MonthsOfTheYear.JULY;
            case 7 -> currentMonth = MonthsOfTheYear.AUGUST;
            case 8 -> currentMonth = MonthsOfTheYear.SEPTEMBER;
            case 9 -> currentMonth = MonthsOfTheYear.OCTOBER;
            case 10 -> currentMonth = MonthsOfTheYear.NOVEMBER;
            case 11 -> currentMonth = MonthsOfTheYear.DECEMBER;
        }
    }

    public int getCurrentYear() {
        return this.currentYear;
    }

    public void setCurrentYear() {
        this.currentYear = super.getYear() + 1900;
    }

    public String printCurrentDate() {
        return this.currentDay + " " + super.getDate() + " " + this.currentMonth + " " + this.currentYear;
    }
}

