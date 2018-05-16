public class Panstwa extends Stolica implements Map
{
    String nazwa;
    int wielkosc;

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
        System.out.println("Stolica:");
        System.out.println("Warszawa");
    }

    @Override
    public void Map()
    {
        double wspX=21.02;
        double wspY=52.12;
        System.out.println("Długosc geograficzna Stolicy to: "+wspX);
        System.out.println("Szerokosc geograficzna Stolicy to: "+wspY);
    }
}

