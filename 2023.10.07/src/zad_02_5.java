import java.util.Scanner;

public class zad_02_5 {

    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą n większą od 1: ");
        int iloscLiczb = scanner.nextInt();
        if (iloscLiczb < 2)
        {
            System.out.println("Liczba musi być większa niż 1!");
            return;
        }

        float a, b;
        int suma = 0;
        int step = 1;
        System.out.println("Podaj liczbe nr " + step++);
        a = scanner.nextFloat();

        do
        {
            System.out.println("Podaj liczbe nr " + step);
            b = scanner.nextFloat();
            if (a > 0 && b > 0)
                ++suma;
            a = b;
        } while (step++ < iloscLiczb);
        System.out.println("Par, które spełniają warunek jest: " + suma);
    }
}
