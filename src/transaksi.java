public class transaksi extends Diskon implements Pajak{
    public int jumlah;
    public int total1;
    public int total2;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    Laptop lap = new Laptop();

    public Laptop getLap() {
        return lap;
    }

    Komputer kom = new Komputer();
    public Komputer getKom() {
        return kom;
    }

    public int hargaElektronik(int tipe, int jumlah){
        total1=tipe*jumlah;
        return total1;
    }

    public int hargaElektronik(int memory, int monitor, int jumlah){
        total2= (memory+monitor)*jumlah;
        return total2;
    }

    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    @Override
    double potonganHarga() {
        if(total2 > 95000){
            return 0.10*total2;
        }
        return 0;
    }

    @Override
    public double pajak() {
        return 5000;
    }
}