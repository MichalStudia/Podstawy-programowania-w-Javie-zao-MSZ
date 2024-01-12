import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class zad_02_2 {

    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        float suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            float liczba = scanner.nextFloat();
            if (liczba > 0)
                suma += liczba;
        } while (step++ < iloscLiczb);
        System.out.println("Liczb, które spełniają warunek jest: " + suma*2);
    }
}
