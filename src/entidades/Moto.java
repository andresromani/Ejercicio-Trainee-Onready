package entidades;

public class Moto extends Vehiculo {
    private String cilindrada;
    
    public Moto() {
    }
    
    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    public String getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: " + cilindrada + " // Precio: $" + this.getPrecioFormateado();
    }
}
