package jti.polinema.inheritance.tugas2;

public class MainClass {

    public static void main(String[] args) {
        Pc pc = new Pc("Dell", 2, 8,
                "Intel Core i5", 21);
        pc.tampilPc();

        Mac mac = new Mac("Macbook Pro", 2, 8,
                "Intel Core i7", "Lithium-polymer", "Apple T2 Security");
        mac.tampilMac();

        Windows windows = new Windows("Asus", 1, 4,
                "Intel Core i3", "Lithium-Ion", "Touchscreen");
        windows.tampilWindows();

    }
}
