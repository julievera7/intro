/**
 *
 * @author aliet
 */
/*
Crea una clase Persona con las siguientes variables: La edad, nombre, teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase 
tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y 
el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario 
que solo tenga la clase Trabajador*/

public class FourthAct {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad=26;
        cliente.telefono=5555;
        cliente.nombre="Juan";
        cliente.credito=1000;
        trabajador.edad=30;
        trabajador.telefono=11111;
        trabajador.nombre="Pablo";
        trabajador.salario=1000;
        System.out.println("Los datos del cliente son: " + cliente.nombre);
        System.out.println("La edad es " + cliente.edad + "número de celular: " + cliente.telefono);
        System.out.println("Su crédito es: " + cliente.credito);
        System.out.println("Los datos del trabajador son: " + trabajador.nombre);
        System.out.println("La edad es " + trabajador.edad + "número de celular: " + trabajador.telefono);
        System.out.println("Su Salario es: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;
    
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}