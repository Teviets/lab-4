
/******************************************************************
 * 
 * Author: Gonzalo Santizo. Carnet 21504. Fecha de edicion 11-9-21
 * 
 * This class defines the methods of interface CarC. It is a concrete class and
 * will be instanced by the main Ctrl class to perform the user actions.
 * 
 ******************************************************************/

public class RadioC extends Radio implements CarC {

    public void Hold() {
        System.out.println("Tu llamada esta en espera");
    }

    public void Weather() {
        System.out.println("El pronostico del clima es que habra frio :v (asumiendo que todavia es noviembre)");
    }

}
