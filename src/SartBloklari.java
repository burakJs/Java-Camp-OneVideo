public class SartBloklari {
    public static void main(String[] args) {
        int not = 35;
        // 50 ve üzeri: geçti
        // 40-49 : bütünleme
        // 0-39 : kaldı

        if (not >= 50) {
            System.out.println("Gecti");
        } else if (not >= 40) {
            System.out.println("Butunleme");
        } else {
            System.out.println("Kaldi");
        }
    }
}
