import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double sonuc,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double armutk,elmak,domatesk,muzk,patlicank;
        double armutf,elmaf,domatesf,muzf,patlicanf;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutk=input.nextDouble();
        armutf=armut*armutk;
        System.out.print("Elma Kaç Kilo ? : ");
        elmak=input.nextDouble();
        elmaf=elma*elmak;
        System.out.print("Domates Kaç Kilo ? : ");
        domatesk=input.nextDouble();
        domatesf=domates*domatesk;
        System.out.print("Muz Kaç Kilo ? : ");
        muzk=input.nextDouble();
        muzf=muz*muzk;
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicank=input.nextDouble();
        patlicanf=patlican*patlicank;

        sonuc=armutf+elmaf+domatesf+muzf+patlicanf;

        System.out.println("Toplam Tutar : " + sonuc);


    }
}

