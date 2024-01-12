import java.util.Scanner;
import static java.lang.Math.pow;

public class zad_02_1_E {

    private static int silnia(int liczba)
    {
        int wynik = 1;
        for (int i = 1; i <= liczba; i++)
            wynik *= i;
        return wynik;
    }

    public static void main (String []args)
    {
        System.out.println("Podpunkt E:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            if (pow(2, step) < liczba && liczba < silnia(step))
                ++suma;
        } while (step++ < iloscLiczb);
        System.out.println("Liczb, które spełniają warunek jest: " + suma);
    }
}
