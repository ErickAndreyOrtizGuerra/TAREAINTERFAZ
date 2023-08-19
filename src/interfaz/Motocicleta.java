
class Motocicleta implements Vehiculo { //lase motocicleta que implementa la interfaz vehiculo
    //atributos que solo se usan en esta clase
    private String marca;
    private String modelo;
    private boolean motorEncendido;
    //constructor con sus parametros
    public Motocicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motorEncendido = false;
    }
     //sobreescribiendo metodos
    @Override
    public void encender() {
        motorEncendido = true;
        System.out.println("");
        System.out.println("motor de la motocicleta "+marca+" "+modelo+" esta encendido.");
    }

    @Override
    public void apagar() {
        motorEncendido = false;
        System.out.println("motor de la motocicleta "+marca+" "+modelo+ " esta apagado.");
    }

    @Override
    public void conducir() {
        if (motorEncendido) {
            System.out.println("conduciendo la motocicleta "+marca+" "+modelo);
        } else {
            System.out.println("enciende el motor de la motocicleta primero.");
        }
    }
}

