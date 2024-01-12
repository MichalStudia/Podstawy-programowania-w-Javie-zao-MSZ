import java.util.Scanner;

public class zad_01_H {

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
            if (step % 2 != 0)
                suma += liczba;
            else
                suma -= liczba;
        } while (step++ < iloscLiczb);
        System.out.println("Suma wynosi : " + suma);
    }
}