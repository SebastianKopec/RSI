import Geography.Panstwa;
import Geography.Miasta;
import Geography.Stolica;
import Maps.Map;

public class Main {
    public static void main(String args[]) throws Exception {
        Panstwa pan = new Panstwa("Polska", 312000);
        System.out.println("Nazwa Panstwa:  " + pan.nazwa);
        System.out.println("Wielkosc[km^2]:  " + pan.wielkosc);

        Miasta mia = new Miasta();

//        //throw i throws
//        mia.nazwa = "Kraków";
//        mia.wielkosc = -1;
//        mia.populacja = 766739;
//        mia.wysokosc = 383;
//        System.out.println("Nazwa Miasta:  " + mia.nazwa);
//
//         if (mia.wielkosc <= 0) {
//            //throw new RuntimeException("Wielkosc musi byc wieksza od 0");
//            throw new Exception("Wielkosc musi byc wieksza od 0");//Wyjatek klasy Exception
//    }
//        System.out.println("Wielkosc[km^2]:  " + mia.wielkosc);
//        System.out.println("Populacja:  " + mia.populacja);
//        System.out.println("Wysokość[m n.p.m.]:  " + pan.wielkosc);
        //koniec throw throws
        // try-catch-finally
        try
        {
            mia.nazwa = "Kraków";
            mia.wielkosc = 1;
            mia.populacja = 766739;
            mia.wysokosc = 383;
            System.out.println("Nazwa Miasta:  " + mia.nazwa);
            if (mia.wielkosc <=0)
            {
                throw new Exception("Wielkosc musi byc wieksza od 0");//Wyjatek klasy Exception
            }
            System.out.println("Wielkosc[km^2]:  " + mia.wielkosc);
            System.out.println("Populacja:  " + mia.populacja);
            System.out.println("Wysokość[m n.p.m.]:  " + mia.wysokosc);
        }
        catch (Exception exception)
        {
            System.err.println("Wielkosc musi byc wieksza od 0");
        }
        finally
        {
            System.out.println("Nastepnym razem podaj wielkosc wieksza od 0");
        }
        //koniec try-catch-finally

        //klasa abstrakcyjna obiekt wywolanie
        Panstwa s1 = new Panstwa();
        s1.wypis();
        //Wywolanie dla interfejsu
        Panstwa m1 = new Panstwa();
        m1.Map();
    }
}


