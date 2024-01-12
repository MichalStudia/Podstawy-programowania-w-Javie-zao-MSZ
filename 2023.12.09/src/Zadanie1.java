class Zegarek {

    private int godziny;
    private int minuty;
    private int sekundy;
    private boolean h24 = true;

    public Zegarek(int g, int m, int s) {
        godziny = g;
        minuty = m;
        sekundy = s;
    }

    public void zmienGodzine(int nowaGodzina) {
        if (nowaGodzina >= 0 && nowaGodzina < 24)
            godziny = nowaGodzina;
        else System.err.println("Nieprawidłowa godzina: " + nowaGodzina);
    }

    public void zmienMinuty(int nowaMinuta) {
        if (nowaMinuta >= 0 && nowaMinuta < 60)
            minuty = nowaMinuta;
        else System.err.println("Nieprawidłowa minuta: " + nowaMinuta);
    }

    public void zmienSekundy(int nowaSekunda) {
        if (nowaSekunda >= 0 && nowaSekunda < 60)
            sekundy = nowaSekunda;
        else System.err.println("Nieprawidłowa sekunda: " + nowaSekunda);
    }

    public int ileMinOdPolnocy() {
        return godziny * 60 + minuty;
    }

    public void format24h(boolean H24) {
        h24 = H24;
    }

    public void wypiszGodzine() {
        if (h24 == true)
            System.out.println(godziny + ":" + minuty + ":" + sekundy);
        else {
            System.out.print((godziny < 12 ?
                    "" + godziny : "" + (godziny - 12)) + ":" + minuty + ":" + sekundy);
            System.out.println((godziny < 12 ? " a.m" : " p.m"));
        }
    }
}


public class Zadanie1{

    public static void main(String[] args)
    {
        Zegarek zegarek = new Zegarek(14, 35, 20);
        zegarek.wypiszGodzine();

        zegarek.format24h(false);
        zegarek.wypiszGodzine();


        zegarek.format24h(true);
        zegarek.zmienGodzine(21);
        zegarek.zmienMinuty(37);
        zegarek.zmienSekundy(0);

        zegarek.wypiszGodzine();


        zegarek.zmienMinuty(90);
        zegarek.zmienGodzine(80);
        zegarek.zmienSekundy(70);

        System.out.println("Minut od północy: " + zegarek.ileMinOdPolnocy());
    }
}
