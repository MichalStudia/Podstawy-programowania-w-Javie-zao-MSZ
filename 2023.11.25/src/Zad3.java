import java.util.Random;
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args)
    {
        int minVal = 0;
        int maxVal = 9;

        int m = LoadNum("Podaj zmienną m z przedziału [1; 10]: ");
        int n = LoadNum("Podaj zmienną n z przedziału [1; 10]: ");
        int k = LoadNum("Podaj zmienną k z przedziału [1; 10]: ");

        int[][] matrixA = Matrix(m, n, minVal, maxVal);
        int[][] matrixB = Matrix(n, k, minVal, maxVal);

        ProductOfMatrix(matrixA, matrixB, m, n, k);
    }

    public static int Generate(int minValue, int maxValue)
    {
        int numOfNumbers = maxValue - minValue;
        Random random = new Random();
        return random.nextInt(numOfNumbers) + minValue;
    }

    public static int[][] Matrix(int row, int column, int minVal, int maxVal)
    {
        int[][] matrix = new int[row][column];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
                matrix[i][j] = Generate(minVal, maxVal) ;
        }
        return matrix;
    }

    public static void DrawMatrix(int[][] matrix)
    {
        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + "  ");
            System.out.println();
        }
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
            if(n > 10 || n < 1)
                System.out.println("Liczba nie należy do przedziału!");
            else
                break;
        }
        return n;
    }

    public static void ProductOfMatrix(int[][] matrixA, int[][] matrixB, int m, int n, int k)
    {
        int[][] matrixC = new int[m][k];

        for(int i = 0; i < m; i++)
        {
            for (int j = 0; j < k; j++)
            {
                for (int e = 0; e < n; e++)
                {
                    matrixC[i][j] += matrixA[i][e] * matrixB[e][j];
                }
            }
        }

        System.out.println("Pierwsza macierz: ");
        DrawMatrix(matrixA);
        System.out.println("Druga macierz: ");
        DrawMatrix(matrixB);
        System.out.println("Suma macierzy wynosi: ");
        DrawMatrix(matrixC);
    }
}

