/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author aliet
 */

/*
 * Primera Parte:
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 */
public class FirstAct {
    public static void main(String args[]) {
        int resultado;
        Coche miCoche = new Coche();
        miCoche.contarpuerta();
        miCoche.contarpuerta();
        miCoche.contarpuerta();
        resultado = suma(2,3,4);
        
        System.out.println(resultado);
        System.out.println(miCoche.puerta);
    }
    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}   

/* Segunda Parte:
 * - Crear una clase coche.
 * - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * - Una función que incremente el número de puertas que tiene el coche.
 * - Crear un objeto miCoche en el main y añadirle una puerta.
 * - Mostrar el número de puertas que tiene el objeto.
*/
 class Coche  {
       public int puerta = 0;
       public void contarpuerta() {
           this.puerta++;
       } 
   }
  

