/**
 * Clase utilitaria para operaciones matemáticas.
 * Proporciona métodos para cálculos matemáticos comunes.
 */
public class MathUtils {

    /**
     * Calcula el factorial de un número entero positivo.
     * El factorial de un número n es el producto de todos los números enteros
     * positivos desde 1 hasta n. Por ejemplo: 5! = 5 × 4 × 3 × 2 × 1 = 120.
     *
     * @param numero El número entero positivo del cual se calculará el factorial.
     *               Debe ser un valor mayor o igual a 0.
     * @return El factorial del número especificado como valor long.
     * @throws IllegalArgumentException Si el número es negativo.
     *
     * @example
     * // Ejemplo de uso:
     * long resultado = MathUtils.factorial(5);
     * // resultado = 120
     */
    public static long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo: " + numero);
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}