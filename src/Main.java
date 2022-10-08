import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int km;
        double perKm=3.2, total ,startPrice=15;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();
        total = km * perKm;
        total += startPrice;
        total = (total<20) ? 25 :total;
        System.out.println("Toplam ödenecek tutar: " + total +" TL");



    }
}
