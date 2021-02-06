package jti.polinema.pengantarpbo;

public class Smartphone extends Handphone {
    private String chipset;
    private int ram;

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Chipset : " + chipset);
        System.out.println("RAM : " + ram + "gb");
    }
}

