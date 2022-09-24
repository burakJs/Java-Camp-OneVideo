public class Workshop1 {
    public static void main(String[] args) {
        int[] sayiler = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        isListContains(sayiler, 3);
        isListContains(sayiler, 11);

    }

    public static boolean isListContains(int[] p1, int p2) {
        boolean result = false;
        for (int p : p1) if (p == p2) result = true;
        if (result) {
            mesajVer("Sayi mevcuttur: " + p2);
        } else {
            mesajVer("Sayi mevcut degildir: " + p2);
        }

        return result;
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
