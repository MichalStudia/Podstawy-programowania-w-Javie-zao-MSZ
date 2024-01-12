class Complex {
    private final int x;
    private final int y;

    public Complex(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void write()
    {
        System.out.println(y != 0 ? x != 0 ? x + " + " + y + "i" : y + "i" : x);
    }

    public Complex add(Complex other)
    {
        return new Complex(x + other.x, y + other.y);
    }

    public Complex sub(Complex other)
    {
        return new Complex(x - other.x, y - other.y);
    }

    public Complex multiply(Complex other)
    {
        int newX = x * other.x - y * other.y;
        int newY = x * other.y + y * other.x;
        return new Complex(newX,newY);
    }
}

 class Zadanie4 {
    public static void main(String[] args)
    {
        Complex num1 = new Complex(5, 7);
        Complex num2 = new Complex(3, 4);

        System.out.print("Pierwsza liczba zespolona: ");
        num1.write();
        System.out.print("Druga liczba zespolona: ");
        num2.write();

        System.out.print("Wynik po dodaniu: ");
        num1.add(num2).write();
        System.out.print("Wynik po odejmowaniu: ");
        num1.sub(num2).write();
        System.out.print("Wynik po mnożeniu: ");
        num1.multiply(num2).write();
    }
}
