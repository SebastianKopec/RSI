public class Main
{
    public static void main(String args[])
    {
        Panstwa pan=new Panstwa("Polska",312000);
        System.out.println("Nazwa Panstwa:  "+pan.nazwa);
        System.out.println("Wielkosc[km^2]:  "+pan.wielkosc);

        Miasta mia=new Miasta();

        mia.nazwa="Kraków";
        mia.wielkosc=326;
        mia.populacja=766739;
        mia.wysokosc=383;

        System.out.println("Nazwa Miasta:  "+mia.nazwa);
        System.out.println("Wielkosc[km^2]:  "+mia.wielkosc);
        System.out.println("Populacja:  "+mia.populacja);
        System.out.println("Wysokość[m n.p.m.]:  "+pan.wielkosc);
        //klasa abstrakcyjna obiekt wywolanie
        Panstwa s1 = new Panstwa();
        s1.wypis();
        //Wywolanie dla interfejsu
        Panstwa m1 = new Panstwa();
        m1.Map();
    }
}
