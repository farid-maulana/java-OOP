package jti.polinema.pengantarpbo;

public class Demo {
    public static void main(String[] args) {
        Handphone handphone = new Handphone();
        MesinCuci mesinCuci = new MesinCuci();
        Camera camera = new Camera();
        Speaker speaker = new Speaker();
        Smartphone smartphone = new Smartphone();

        handphone.setMerk("Nokia");
        handphone.setRom(1);
        handphone.setBaterai(2000);
        handphone.cetakStatus();

        mesinCuci.setMerk("Polytron");
        mesinCuci.setDayaTampung(5);
        mesinCuci.cetakStatus();

        camera.setMerk("Canon");
        camera.setResolusi(12.2);
        camera.cetakStatus();

        speaker.setMerk("Advance");
        speaker.setRms(10000);
        speaker.setKonektivitas("USB 3.0");
        speaker.cetakStatus();

        smartphone.setMerk("Xiaomi");
        smartphone.setRom(32);
        smartphone.setBaterai(5000);
        smartphone.setRam(3);
        smartphone.setChipset("Helio G85");
        smartphone.cetakStatus();
    }
}
