public class Metotlar {
    public static void main(String[] args) {
        mesajVer("Burak");
        hesapla();
        System.out.println(topla(6, 3));
        System.out.println(toplananIkiSayininYuzde10u(10, 90));
    }

    public static void mesajVer(String isim) {
        System.out.println("Merhaba " + isim);
        //10larca satır olduğunu düşün
    }

    public static void hesapla() {
        System.out.println("Hesaplandi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static double toplananIkiSayininYuzde10u(int sayi1, int sayi2) {
        int toplam = topla(sayi1, sayi2);
        return toplam * 0.1;
    }

    public static double krediHesapla(double krediMiktari) {
        //hesaplar yapilir
        return 125000 * krediMiktari;
    }
    // DRY - Do not Repeat Yourself
}
