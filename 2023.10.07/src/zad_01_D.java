import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class zad_01_D {

    public static void main (String []args)
    {
        System.out.println("Podpunkt D:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        double suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            double liczba = scanner.nextDouble();
            suma += sqrt(abs(liczba));
        } while (step++ < iloscLiczb);
        System.out.println("Suma pierwistkow liczb wynosi: " + suma);
    }
}