package comparators;

import entidades.Vehiculo;
import java.util.Comparator;

public class ComparatorPrecioVehiculos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Vehiculo v1 = (Vehiculo) o1;
        Vehiculo v2 = (Vehiculo) o2;
        Double p1 = v1.getPrecio();
        Double p2 = v2.getPrecio();
        return p2.compareTo(p1);
    }
    
}
