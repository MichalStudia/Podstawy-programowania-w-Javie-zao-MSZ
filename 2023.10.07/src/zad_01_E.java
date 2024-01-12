import java.util.Scanner;
import static java.lang.Math.abs;

public class zad_01_E {

    public static void main (String []args)
    {
        System.out.println("Podpunkt E:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 1;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            suma *= abs(liczba);
        } while (step++ < iloscLiczb);
        System.out.println("Iloraz liczb bezwzglednych wynosi: " + suma);
    }
}