
/******************************************************************
* 
* Author: Gonzalo Santizo. 
* Carnet 21504
* Fecha de edicion 11-9-21
* 
 * This class defines the methods of interface CarS. It is a concrete class and
 * will be instanced by the main Ctrl class to perform the user actions.
* 
******************************************************************/

import java.util.Scanner;

class RadioS extends Radio implements CarS {

    Scanner scan = new Scanner(System.in);

    public void ChangeAuxSource() {
        System.out.println("Cambiaste a modo audifonos");
    }

    public void PlanTrip() {
        String Destination;

        System.out.println("A donde quieres ir?");
        Destination = scan.nextLine();

        System.out.println("Tu viaje a: " + Destination + " esta siendo programado");
    }

}