public abstract class Diskon {
    double potongan;

    public double Diskon(double potongan) {
        return 0;
    }

    public double getPotongan() {
        return potongan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    abstract double potonganHarga();
}
