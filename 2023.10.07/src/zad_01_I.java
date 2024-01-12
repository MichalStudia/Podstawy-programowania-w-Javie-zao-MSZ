import java.util.Scanner;

public class zad_01_I {

    private static int silnia(int liczba)
    {
        int wynik = 1;
        for (int i = 1; i <= liczba; i++)
        {
            wynik *= i;
        }
        return wynik;
    }

    public static void main (String []args)
    {
        System.out.println("Podpunkt I:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        float suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            float liczba = scanner.nextFloat();
            if (step % 2 == 0)
                suma += liczba/silnia(step);
            else
                suma -= liczba/silnia(step);
        } while (step++ < iloscLiczb);
        System.out.println("Suma wynosi : " + suma);
    }
}
