import java.util.Scanner;


public class zad_02_1_D {

    public static void main (String []args)
    {
        System.out.println("Podpunkt D:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą n większą od 2: ");
        int iloscLiczb = scanner.nextInt();
        if (iloscLiczb < 3)
        {
            System.out.println("Liczba musi być większa niż 2!");
            return;
        }

        int prev, current, next;
        int suma = 0;
        int step = 1;
        System.out.println("Podaj liczbe nr " + step++);
        prev = scanner.nextInt();
        System.out.println("Podaj liczbe nr " + (step++));
        current = scanner.nextInt();

        do
        {
            System.out.println("Podaj liczbe nr " + step);
            next = scanner.nextInt();
            if (current < (prev+next)/2)
                ++suma;
            prev = current;
            current = next;
        } while (step++ < iloscLiczb);
        System.out.println("Liczb, które spełniają warunek jest: " + suma);
    }
}
