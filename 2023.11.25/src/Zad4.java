import java.util.Random;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args)
    {
        int minVal = 0;
        int maxVal = 9;

        int n = LoadNum("Podaj zmienną n: ");

        int[][] matrix = Matrix(n, n, minVal, maxVal);
        DrawMatrix(matrix);
        AboveDiagonal(matrix);
        UnderDiagonal(matrix);
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
            if(n < 1)
                System.out.println("N nie może być mniejsze od 1!");
            else
                break;
        }
        return n;
    }

    public static void DrawMatrix(int[][] matrix)
    {
        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + "  ");
            System.out.println();
        }
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

    public static void AboveDiagonal(int[][] matrix)
    {
        int sum = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = i+1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Suma elementów leżących nad główną przekątną wynosi: " + sum);
    }

    public static void UnderDiagonal(int[][] matrix)
    {
        int sum = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                sum += matrix[i][j];
            }
        }
        System.out.println("Suma elementów leżących pod główną przekątną wynosi: " + sum);
    }
}
