import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner Sınıfı Tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Değerleri Al
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce= inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih= inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik= inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız :" + sonuc);
        int a = 50;
        boolean kosul1 = sonuc >= a ;
       String str = (kosul1) ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;
       System.out.println(str);

    }
}
