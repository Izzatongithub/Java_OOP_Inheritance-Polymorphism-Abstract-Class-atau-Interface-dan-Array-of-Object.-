## Identitas Kelompok
- **Fadila Rahmania (F1D02310048)**
- **Izzat Nazhiefa (F1D02310114)**

## Deskripsi Tugas
Program ini dibuat untuk mempraktikkan konsep Object-Oriented Programming (OOP) dalam bahasa Java. Fokus pembelajaran mencakup: Pewarisan (Inheritance), Antarmuka (Interface), Kelas Abstrak (Abstract Class), Polimorfisme (Polymorphism), Penggunaan Array of Object.

## Struktur Kelas 
Program ini memiliki beberapa kelas dan interface:
- Binatang → kelas abstrak (superclass)
- Kucing, Harimau, AyamJago → subclass (turunan dari Binatang)
- Karnivora, Herbivora → interface
- App → kelas utama (main program)

## Penjelasan kode
### 1. Abstract Class `Binatang`
```java
abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    
    public Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama){ this.nama = nama; }
    public String getNama(){ return nama; }

    public void setKaki(int jmlKaki){ this.jmlKaki = jmlKaki; }
    public int getKaki(){ return jmlKaki; }

    public abstract void displayBinatang();
    public abstract void displayData();
}
```
Penjelasan:
- Binatang adalah kelas abstrak, artinya tidak bisa dibuat objek langsung.
- Menyimpan atribut umum (nama, jmlKaki) yang dimiliki semua binatang.
- Memiliki metode abstrak displayBinatang() dan displayData() yang harus diimplementasikan oleh subclass.

### 2. Interface `Karnivora` dan  `Herbivora`
```java
public interface Karnivora {
    public String jenisK = "Karnivora";
    public String makananK = "Daging";

    public void displayMakan();
}
```
```java
public interface Herbivora {
    public String jenisH = "Herbivora";
    public String MakananH = "Tumbuhan hijau tua";

    public void displayMakan();
}
```
Penjelasan:
- interface berisi kontrak perilaku yang wajib dipenuhi oleh kelas yang mengimplementasikannya.
- Misalnya, semua hewan Karnivora harus memiliki metode displayMakan().

### 3. Subclass – Kucing.java, Harimau.java, AyamJago.java
```java
public class Harimau extends Binatang implements Karnivora {
    private String suara;
    private String warnaBulu;

    public Harimau(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Jenis: " + jenisK + ", makanan: " + makananK);
    }

    @Override
    public void displayBinatang(){
        System.out.println("Binatang: " + nama + ", jumlah kaki: " + jmlKaki);
    }

    @Override
    public void displayData(){
        displayBinatang();
        System.out.println("Suara " + nama + " yaitu " + suara + ", Warna bulu " + warnaBulu);
        displayMakan();
    }
}
```
Penjelasan:
- Harimau mewarisi (extends) kelas Binatang → konsep Inheritance.
- Harimau juga mengimplementasikan (implements) interface Karnivora.
- Meng-override metode displayBinatang() dan displayData() dari Binatang, serta displayMakan() dari Karnivora.

## Kesimpulan:
Kelas turunan seperti Harimau, Kucing, dan AyamJago memiliki perilaku yang berbeda sesuai tipe makanannya, tapi semua dapat dipanggil menggunakan tipe data Binatang.

## Main Class – App.java
```java
public class App {
    public static void main(String[] args) throws Exception {
        Binatang[] daftarBinatang = new Binatang[3];

        daftarBinatang[0] = new Kucing("Wowo", 4, "Miaauu", "Abu-abu");
        daftarBinatang[1] = new Harimau("Joko", 4, "Rawrr", "Oren");
        daftarBinatang[2] = new AyamJago("Fufufafa", 2, "Kukuruyuk", "Merah");

        for (int i = 0; i < daftarBinatang.length; i++) {
            daftarBinatang[i].displayData();
            System.out.println("-------------------------");
        }
    }
}
```
Penjelasan:
- daftarBinatang adalah array dari class abstrak Binatang.
Setiap elemen diisi dengan objek subclass yang berbeda.
Meskipun semua objek bertipe Binatang, saat dijalankan mereka menampilkan hasil berbeda sesuai jenis hewannya.
➜ Ini adalah contoh Polymorphism.









