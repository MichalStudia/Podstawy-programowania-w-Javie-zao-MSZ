import java.util.Scanner;

public class zad_01_A {

    public static void main(String []args)
    {
        System.out.println("Podpunkt A:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 0;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            suma += liczba;
        } while (step++ < iloscLiczb);
        System.out.println("Suma wynosi: " + suma);
    }
}