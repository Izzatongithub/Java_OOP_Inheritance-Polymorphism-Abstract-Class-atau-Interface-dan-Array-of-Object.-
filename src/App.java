public class App {
    public static void main(String[] args) throws Exception {
        Binatang[] daftarBinatang = new Binatang[3];

        daftarBinatang[0] = new Kucing("Wowo", 4, "Miaauu", "Abu-abu");


        daftarBinatang[1] = new Harimau("Joko", 4, "Rawrr", "Oren");
        daftarBinatang[2] = new AyamJago("fufufafa", 2, "Kukuruyuk", "Merah");

        for (int i = 0; i < daftarBinatang.length; i++) {
            daftarBinatang[i].displayData();
        }


    }
}
