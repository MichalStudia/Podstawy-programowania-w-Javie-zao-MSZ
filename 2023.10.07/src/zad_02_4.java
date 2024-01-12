import java.util.Scanner;

public class zad_02_4 {

    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        int step = 1;

        do
        {
            System.out.println("Podaj liczbe nr " + step);
            float liczba = scanner.nextFloat();
            if (liczba > max)
                max = liczba;
            if (liczba < min)
                min = liczba;
        } while (step++ < iloscLiczb);
        System.out.println("Najmniejsza liczba to: " + min + "\nNajwiększa liczba to: " + max);
    }
}
