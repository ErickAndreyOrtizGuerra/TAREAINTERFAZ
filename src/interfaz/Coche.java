
class Coche implements Vehiculo { //clase que implementa la interfaz 
    //atributos
    private String marca; 
    private String modelo;
    private int numeroPuertas;
    private boolean motorEncendido;
    
    //constructor
    public Coche(String marca, String modelo, int numeroPuertas) {  
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.motorEncendido = false;
        
    }
     //sobreescribiendo los metodos
    @Override
    public void encender() {
        motorEncendido = true;
        System.out.println("motor del carro " +marca+" "+modelo+" esta encendido.");
    }

    @Override
    public void apagar() {
        motorEncendido = false;
        System.out.println("motor del carro "+modelo+" esta apagado.");
    }

    @Override
    public void conducir() {
        if (motorEncendido) {
            System.out.println("conduciendo el carro  de "+numeroPuertas+" puertas");
        } else {
            System.out.println("enciende el motor del coche primero.");
        }
    }
}

