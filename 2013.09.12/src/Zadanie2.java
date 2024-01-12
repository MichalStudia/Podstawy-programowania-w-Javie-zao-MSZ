import static java.lang.Math.abs;

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }

    public void writeDate()
    {
        System.out.println((day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year + "r.");
    }

    public void nextDay()
    {
        if(day == daysInMonth(month))
        {
            if(dayOfTheYear() >= daysInYear())
            {
                day = 1;
                month = 1;
                year++;
            }
            else
            {
                day = 1;
                month++;
            }
        }
        else
            day += 1;

        writeDate();
    }

    public void previousDay()
    {
        if(day == 1)
        {
            if(month  == 1)
            {
                day = 31;
                month = 12;
                year -= 1;
            }
            else
            {
                month -= 1;
                day = daysInMonth(month);
            }
        }
        else
            day -= 1;

        writeDate();
    }

    public boolean isLeapYear(int year)
    {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    private int daysInMonth(int month)
    {
        int[] numbersOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(year) && month == 2)
            return 29;
        return numbersOfDays[month-1];
    }

    private int daysInYear()
    {
        if(isLeapYear(year))
            return 366;
        else
            return 365;
    }

    public int dayOfTheYear()
    {
        int sumOfDays = 0;
        for(int i = 0; i < month-1; i++)
        {
            sumOfDays += daysInMonth(i+1);
        }

        return sumOfDays + day;
    }

    public int amountOfDays()
    {
        int sumOfDays = 0;
        if(year>0)
        {
            for(int i = 1; i < year; i++)
            {
                if(isLeapYear(i))
                    sumOfDays += 366;
                else
                    sumOfDays += 365;
            }

            int i = 1;
            while(i < month)
            {
                sumOfDays += daysInMonth(i+1);
                i++;
            }
            sumOfDays += day;
            return sumOfDays;
        }

        else
        {
            for(int i = 1; i > year; i--)
            {
                if(isLeapYear(i))
                    sumOfDays += 366;
                else
                    sumOfDays += 365;
            }

            int i = 1;
            while(i < month)
            {
                sumOfDays += daysInMonth(i+1);
                i++;
            }
            sumOfDays += day;
            return sumOfDays;
        }
    }
}


public class Zadanie2 {

    public static void main(String[] args)
    {
        int day = 14;
        int month = 12;
        int year = 2023;

        int day2 = 31;
        int month2 = 12;
        int year2 = 2023;

        Date date1 = new Date(day, month, year);
        Date date2 = new Date(day2, month2, year2);
        System.out.print("Pierwsza data to: ");
        date1.writeDate();
        System.out.println("Jest to " + date1.dayOfTheYear() + " dzień roku.");
        System.out.print("Następny dzień to: ");
        date1.nextDay();
        System.out.print("Poprzedni dzień to: ");
        date1.previousDay();
        System.out.println(date1.isLeapYear(year) ? year + " to rok przestępny" : year + " to nie jest rok przestępny");
        System.out.print("Druga data to: ");
        date2.writeDate();
        System.out.println("Różnica dni pomiędzy datami wynosi: " + abs(date1.amountOfDays() - date2.amountOfDays()));
    }
}