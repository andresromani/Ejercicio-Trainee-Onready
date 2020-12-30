package concesionaria;

import entidades.Auto;
import entidades.Concesionaria;
import entidades.Moto;
import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehiculo> listadoVehiculos = new ArrayList();
        Vehiculo v1 = new Auto("Peugeot", "206", 4, 200000);
        Vehiculo v2 = new Moto("Honda", "Titan", "125cc", 60000);
        Vehiculo v3 = new Auto("Peugeot", "208", 5, 250000);
        Vehiculo v4 = new Moto("Yamaha", "YBR", "160cc", 80500);
        listadoVehiculos.add(v1);
        listadoVehiculos.add(v2);
        listadoVehiculos.add(v3);
        listadoVehiculos.add(v4);
        
        Concesionaria concesionaria = new Concesionaria(listadoVehiculos);
        
        System.out.println(concesionaria);
        System.out.println("=============================");
        Vehiculo masCaro = concesionaria.getVehiculoMasCaro();
        System.out.println("Vehículo más caro: " + masCaro.getMarca() + " " + masCaro.getModelo());
        Vehiculo masBarato = concesionaria.getVehiculoMasBarato();
        System.out.println("Vehículo más barato: " + masBarato.getMarca() + " " + masBarato.getModelo());
        String letra = "Y";
        Vehiculo vehiculoConXLetra = concesionaria.getVehiculoQueContieneXLetra(letra);
        System.out.println("Vehículo que contiene en el modelo la letra '" + letra + "' : " + vehiculoConXLetra.getMarca() + " " + vehiculoConXLetra.getModelo() + " $" + vehiculoConXLetra.getPrecioFormateado());
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        System.out.println(concesionaria.getVehiculosOrdenados());
    }
    
}
