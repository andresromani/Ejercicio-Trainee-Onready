package entidades;

public class Auto extends Vehiculo {
    private int puertas;
    
    public Auto() {
    }

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + puertas + " // Precio: $" + this.getPrecioFormateado();
    }
}
