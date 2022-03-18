package mypac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Напишете програма SpringSeason, в която дефинирате 2 int променливи - month & day.
Програмата трябва да отпечатва true ако денят е между 20ти Март (включително) и 20ти Юни (включително) и false в противен случай.
Булева стойност на израза ? „yes” : “false”
 */

public class SpringSeason {

    public static boolean SpringTimeCheck(int day, int month) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM");
        Date springStart = sdf.parse("20-03");
        Date springEnd = sdf.parse("20-06");

        String dateString = Integer.toString(day) + "-" + Integer.toString(month);
        Date date = sdf.parse(dateString);

        if(date.after(springStart) && date.before(springEnd))
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws ParseException {
        int day = 20;
        int month = 4;
        Boolean result = SpringTimeCheck(day, month);
        System.out.println(result);

        // Булева стойност на израза ? „yes” : “false”
        String s = result ? "yes" : "false";
        System.out.println(s);
    }
}
