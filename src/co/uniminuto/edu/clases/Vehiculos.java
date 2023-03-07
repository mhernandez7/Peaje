
package co.uniminuto.edu.clases;

import co.uniminuto.edu.interfaz.IVehiculo;
import java.util.Scanner;
import static peaje.Peaje.CarroFamiliar;
import static peaje.Peaje.CarroMediano;
import static peaje.Peaje.Motos;
import static peaje.Peaje.VehiculoGrande;


public abstract class Vehiculos implements IVehiculo {
    
    protected  String nombrePeaje;
    protected  String departamento;
    protected  double totalPago;
    protected  double tipoVehiculo;
    protected  int   validacion;
   protected int cantidadVehiculos;
        
    public Vehiculos(String nombrePeaje, String departamento) {
        this.nombrePeaje = nombrePeaje;
        this.departamento = departamento;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public double getTipoVehiculo() {
        return tipoVehiculo;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculos{");
        sb.append("nombrePeaje=").append(nombrePeaje);
        sb.append(", departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }
    
    
}
