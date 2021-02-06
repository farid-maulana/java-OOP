package jti.polinema.pengantarpbo;

public class Sepeda {
    private String merek;
    private int kecepatan, gear;
//    private int gear;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Gear : " + gear);
    }
}
