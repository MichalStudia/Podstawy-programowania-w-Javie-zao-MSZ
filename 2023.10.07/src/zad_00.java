import java.util.Scanner;

public class zad_00 {

    private static void zad1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        System.out.println("Podwojona wartosc liczby: " + (2*liczba));
    }

    public static void main(String[] args)
    {
        zad1();
    }
}