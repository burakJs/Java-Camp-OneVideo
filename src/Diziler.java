public class Diziler {
    public static void main(String[] args) {
        String[] sehirler1 = new String[]{"Ankara", "Istanbul", "Izmir"};

        for (String sehir : sehirler1) {
            System.out.println(sehir);
        }

        for (int i = 0; i < sehirler1.length; i++) {
            System.out.println(sehirler1[i]);
        }
        String[] sehirler = new String[]{"Ankara", "Istanbul", "Izmir"};
        String[] sehirler2 = new String[]{"Antep", "Diyarbakir", "Urfa"};

        sehirler = sehirler2;
        sehirler[0] = "Adana";
        System.out.println(sehirler2[0]);

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println(sayi1);

    }
}
