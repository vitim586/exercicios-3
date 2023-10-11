public class Trapezio {
    public static void main(String[] args) {
        int B = 8; //Base 1
        int b = 5; //base 2
        int h = 6; //Altura
        int d = 2; //divisor
        int R = 13; // resultado da soma das bases
        int r = 78; //resultado da base x altura
        
        int sum = B + b;
        System.out.println("A soma das base é: " + sum); //imprime o resultado das soma das bases

        int product = R * h;
        System.out.println("Base x altura é: " + product); //imprime os resultados da base x altura

        int quotient = r / d; 
        System.out.println("A area do trapezio é: " + quotient); //imprime a area do trapezio
    }
}
