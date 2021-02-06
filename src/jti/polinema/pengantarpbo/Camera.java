package jti.polinema.pengantarpbo;

public class Camera {
    private String merk;
    private double resolusi;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setResolusi(double resolusi) {
        this.resolusi = resolusi;
    }

    public void cetakStatus() {
        System.out.println("CAMERA");
        System.out.println("Merk : " + merk);
        System.out.println("Resolusi : " + resolusi + " MP");
    }
}

