import java.util.Scanner;

public class Zad_03 {

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

    private static int DaysInMonth(int month, int year)
    {
        int[] numbersOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(IsLeapYear(year) && month == 2)
            return 29;
        return numbersOfDays[month-1];
    }


    private static int CheckDay(Scanner scanner, int month, int year)
    {
        int day;
        while(true)
        {
            System.out.println("Podaj dzien: ");
            if(!scanner.hasNextInt())
            {
                scanner.next();
                System.out.println("To nie jest liczba naturalna!");
                continue;
            }
            day = scanner.nextInt();

            if (day <= 0 || day > DaysInMonth(month, year))
                System.out.println("Nie ma takiego dnia!");
            else
                break;
        }
        return day;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = CheckYear(scanner);
        int month = CheckMonth(scanner);
        int day = CheckDay(scanner, month, year);

        String[] miesiace = {"stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "wrzesnia", "pazdziernika", "listopada", "grudnia"};
        System.out.println("Data to: " + day +" " + miesiace[month-1] + " " + year);
    }
}
