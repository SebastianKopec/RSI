package sample;

public class Panstwa {
    public static void main(String[] args){
        int size=4;//rozmiar 5 jest dla miast
        double szer=15.54178;
        float dl= (float) 23.4;//konwert na float
        String Literka="K";
        int wybor=3;
///////////////Instrukcja Warunkowa////////////////////////////////
        if(size==5) {
            System.out.println("Miasto");
            System.out.println("Dla tego Miasta szer. i dl. geograficzna to:");
            System.out.println(szer);
            System.out.println(dl);
            System.out.println("Zaczyna się na literke:");
            System.out.println(Literka);
        }
        else
            if(size>5) {
                szer = szer + 1;
                System.out.println("Państwo");
                System.out.println("Dla tego Państwa szer. i dl. geograficzna to:");
                System.out.println(szer);
                System.out.println(dl);
                System.out.println("Zaczyna się na literke:");
                System.out.println(Literka);
            }
            else {
                dl = dl + 1;
                System.out.println("Wieś");
                System.out.println("Dla tej Wsi szer. i dl. geograficzna to:");
                System.out.println(szer);
                System.out.println(dl);
                System.out.println("Zaczyna się na literke:");
                System.out.println(Literka);
            }
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");
/////////////////Instrukcja Sterujaca//////////////////////////////////
            switch(wybor){
            case 1:
                System.out.println("Kraków");
                System.out.println("To miasto");
                break;
                case 2:
                    System.out.println("Kolumbia");
                    System.out.println("To Panstwo");
                    break;
                        case 3:
                         System.out.println("Karpacz");
                         System.out.println("To Wioska");
                         break;
                            default:
                            System.out.println("To zadne z wymienionych");
            }
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
/////////////////////////////Petle i Tablice/////////////////////////////////////////////////
        System.out.println("Ludność w Państwie średnio zwiększa się o 2:");
        int[] ludnosc = new int[100];

        for (int i = 0; i < 100; i=i+2) {
            ludnosc[i] = i + 2;
            System.out.print(ludnosc[i]);
            System.out.print(" ");
        }
        System.out.println();
//////////////////////////////Tablica Dwuwymiarowa/////////////////////////////////////////////
        System.out.println("Ludność w Państwie średnio zwiększa się o 1:");
        System.out.print("Dla Tablic dwuwymiarowych:");
        int[][] ludnosc1 = new int[100][100];
        for (int i = 0; i < 2; i=i+1)
        {
            System.out.println();
            for (int j = 0; j < 100; j=j+2) {
                ludnosc1[0][j] = j + 1;
                ludnosc1[1][j] = j + 2;
                System.out.print(ludnosc1[i][j]);
                System.out.print(" ");
            }
        }
    }
}
