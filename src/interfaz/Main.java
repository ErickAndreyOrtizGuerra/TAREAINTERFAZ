
public class Main {
    public static void main(String[] args) {
        Vehiculo coche1 = new Coche("Toyota", "Corolla", 4);
        Vehiculo moto2 = new Motocicleta("Honda", "CBR250");

        coche1.encender(); //llamado de los metodos de coche1
        coche1.conducir();
        coche1.apagar(); 
        

        moto2.encender(); //llamado de los metodos de moto2
        moto2.conducir();
        moto2.apagar();
    }
}
