import java.util.Scanner;
public class zad_01_G {

    public static void main (String []args)
    {
        System.out.println("Podpunkt G:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n : ");
        int iloscLiczb = scanner.nextInt();
        int suma = 0;
        int suma2 = 1;
        int step = 1;
        do
        {
            System.out.println("Podaj liczbe nr " + step);
            int liczba = scanner.nextInt();
            suma += liczba;
            suma2 *= liczba;
        } while (step++ < iloscLiczb);
        System.out.println("Suma ciągu wynosi : " + suma + "\nIloczyn ciagu wynosi: " + suma2);
    }
}