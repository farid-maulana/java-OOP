package jti.polinema.pengantarpbo;

public class Handphone {
    private String merk;
    private int rom;
    private int baterai;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setBaterai(int baterai) {
        this.baterai = baterai;
    }

    public void cetakStatus() {
        System.out.println("HANDPHONE");
        System.out.println("Merk : " + merk);
        System.out.println("Storage : " + rom + "gb");
        System.out.println("Baterai : " + baterai + "mAh");
    }
}

