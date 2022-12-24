public class Laptop extends Elektronik {
    private String typeBaterai;

    @Override
    public String namaBarang() {
        return "Laptop";
    }

    public String getTypeBaterai() {
        return typeBaterai;
    }

    public void setTypeBaterai(String typeBaterai) {
        this.typeBaterai = typeBaterai;
    }
}