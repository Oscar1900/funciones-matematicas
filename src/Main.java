public class Main {
    public static void main(String[] args) {

        // Math.abs() : Calcula el valor absoluto de un número
        int num = -5;
        int absoluto = Math.abs(num); // Resultado: 5

        // Math.pow() : Calcula la potencia de un número
        double base = 2;
        double exponente = 3;
        double potencia = Math.pow(base, exponente); // Resultado: 8.0

        // Math.sqrt() : Calcula la raíz cuadrada de un número
        double numero = 16;
        double raiz = Math.sqrt(numero); // Resultado: 4.0

        // Math.max() y Math.min() : Encuentra el valor máximo o mínimo entre dos números
        int a = 10;
        int b = 20;
        int maximo = Math.max(a, b); // Resultado: 20
        int minimo = Math.min(a, b); // Resultado: 10

        // Math.random() : Genera un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo)
        double aleatorio = Math.random(); // Ejemplo de salida: 0.3456

        // Math.round() : Redondea un número al entero más cercano
        double numero1 = 7.5;
        long redondeado = Math.round(numero1); // Resultado: 8

        // Math.ceil() y Math.floor() :
        // - Math.ceil() redondea hacia arriba.
        // - Math.floor() redondea hacia abajo.

        double numero2 = 7.2;
        double arriba = Math.ceil(numero2); // Resultado: 8.0
        double abajo = Math.floor(numero2); // Resultado: 7.0


        // Math.sin(), Math.cos(), y Math.tan() : Calculan funciones trigonométricas.
        // Recuerda que los argumentos están en radianes.
        double angulo = Math.PI / 4; // 45 grados en radianes
        double seno = Math.sin(angulo); // Resultado: 0.7071
        double coseno = Math.cos(angulo); // Resultado: 0.7071
        double tangente = Math.tan(angulo); // Resultado: 1.0


        // Math.log() y Math.exp()
        // - Math.log() calcula el logaritmo natural.
        // - Math.exp() calcula e elevado a la potencia especificada.

        double numero3 = 2;
        double logaritmo = Math.log(numero3); // Resultado: ~0.693
        double exponencial = Math.exp(numero3); // Resultado: ~7.389


        // Math.toDegrees() y Math.toRadians() : Convierte entre grados y radianes.
        double radianes = Math.PI;
        double grados = Math.toDegrees(radianes); // Resultado: 180.0
        double nuevoRadianes = Math.toRadians(90); // Resultado: 1.5708

        // Math.signum() : Devuelve el signo de un número:
        // -1.0 si es negativo, 0.0 si es cero, o 1.0 si es positivo
        double numero4 = -8.3;
        double signo = Math.signum(numero4); // Resultado: -1.0

        // Math.cbrt() : Calcula la raíz cúbica de un número
        double numero5 = 27;
        double raizCubica = Math.cbrt(numero5); // Resultado: 3.0

        // Math.hypot() : Calcula la hipotenusa dados dos lados de un triángulo rectángulo
        double c = 3;
        double d = 4;
        double hipotenusa = Math.hypot(c, d); // Resultado: 5.0

        // Math.nextUp() y Math.nextDown() : Encuentra el siguiente número
        // más grande o más pequeño respecto al valor dado
        double numero6 = 1.5;
        double siguienteArriba = Math.nextUp(numero6); // Resultado: ligeramente mayor que 1.5
        double siguienteAbajo = Math.nextDown(numero6); // Resultado: ligeramente menor que 1.5

        












    }
}