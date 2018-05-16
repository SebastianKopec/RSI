import Geography.Panstwa;
import Geography.Miasta;
import Geography.Stolica;
import Maps.Map;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {

        Panstwa pan = new Panstwa("Polska", 312000);
        System.out.println("Nazwa Panstwa:  " + pan.nazwa);
        System.out.println("Wielkosc[km^2]:  " + pan.wielkosc);
        //Serializacja
        FileOutputStream fileOut = new FileOutputStream("Panstwo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(pan);
        out.close();
        fileOut.close();
//
        Miasta mia = new Miasta();
        Scanner enter = new Scanner(System.in);
        //Zapis
        PrintWriter write = new PrintWriter("Miasto.txt");

//        //throw i throws
//        System.out.println();
//        System.out.println("Podaj nazwe miasta:");
//        mia.nazwa = enter.nextLine();
//        System.out.println("Podaj wielkosc miasta:");
//        mia.wielkosc = enter.nextInt();
//        System.out.println("Podaj populacje maista:");
//        mia.populacja = enter.nextInt();
//        System.out.println("Podaj wysokość miasta:");
//        mia.wysokosc= enter.nextDouble();
//        System.out.println("Nazwa Miasta:  " + mia.nazwa);
//        write.println("Nazwa Miasta:  " + mia.nazwa);
//        if (mia.wielkosc <= 0) {
//            //throw new RuntimeException("Wielkosc musi byc wieksza od 0");
//            throw new Exception("Wielkosc musi byc wieksza od 0");//Wyjatek klasy Exception
//        }
//            System.out.println("Wielkosc[km^2]:  " + mia.wielkosc);
//            write.println("Wielkosc[km^2]:  " + mia.wielkosc);
//            System.out.println("Populacja:  " + mia.populacja);
//            write.println("Populacja:  " + mia.populacja);
//            System.out.println("Wysokość[m n.p.m.]:  " + pan.wielkosc);
//            write.println("Wysokość[m n.p.m.]:  " + mia.wysokosc);
//            write.close();

            // try-catch-finally

   try
   {
        System.out.println();
        System.out.println("Podaj nazwe miasta:");
        mia.nazwa = enter.nextLine();
        System.out.println("Podaj wielkosc miasta:");
        mia.wielkosc = enter.nextInt();
        System.out.println("Podaj populacje maista:");
        mia.populacja = enter.nextInt();
        System.out.println("Podaj wysokość miasta:");
        mia.wysokosc= enter.nextDouble();

        System.out.println("Nazwa Miasta:  " + mia.nazwa);
        write.println("Nazwa Miasta:  " + mia.nazwa);
        if (mia.wielkosc <=0) {
                throw new Exception("Wielkosc musi byc wieksza od 0");//Wyjatek klasy Exception
            }
             System.out.println("Wielkosc[km^2]:  " + mia.wielkosc);
             write.println("Wielkosc[km^2]:  " + mia.wielkosc);
             System.out.println("Populacja:  " + mia.populacja);
             write.println("Populacja:  " + mia.populacja);
             System.out.println("Wysokość[m n.p.m.]:  " + mia.wysokosc);
             write.println("Wysokość[m n.p.m.]:  " + mia.wysokosc);
             write.close();
    }
    catch (Exception exception)
    {
        System.err.println("Wielkosc musi byc wieksza od 0");
    }
    finally
   {
        System.out.println("Nastepnym razem podaj wielkosc wieksza od 0");
    }
        //klasa abstrakcyjna obiekt wywolanie
        Panstwa s1 = new Panstwa();
        s1.wypis();
        //Wywolanie dla interfejsu
        Panstwa m1 = new Panstwa();
        m1.Map();
    }
}


