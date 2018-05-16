package Geography;

import Maps.Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class Panstwa extends Stolica implements Map,Serializable
{
    public String nazwa;
    public int wielkosc;

    public Panstwa()
    {
        nazwa="";
        wielkosc=0;
    }

    public Panstwa(String n,int a)
    {
        this.nazwa=n;
        this.wielkosc=a;
    }

    @Override
   public void wypis()
    {
        System.out.print("Stolica:");
        System.out.println("Warszawa");
    }

    @Override
    public void Map() throws FileNotFoundException
    {
        //Odczyt
        File file = new File("Wspolrzedne.txt");
        Scanner in = new Scanner(file);
        //double wspX=21.02;
        //double wspY=52.12;
        double wspX = in.nextDouble();
        double wspY = in.nextDouble();
        System.out.println("Długosc geograficzna Stolicy to: "+wspX);
        System.out.println("Szerokosc geograficzna Stolicy to: "+wspY);
    }
}

