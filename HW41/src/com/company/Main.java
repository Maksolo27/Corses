package com.company;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String stringMonth = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int day = sc.nextInt();
        int month;
        switch (stringMonth){
            case "January":
                month = Calendar.JANUARY;
                break;
            case "February":
                month = Calendar.FEBRUARY;
                break;
            case "March":
                month = Calendar.MARCH;
                break;
            case "April":
                month = Calendar.APRIL;
                break;
            case "May":
                month = Calendar.MAY;
                break;
            case "June":
                month = Calendar.JUNE;
                break;
            case "July":
                month = Calendar.JULY;
                break;
            case "August":
                month = Calendar.AUGUST;
                break;
            case "September":
                month = Calendar.SEPTEMBER;
                break;
            case "October":
                month = Calendar.OCTOBER;
                break;
            case "November":
                month = Calendar.NOVEMBER;
                break;
            case "December":
                month = Calendar.DECEMBER;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + stringMonth);
        }


        GregorianCalendar gc = new GregorianCalendar(year,month ,day);
        Age.age(gc);
    }

}
class Age {
    public static void age(GregorianCalendar gc) {
        long time = gc.getTimeInMillis();
        GregorianCalendar currentDate = new GregorianCalendar();
        long currentTime = currentDate.getTimeInMillis();
        long age = currentTime - time;
        Date ageDate = new Date(age);
        GregorianCalendar ageCallendar = new GregorianCalendar();
        ageCallendar.setTime(ageDate);
        int resultYear = ageCallendar.get(Calendar.YEAR) - 1970;
        int resultMonth = ageCallendar.get(Calendar.MONTH);
        int resultDay = ageCallendar.get(Calendar.DAY_OF_YEAR) - resultMonth * 31;
        System.out.println("Вам " + resultYear + " лет " + resultMonth + " месяцев " + resultDay + " дней");

    }
}


