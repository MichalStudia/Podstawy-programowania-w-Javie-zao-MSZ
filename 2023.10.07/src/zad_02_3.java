import java.util.Scanner;

public class zad_02_3 {

    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int sumaZer = 0;
        int sumaDodatnich = 0;
        int sumaUjemnych = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            float liczba = scanner.nextFloat();
            if (liczba == 0)
                ++sumaZer;
            else if (liczba > 0)
                ++sumaDodatnich;
            else
                ++sumaUjemnych;
        } while (step++ < iloscLiczb);
        System.out.println("Zer jest: " + sumaZer + "\nLiczb dodatnich jest: " + sumaDodatnich + "\nLiczb ujemnych jest: " + sumaUjemnych);
    }
}
