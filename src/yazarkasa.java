import java.util.Scanner;
//Meyveler ve KG Fiyatları
//
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL
public class yazarkasa {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        double armutkg=2.14,elmakg=3.67,domateskg=1.11,muzkg=0.95,patlicankg=5;
        System.out.print("Armut kaç kilo: ");
        double armut= inp.nextDouble();
        System.out.print("Elma kaç kilo: ");
        double elma= inp.nextDouble();
        System.out.print("Domates kaç kilo: ");
        double domates= inp.nextDouble();
        System.out.print("Muz kaç kilo: ");
        double muz= inp.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        double patlican= inp.nextDouble();

        double toplam=((armutkg*armut)+(elmakg*elma)+(domateskg*domates)+(muzkg*muz)+(patlicankg*patlican));

        System.out.print("Toplam tutar: "+toplam+" TL");

    }
}
