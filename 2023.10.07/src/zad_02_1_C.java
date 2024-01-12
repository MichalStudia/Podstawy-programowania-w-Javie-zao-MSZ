import java.util.Scanner;
import static java.lang.Math.sqrt;

public class zad_02_1_C {

    public static void main (String []args)
    {
        System.out.println("Podpunkt C:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            if (sqrt(liczba) % 2 == 0)
                ++suma;
        } while (step++ < iloscLiczb);
        System.out.println("Liczb, które są kwadratami liczby parzystej jest: " + suma);
    }
}
