import static java.lang.Math.abs;

class RationalNum {

    private int numerator;

    private int denominator;

    public RationalNum(int n, int d)
    {
        numerator = n;
        denominator = d;
    }

    public void write()
    {
        System.out.println(numerator + "/" + denominator);
    }

    public void whole()
    {
        int whole = numerator / denominator;
        int rest = numerator % denominator;

        System.out.println((whole != 0 ? whole : "") + " " + (rest != 0 ? rest + "/" + denominator : ""));
    }

    public int nwd()
    {
        int a = abs(numerator);
        int b = abs(denominator);

        while (a != b)
            if(a < b)
                b -= a;
            else
                a -= b;
        return a;
    }

    public void shorten()
    {
        int nwd = nwd();
        numerator /= nwd;
        denominator /= nwd;
    }
    
    public RationalNum multiply(RationalNum num2)
    {
        RationalNum newRational = new RationalNum(numerator * num2.numerator,denominator * num2.denominator);
        newRational.shorten();
        return newRational;
    }

    public RationalNum division(RationalNum num2)
    {
        RationalNum newRational = new RationalNum(numerator * num2.denominator,denominator * num2.numerator);
        newRational.shorten();
        return newRational;
    }
    
    public RationalNum add(RationalNum num2)
    {
        RationalNum newRational = new RationalNum(numerator * num2.denominator + num2.numerator * denominator, denominator * num2.denominator);
        newRational.shorten();
        return newRational;
    }

    public RationalNum sub(RationalNum num2)
    {
        RationalNum newRational = new RationalNum(numerator * num2.denominator - num2.numerator * denominator, denominator * num2.denominator);
        newRational.shorten();
        return  newRational;
    }
}

public class Zadanie3 {

    public static void main(String[] args)
    {
        RationalNum num1 = new RationalNum(6, 4);
        RationalNum num2 = new RationalNum(4, 16);

        System.out.print("Ułamek 1 to: ");
        num1.write();
        System.out.print("Ułamek 2 to: ");
        num2.write();
        System.out.println();


        System.out.print("Całości w ułamku 1 jest: ");
        num1.whole();
        System.out.print("Całości w ułamku 2 jest: ");
        num2.whole();
        System.out.println();

        System.out.println("NWD w ułamku pierwszym wynosi: " + num1.nwd());
        System.out.println("NWD w ułamku drugim wynosi: " + num2.nwd());
        System.out.println();

        System.out.print("Postać skrócona pierwszego ułamka to: ");
        num1.shorten();
        num1.write();
        System.out.print("Postać skrócona drugiego ułamka to: ");
        num2.shorten();
        num2.write();
        System.out.println();

        System.out.print("Suma ułamków wynosi: ");
        num1.add(num2).write();
        System.out.print("Po pomnożeniu ułamków otrzymujemy: ");
        num1.multiply(num2).write();
        System.out.print("Różnica ułamków wynosi: ");
        num1.sub(num2).write();
        System.out.print("Po podzieleniu ułamków otrzymujemy: ");
        num1.division(num2).write();
    }
}
