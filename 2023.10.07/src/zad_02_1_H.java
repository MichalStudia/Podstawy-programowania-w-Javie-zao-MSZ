import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class zad_02_1_H {

    public static void main (String []args)
    {
        System.out.println("Podpunkt H:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            if (abs(liczba) < pow(step, 2))
                ++suma;
        } while (step++ < iloscLiczb);
        System.out.println("Liczb, które spełniają warunek jest: " + suma);
    }
}
