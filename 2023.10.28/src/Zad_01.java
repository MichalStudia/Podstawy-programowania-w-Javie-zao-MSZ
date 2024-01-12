import java.util.Scanner;

public class Zad_01 {

    private static int CheckMonth(Scanner scanner)
    {
        int month;
        while(true)
        {
            System.out.println("Podaj numer miesiaca od 1 do 12: ");
            if(!scanner.hasNextInt())
            {
                scanner.next();
                System.out.println("To nie jest liczba naturalna!");
                continue;
            }
            month = scanner.nextInt();
            if (month < 0 || month > 12)
                System.out.println("Taki miesiac nie istnieje!");
            else
                break;
        }
        return month;
    }

    private static int CheckYear(Scanner scanner)
    {
        int year;
        while(true)
        {
            System.out.println("Podaj rok: ");
            if(!scanner.hasNextInt())
            {
                scanner.next();
                System.out.println("To nie jest liczba naturalna!");
                continue;
            }
            year = scanner.nextInt();
            break;
        }
        return year;
    }

    private static boolean IsLeapYear(int year)
    {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else return year % 4 == 0;
    }

    private static int DaysInMonth(int month, int year)
    {
        int[] numbersOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(IsLeapYear(year) && month == 2)
            return 29;
        return numbersOfDays[month-1];
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int month = CheckMonth(scanner);
        int year = CheckYear(scanner);

        System.out.println("Ten miesiac ma " + DaysInMonth(month, year) + " dni w roku " + year);
    }
}
