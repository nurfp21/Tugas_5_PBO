public class Elektronik {
    protected String nama_barang;
    protected String tipe_barang;
    public String getTipe_barang() {
        return tipe_barang;
    }
    public void setTipe_barang(String tipe_barang) {
        this.tipe_barang = tipe_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    public String namaBarang()
    {
        return "Elektronik";
    }
}