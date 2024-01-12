import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {


    public static void main(String[] args)
    {
        Test();

        int n = LoadNumber();
        int[] tab = new int[n];

        int minValue = -10;
        int maxValue = 10;

        int right = 6;
        int left = 2;

       Generate(tab, n, minValue, maxValue);

       System.out.println("Wartości tablicy: " + Arrays.toString(tab));
       System.out.println();

       System.out.println("Liczba nieparzystych liczb: " + OddCount(tab));
       System.out.println("Liczba parzystych liczb: " + EvenCount(tab));
       System.out.println();

       System.out.println("Liczba dodatnich liczb: " + PositiveCount(tab));
       System.out.println("Liczba ujemnych liczb: " + NegativeCount(tab));
       System.out.println("Liczba zer: " + ZeroCount(tab));
       System.out.println();

       System.out.println("Liczba wystąpień maksymalnych wartości: " + MaxCount(tab));
       System.out.println();

       System.out.println("Suma liczb dodatnich wynosi: " + PositiveSum(tab));
       System.out.println("Suma liczb ujemnych wynosi: " + NegativeSum(tab));
       System.out.println();

       System.out.println("Najdłuższa sekwencja liczb dodatnich wynosi: " + MaxPositiveSequence(tab));
       System.out.println();

       Signum(tab);
       System.out.println("Tablica z przeciwnymi wartościami" + Arrays.toString(tab));
       System.out.println();

       ReverseFragment(tab, left, right);
       System.out.println("Tablica z zamienionymi miejscami liczbami: " + Arrays.toString(tab));
       System.out.println();
    }

    public static int LoadNumber()
    {
        Scanner scanner = new Scanner(System.in);
        int n;

        while(true)
        {
            System.out.println("Podaj liczbę n z przedziału 1<n<=100 : ");

            if(!scanner.hasNextInt())
            {
                scanner.next();
                System.out.println("To nie jest liczba naturalna!");
                continue;
            }

            n = scanner.nextInt();

            if(n > 100 || n <= 1)
                System.out.println("Liczba nie należy do przedziału 1<n<100!");
            else
                break;
        }
        return n;
    }

    public static void Generate(int[] tab, int n, int minValue, int maxValue)
    {
        int numOfNumbers = maxValue - minValue;
        Random random = new Random();
        for(int i = 0; i < n; i++)
            tab[i] = random.nextInt(numOfNumbers) + minValue;
    }

    public static int NegativeCount(int[] tab)
    {
        int negative = 0;
        for (int i : tab) {
            if (i < 0)
                negative++;
        }
        return negative;
    }

    public static int PositiveCount(int[] tab)
    {
        int positive = 0;
        for (int i : tab) {
            if (i > 0)
                positive++;
        }
        return positive;
    }

    public static int EvenCount(int[] tab)
    {
        int even = 0;
        for (int i : tab) {
            if (i % 2 == 0 && i != 0)
                even++;
        }
       return even;
    }

    public static int OddCount(int[] tab)
    {
        int odd = 0;
        for (int j : tab) {
            if (j % 2 != 0)
                odd++;
        }
        return odd;
    }

    public static int ZeroCount(int[] tab)
    {
        int zero = 0;
        for (int j : tab) {
            if (j == 0)
                zero++;
        }
        return zero;
    }

    public static int MaxCount(int[] tab)
    {
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        for (int j : tab){
            if(j > max)
            {
                max = j;
                maxCount = 0;
            }
            if(j == max)
                maxCount++;
        }
        return maxCount;
    }

    public static int PositiveSum(int[] tab)
    {
        int sum = 0;
        for (int i : tab)
            if (i > 0)
                sum += i;
        return sum;
    }

    public static int NegativeSum(int[] tab)
    {
        int sum = 0;
        for (int i : tab)
            if (i < 0)
                sum += i;
        return sum;
    }

    public static int MaxPositiveSequence(int[] tab)
    {
        int maxSeq = 0;
        int seq = 0;
        for (int j : tab) {
            if(j > 0){
                ++seq;
                if(seq > maxSeq)
                    maxSeq = seq;
            }
            else
                seq = 0;
        }
        return maxSeq;
    }

    public static void Signum(int[] tab)
    {
        for(int i = 0; i < tab.length; i++) {
            tab[i] *= -1;
        }
    }

    public static void ReverseFragment(int[] tab, int left, int right)
    {

        if(left >= right)
            System.out.println("Lewa granica nie może być większa, bądź równa prawej! Tablica zostanie niezmieniona!");
        else if (left < 0) {
            System.out.println("Lewa granica nie może być mniejsza od 0! Tablica zostanie niezmieniona!");
        } else if (tab.length <= right) {
            System.out.println("Podane parametry wykraczają poza granicę tablicy! Tablica zostanie niezmieniona!");
        }
        else{
            int half = (right - left + 1) /2;
            for (int i = 0; i < half; i++)
            {
                int temp = tab[left+i];
                tab[left+i] = tab[right-i];
                tab[right-i] = temp;
            }
        }
    }

    public static void Test()
    {
        int[] tab = {-10, 9, -4, 9, -5, 0, 0, 9, 9, 3} ;
        if(NegativeCount(tab) != 3)
            System.out.println("Funkcja NegativeCount nie działa prawidłowo!");
        if(PositiveCount(tab) != 5)
            System.out.println("Funkcja PositiveCount nie działa prawidłowo!");
        if(EvenCount(tab) != 2)
            System.out.println("Funkcja EvenCount nie działa prawidłowo!");
        if(OddCount(tab) != 6)
            System.out.println("Funkcja OddCount nie działa prawidłowo!");
        if(ZeroCount(tab) != 2)
            System.out.println("Funkcja ZeroCount nie działa prawidłowo!");
        if(MaxCount(tab) != 4)
            System.out.println("Funkcja MaxCount nie działa prawidłowo!");
        if(PositiveSum(tab) != 39)
            System.out.println("Funkcja PositiveSum nie działa prawidłowo!");
        if(NegativeSum(tab) != -19)
            System.out.println("Funkcja NegativeSum nie działa prawidłowo!");
        if(MaxPositiveSequence(tab) != 3)
            System.out.println("Funkcja MaxPositiveSequence nie działa prawidłowo!");
    }
}
