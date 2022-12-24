public class Komputer extends Elektronik {
    private int mouse;
    private int monitor;
    @Override
    public String namaBarang() {
        return "Komputer";
    }

    public int getMouse() {
        return mouse;
    }

    public void setMouse(int mouse) {
        this.mouse = mouse;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }
}