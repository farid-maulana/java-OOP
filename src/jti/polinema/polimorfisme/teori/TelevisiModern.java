package jti.polinema.polimorfisme.teori;

public class TelevisiModern extends Elektronik {
    private String modelInput;

    public TelevisiModern() {
        modelInput = "HDMI";
        voltase = 220;
    }

    public String getModelInput() {
        return modelInput;
    }
}