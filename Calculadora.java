import java.util.Scanner;
 
public class Calculadora {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("=== Calculadora ===");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
 
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
 
        System.out.println("Elige la operación que deseas realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Elige una opción (1-4): ");
        int opcion = scanner.nextInt();
 
        double resultado = 0;
 
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                // Verificamos si el divisor es cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
 
        scanner.close();
    }
}
