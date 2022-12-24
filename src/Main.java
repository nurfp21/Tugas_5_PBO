import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Karyawan kar = new Karyawan();
        Pembeli pem = new Pembeli();
        Komputer kom = new Komputer();
        Laptop lap = new Laptop();
        Elektronik elek = new Elektronik();
        transaksi tran = new transaksi();
        int pilih, banyak;
        int mouse = 10000, monitor = 15000, tipe = 95000, jumlah;
        Scanner input = new Scanner(System.in);

        System.out.println("BARANG ELEKTRONIK YANG DIJUAL : ");
        System.out.println("1. KOMPUTER");
        System.out.println("2. LAPTOP");
        System.out.println("3. SILAHKAN PILIH : ");
        pilih = input.nextInt();

        switch (pilih){
            case 1:
                System.out.println("BERAPA BANYAK : ");
                banyak = input.nextInt();
                for(int i=0; i<banyak; i++) {
                    System.out.println("MASUKKAN ID KARYAWAN : ");
                    int id_kry= input.nextInt();
                    kar.setId_kry(id_kry);
                    System.out.println("MASUKKAN NAMA KARYAWAN : ");
                    String nama_kry= input.next();
                    kar.setNama_kry(nama_kry);
                    System.out.println("MASUKKAN NO KTP PEMBELI : ");
                    int ktp= input.nextInt();
                    pem.setKtp(ktp);
                    System.out.println("MASUKKAN NAMA PEMBELI : ");
                    String nama_pembeli= input.next();
                    pem.setNama_pembeli(nama_pembeli);
                    System.out.println("MASUKKAN TIPE BARANG : ");
                    String tipe_barang= input.next();
                    elek.setTipe_barang(tipe_barang);
                    System.out.println("MASUKKAN JUMLAH BARANG : ");
                    jumlah = input.nextInt();
                    tran.setJumlah(jumlah);
                }
                for(int i=0; i<banyak; i++) {
                    System.out.println();
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\tTOKO ELEKTRONIK JAYA");
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\t\t\t\tID KARYAWAN   : " + kar.getId_kry());
                    System.out.println("\t\t\t\t\t\t\tNAMA KARYAWAN : " + kar.getNama_kry());
                    System.out.println("=====================================================");
                    System.out.println("NO KTP PEMBELI           : " + pem.getKtp());
                    System.out.println("NAMA PEMBELI             : " + pem.getNama_pembeli());
                    System.out.println("NAMA BARANG              : " + kom.namaBarang());
                    System.out.println("TIPE BARANG              : " + elek.getTipe_barang());
                    System.out.println("TOTAL HARGA              : " + tran.hargaElektronik(monitor, mouse, tran.jumlah));
                    System.out.println("POTONGAN HARGA           : "+tran.potonganHarga());
                    System.out.println("PAJAK TAMBAHAN           : "+tran.pajak());
                    System.out.println("TOTAL YANG HARUS DIBAYAR : " + (tran.hargaElektronik(monitor, mouse, tran.jumlah)-tran.potonganHarga()+tran.pajak()));
                }
                try{
                    FileWriter file = new FileWriter("catatanBarangKomputer.txt");
                    BufferedWriter output = new BufferedWriter(file);
                    output.write("======CATATAN BARANG KELUAR KOMPUTER======");
                    output.write("\n\t\t\tNama Karyawan : "+kar.getNama_kry());
                    output.write("\n\t\t\tId Karyawan : "+kar.getId_kry());
                    output.write("\n==========================================");
                    output.write("\nTipe Barang   : "+elek.getTipe_barang());
                    output.write("\nJumlah Barang : "+tran.getJumlah());
                    output.write("\nTOTAL HARGA BARANG : "+tran.hargaElektronik(monitor, mouse, tran.jumlah));
                    output.write("\n==========================================");
                    output.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                break;
            case 2 :
                System.out.println("BERAPA BANYAK : ");
                banyak = input.nextInt();
                for(int i=0; i<banyak; i++) {
                    System.out.println("MASUKKAN ID KARYAWAN : ");
                    int id_kry= input.nextInt();
                    kar.setId_kry(id_kry);
                    System.out.println("MASUKKAN NAMA KARYAWAN : ");
                    String nama_kry= input.next();
                    kar.setNama_kry(nama_kry);
                    System.out.println("MASUKKAN NO KTP PEMBELI : ");
                    int ktp= input.nextInt();
                    pem.setKtp(ktp);
                    System.out.println("MASUKKAN NAMA PEMBELI : ");
                    String nama_pembeli= input.next();
                    pem.setNama_pembeli(nama_pembeli);
                    System.out.println("MASUKKAN TIPE BARANG : ");
                    String tipe_barang= input.next();
                    elek.setTipe_barang(tipe_barang);
                    System.out.println("MASUKKAN JUMLAH BARANG : ");
                    jumlah = input.nextInt();
                    tran.setJumlah(jumlah);
                }

                for(int i=0; i<banyak; i++) {
                    System.out.println();
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\tTOKO ELEKTRONIK JAYA");
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\t\t\t\tID KARYAWAN   : " + kar.getId_kry());
                    System.out.println("\t\t\t\t\t\t\tNAMA KARYAWAN : " + kar.getNama_kry());
                    System.out.println("=====================================================");
                    System.out.println("NO KTP PEMBELI           : " + pem.getKtp());
                    System.out.println("NAMA PEMBELI             : " + pem.getNama_pembeli());
                    System.out.println("NAMA BARANG              : " + lap.namaBarang());
                    System.out.println("TIPE BARANG              : " + elek.getTipe_barang());
                    System.out.println("PAJAK TAMBAHAN           : "+tran.pajak());
                    System.out.println("TOTAL YANG HARUS DIBAYAR : " + (tran.hargaElektronik(tipe, tran.jumlah)+tran.pajak()));
                }
                try{
                    FileWriter file = new FileWriter("catatanBarangLaptop.txt");
                    BufferedWriter output = new BufferedWriter(file);
                    output.write("======CATATAN BARANG KELUAR LAPTOP======");
                    output.write("\n\t\t\tNama Karyawan : "+kar.getNama_kry());
                    output.write("\n\t\t\tId Karyawan : "+kar.getId_kry());
                    output.write("\n==========================================");
                    output.write("\nTipe Barang   : "+elek.getTipe_barang());
                    output.write("\nJumlah Barang : "+tran.getJumlah());
                    output.write("\nTOTAL HARGA BARANG : "+tran.hargaElektronik(tipe, tran.jumlah));
                    output.write("\n==========================================");
                    output.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("TIDAK ADA PILIHANNYA!!!");
        }
    }
}