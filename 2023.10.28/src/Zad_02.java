import java.util.Scanner;

public class Zad_02 {

    private static boolean IsLeapYear(int year)
    {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else return year % 4 == 0;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = CheckYear(scanner);

        if (IsLeapYear(year))
            System.out.println("Rok " + year + " jest przestepny.");
        else
            System.out.println("Rok " + year + " nie jest przestepny.");
    }
}
