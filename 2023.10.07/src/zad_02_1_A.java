import java.util.Scanner;

public class zad_02_1_A {

    public static void main (String []args)
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
            if (liczba % 2 != 0)
                ++suma;
        } while (step++ < iloscLiczb);
        System.out.println("Wśród podanych liczb nieparzystych jest : " + suma);
    }
}
