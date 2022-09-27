import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        double boy, kilo;

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = girdi.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = girdi.nextDouble();
        double endeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + endeks);


    }
}
//Vücut Kitle İndeksi Hesaplama Programı - Java101 Patikası - Egecan ÖR
