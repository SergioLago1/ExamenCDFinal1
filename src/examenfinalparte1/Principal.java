package examenfinalparte1;
/**
 * @author sergio
 
 */
public class Principal {

    int i;
 /**
     * Metodo el cual realiza una suma de 2 numeros
     * @param num1 valor del num 1 
     * @param num2 valor del num 2 
     */
 public int suma(int num1, int num2) {
        return num1 + num2;
    }
 /**
  * Este metodo va a sumar dos numeros distintos utilizando el metodo Suma
  * @param num1 valor del 1 numero
  * @param num2 valor del 2 numero
  * @return Por ultimo retorna el valor de la suma de ambos recogida en i
  */
    public int SumaNumDiferentes(int num1, int num2) {
        i = suma(num1, num2);
        return i;
    }
/**
 * Este metodo va a sumar 2 numeros iguales, y solo se le introduce un parametro
 * Utilizamos otra vez el metodo Suma
 * @param num Valor del numero que se introduce 
 * @return Retorna el valor de la suma recogida en i
 */
    public int sumaMismoNum(int num) {
        i = suma(num, num);
        return i;
    }
