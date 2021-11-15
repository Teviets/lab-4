
/******************************************************************
 * 
 * Author: Gonzalo Santizo. Carnet 21504 Fecha de edicion 11-9-21
 * 
 * This class defines the methods of interface CarA. It is a concrete class and
 * will be instanced by the main Ctrl class to perform the user actions.
 * 
 ******************************************************************/

public class RadioA extends Radio implements CarA {
    protected String Name = "Gonzalo Santizo";
    protected String Address = "Calle 1 Ciudad";
    protected int PhoneNum = 59453100;
    protected String Profession = "Estudiante UVG";

    public void CallLastContact() {
        System.out.println("Llamando al ultimo contacto");
    }

    public void ShowBusinessCard() {
        System.out.println("Hola mi nombre es: " + Name);
        System.out.println("Mi dirreccion es: " + Address);
        System.out.println("Mi numbero de telefono es: : " + PhoneNum);
        System.out.println("My profesion es: " + Profession);

    }

}
