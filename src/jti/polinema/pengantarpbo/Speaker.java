package jti.polinema.pengantarpbo;

public class Speaker {
    private String merk;
    private int rms;
    private String konektivitas;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setRms(int rms) {
        this.rms = rms;
    }

    public void setKonektivitas(String konektivitas) {
        this.konektivitas = konektivitas;
    }

    public void cetakStatus() {
        System.out.println("SPEAKER");
        System.out.println("Merk : " + merk);
        System.out.println("RMS : " + rms + " Ohm");
        System.out.println("Konektivitas : " + konektivitas);
    }
}

