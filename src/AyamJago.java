public class AyamJago extends Binatang implements Herbivora {
    private String suara;
    private String warnaBulu;

    //constructor
    public AyamJago(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Jenis: " + jenisH + ", makanan: " + MakananH);
    }

    //wajib override dari class Binatang karena abstract class
    @Override
    public void displayBinatang(){
        System.out.println("Binatang: " + nama + ", jumlah kaki: " + jmlKaki);
    }

    public void displayData(){
        displayBinatang();
        System.out.println("Suara" + nama + " yaitu " + suara + ", Warna bulu " + warnaBulu);
        displayMakan();
    }

}
