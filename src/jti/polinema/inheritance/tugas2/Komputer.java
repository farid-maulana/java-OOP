package jti.polinema.inheritance.tugas2;

public class Komputer {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, int kecProsesor,
                    int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }

    public void tampilData() {
        System.out.println("Merk Komputer       = " + merk);
        System.out.println("Jenis Prosesor      = " + jnsProsesor);
        System.out.println("Kecepatan Prosesor  = " + kecProsesor);
        System.out.println("Size Memory         = " + sizeMemory);
    }
}
