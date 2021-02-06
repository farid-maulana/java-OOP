package jti.polinema.enkapsulasi;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if ((kecepatan += 60) > 100) {
                System.out.println("Kecepatan sudah mencapai batas maksimal.");
                kecepatan = 100;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }

    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 20;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
