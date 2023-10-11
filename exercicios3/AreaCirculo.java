public class AreaCirculo {
    public static void main(String[] args) {
        double pi = 3.14;
        double b = 5;

        // Calcular a hipotenusa
        double hipotenusa = Math.sqrt(b * b);

        // Calcular a área do quadrado
        double areaQuadrado = hipotenusa * hipotenusa;

        System.out.println("A área do quadrado é: " + areaQuadrado);
    }
}
