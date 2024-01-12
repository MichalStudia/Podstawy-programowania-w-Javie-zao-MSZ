import java.util.*;

public class Zad5 {

    public static void main(String[] args)
    {
        int minVal = 1;
        int maxVal = 10;

        int n = LoadNum("Podaj zmienną n: ");

        int[] tab = new int[n];
        for(int i = 0; i < n; i++)
            tab[i] = Generate(minVal, maxVal);

        System.out.println("Wartości tablicy: " + Arrays.toString(tab));
        System.out.println("Ilość unikalnych wartości w tablicy wynosi: " + UniqNumCount(tab));
    }

    public static int Generate(int minValue, int maxValue)
    {
        int numOfNumbers = maxValue - minValue;
        Random random = new Random();
        return random.nextInt(numOfNumbers) + minValue;
    }

    public static int LoadNum(String text)
    {
        Scanner scanner = new Scanner(System.in);
        int n;

        while(true) {
            System.out.println(text);

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("To nie jest liczba naturalna!");
                continue;
            }
            n = scanner.nextInt();
            if(n <= 1 || n > 100)
                System.out.println("N nie może być mniejsze od 2 i większe od 100!");
            else
                break;
        }
        return n;
    }

    public static int UniqNumCount(int[] tab) {
        // version A with distinct function

//        int[] uniqNum = Arrays.stream(tab).distinct().toArray();
//        return uniqNum.length;

        // version B with list

//        ArrayList<Integer> uniqNum = new ArrayList<Integer>();
//        for (int j : tab) {
//            if (!uniqNum.contains(j))
//                uniqNum.add(j);
//        }
//
//        return uniqNum.size();

        // version C with only arrays

        int[] uniqNum = new int[tab.length];
        int last = 0;

        for (int k : tab) {
            boolean found = false;
            for (int j = 0; j < last; j++) {
                if (k == uniqNum[j]) {
                    found = true;
                    break;
                }
            }

            if (found)
                continue;
            uniqNum[last] = k;
            last++;
        }
        return last;
    }
}
