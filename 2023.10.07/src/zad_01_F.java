import java.util.Scanner;
import static java.lang.Math.pow;

public class zad_01_F {

    public static void main (String []args)
    {
        System.out.println("Podpunkt F:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            suma += pow(liczba, 2);
        } while (step++ < iloscLiczb);
        System.out.println("Suma poteg liczb wynosi: " + suma);
    }
}