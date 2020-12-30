package entidades;

import comparators.ComparatorPrecioVehiculos;
import java.util.Collections;
import java.util.List;

public class Concesionaria {
    public List<Vehiculo> listadoVehiculos;
    
    public Concesionaria() {
    }

    public Concesionaria(List<Vehiculo> listadoVehiculos) {
        this.listadoVehiculos = listadoVehiculos;
    }

    public List<Vehiculo> getListadoVehiculos() {
        return listadoVehiculos;
    }

    public void setListadoVehiculos(List<Vehiculo> listadoVehiculos) {
        this.listadoVehiculos = listadoVehiculos;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            resultado += "\n" + listadoVehiculos.get(i);
        }
        
        return resultado;
    }
    
    public Vehiculo getVehiculoMasCaro() {
        Collections.sort(listadoVehiculos, new ComparatorPrecioVehiculos());
        return listadoVehiculos.get(0);
    }
    
    public Vehiculo getVehiculoMasBarato() {
        Collections.sort(listadoVehiculos, new ComparatorPrecioVehiculos());
        int lastIndex = listadoVehiculos.size() - 1;
        return listadoVehiculos.get(lastIndex);
    }
    
    public Vehiculo getVehiculoQueContieneXLetra(String letra) {
        for (Vehiculo v : listadoVehiculos) {
            if (v.getModelo().contains(letra)) {
                return v;
            }
        }
        return null;
    }
    
    public String getVehiculosOrdenados() {
        Collections.sort(listadoVehiculos, new ComparatorPrecioVehiculos());
        String resultado = "";
        for (Vehiculo v : listadoVehiculos) {
            resultado += v.getMarca() + " " + v.getModelo() + "\n";
        }
        return resultado;
    }
}
