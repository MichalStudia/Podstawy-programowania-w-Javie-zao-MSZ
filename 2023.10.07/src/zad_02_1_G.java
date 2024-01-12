import java.util.Scanner;

public class zad_02_1_G {

    public static void main (String []args)
    {
        System.out.println("Podpunkt G:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            if (liczba % 2 != 0 && liczba >= 0)
                ++suma;
        } while (step++ < iloscLiczb);
        System.out.println("Liczb, które spełniają warunek jest: " + suma);
    }
}
