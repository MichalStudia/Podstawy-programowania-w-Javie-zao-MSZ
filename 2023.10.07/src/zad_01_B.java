import java.util.Scanner;

public class zad_01_B {

    public static void main(String []args)
    {
        System.out.println("Podpunkt B:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 1;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            suma *= liczba;
        } while (step++ < iloscLiczb);
        System.out.println("Iloraz liczb wynosi: " + suma);
    }
}