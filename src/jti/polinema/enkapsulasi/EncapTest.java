package jti.polinema.enkapsulasi;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();

        encap.setName("James");
        encap.setAge(35);

        encap2.setName("Farlan");
        encap2.setAge(17);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age : " + encap2.getAge());
    }
}
