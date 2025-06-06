public class Car {
    public static void main(String[] Args) {
        Carro mclaren = new Carro("Mclaren Senna", "Branca", "abcd1234", "2025");

        mclaren.acelerar(1400);
        System.out.println(mclaren.getModelo());

    }
}