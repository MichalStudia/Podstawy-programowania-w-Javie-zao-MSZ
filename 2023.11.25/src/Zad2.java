import java.util.*;

public class Zad2 {

    public static void main(String[] args)
    {
        int minVal = 0;
        int maxVal = 9;
        int column = LoadNum("Podaj ilość kolumn w macierzy: ");
        int row = LoadNum("Podaj ilość wierszy w macierzy: ");
        int[][] matrix1 = Matrix(column, row, minVal, maxVal);
        int[][] matrix2 = Matrix(column, row, minVal, maxVal);

        SumOfMatrix(matrix1, matrix2, column, row);
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

    public static int[][] Matrix(int column, int row, int minVal, int maxVal)
    {
        int[][] matrix = new int[row][column];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
                matrix[i][j] = Generate(minVal, maxVal) ;
        }
        return matrix;
    }

    public static void SumOfMatrix(int[][] matrix1, int[][] matrix2, int column, int row)
    {
        int[][] sum = new int[row][column];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
        }

        System.out.println("Pierwsza macierz: ");
        DrawMatrix(matrix1);
        System.out.println("Druga macierz: ");
        DrawMatrix(matrix2);
        System.out.println("Suma macierzy wynosi: ");
        DrawMatrix(sum);
    }
}
