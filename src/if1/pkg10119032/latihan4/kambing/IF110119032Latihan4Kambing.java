package if1.pkg10119032.latihan4.kambing;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan nilai hasil eksekusi
 * variabel lokal
 */
public class IF110119032Latihan4Kambing {

    public void tambahKambing() {
        //deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + 
                jumlahKambing);
    }
    public static void main(String[] args) {
        IF110119032Latihan4Kambing kambingJantan = 
                new IF110119032Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
