package com.company;

public class MathEx {
    public static void main(String[] args) {
        System.out.println(swap(453));
        timeleft(3,34, 8, 56);
        dayOfWeek(6, 22);
    }
    public static int swap(int x) {
        int ones = x%10;
        int tens = x%100/10;
        int hunds = x/100;
                x = hunds*100 + ones*10 + tens;
        return x;
    }
    public static void timeleft (int currHour, int currMin, int depHour, int depMin) {
        int totalcurrtime = (currHour * 60 + currMin);
        int totaldeptime = (depHour * 60 + depMin);
        int differenceTime = (totaldeptime - totalcurrtime);
        int totalHourtime = (differenceTime /60);
        int totalMintime = (differenceTime % 60);
        System.out.println(totalHourtime + " hours " + totalMintime + " minutes");
    }
    public static void dayOfWeek (int dayOf1stWeek, int date) {
    int dayOftheWeek = ((date -1  + dayOf1stWeek) % 7);
        System.out.println("The day of the week for January " + date + " is " + dayOftheWeek);
    }

}
