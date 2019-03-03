package org.bridge.demo;

import java.util.Scanner;

/**
 * 从键盘输入一个日期，格式为yyyy-M-d
 * 要求计算该日期与1949年10月1日距离多少天
 * 例如：
 * 用户输入了：1949-10-2
 * 程序输出：1
 * 用户输入了：1949-11-1
 * 程序输出：31
 *
 * @author times
 * Time: 2017-11-12 16:26
 */
public class Demo12 {

    public Demo12() {
        Scanner scanner = new Scanner(System.in);
        String startDayString = "1949-10-01";
        String endDayString = scanner.nextLine();
        int num = apartDays(startDayString, endDayString);
        System.out.println(num);
    }

    public static int dayOfYear[] = {365, 366};//平年365天,闰年366天

    public static int dayOfMonth[][] = {
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    public static int dayOfYearIndex(int year) { //根据是否是闰年来给出dayOfYear的数组的下标
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 1;
        }
        return 0;
    }

    public static int dayApartFromTheBrginOfYear(int year, int month, int day) {//计算month月day日是year年的第几天
        int days = day;
        for (int i = 1; i < month; i++) {
            days += dayOfMonth[dayOfYearIndex(year)][i];
        }
        return days;
    }

    public static int apartDays(String startDayString, String endDayString) {
        String s1[] = startDayString.split("-");
        String s2[] = endDayString.split("-");
        int days = 0;
        int flag;
        int startYear = Integer.parseInt(s1[0]);
        int endYear = Integer.parseInt(s2[0]);
        int startMonth = Integer.parseInt(s1[1]);
        int endMonth = Integer.parseInt(s2[1]);
        int startDay = Integer.parseInt(s1[2]);
        int endDay = Integer.parseInt(s2[2]);
        for (int i = startYear; i < endYear; i++) {
            days += dayOfYear[dayOfYearIndex(i)];
        }
        days += dayApartFromTheBrginOfYear(endYear, endMonth, endDay);
        days -= dayApartFromTheBrginOfYear(startYear, startMonth, startDay);
        return days;
    }
}
