package jti.polinema.pengantarpbo;

public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.setGear(2);
        spd1.cetakStatus();

        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.setGear(2);
        spd2.tambahKecepatan(10);
        spd2.setGear(3);
        spd2.cetakStatus();

        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.setGear(7);
        spd3.setTipeSusensi("Gas suspension");
        spd3.cetakStatus();
    }
}
