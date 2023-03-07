
package co.uniminuto.edu.clases;

import java.util.Scanner;


public  class CarroFamiliar extends Vehiculos{

    
    public CarroFamiliar(String nombrePeaje, String departamento) {
        super(nombrePeaje, departamento);
    }


    @Override
    public int ingresoPeaje() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vehiculos tipo familiar"
                + " que van a pasar por el peaje");
        this.cantidadVehiculos = read.nextInt();
    
        return this.cantidadVehiculos;
    }

    @Override
    public double pagoPeaje() {
   
    double costoPeaje = 5000;
    double aux = 0;

    aux =costoPeaje*this.cantidadVehiculos;
    
    return aux;
    }
    
    
}
