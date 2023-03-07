
package co.uniminuto.edu.clases;

import java.util.Scanner;


public class VehiculoGrande extends Vehiculos{

    private double aux ;
    public VehiculoGrande(String nombrePeaje, String departamento) {
        super(nombrePeaje, departamento);
    }

    @Override
    public int ingresoPeaje() {
     Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vehiculos tipo Grande"
                + " que van a pasar por el peaje");
        this.cantidadVehiculos = read.nextInt();
    
        return this.cantidadVehiculos;
    
    }
    
    public double validacionEjes(){
    Scanner read = new Scanner(System.in);
    double ejes = 0;
   
  
        for (int i = 1 ;i <= this.cantidadVehiculos;i++){
            
            System.out.println("ingrese la cantidad de ejes del "+i+"  vehiculo");
            ejes = read.nextDouble();
            
            this.aux = ejes + this.aux;
            
        }
        
        return this.aux;
    }

    @Override
    public double pagoPeaje() {
        
      double costoPeaje =4000;
     double total =0;

        total = costoPeaje * this.aux;
    
         return total;
     }
    
}


/*

A = {3,7,1,0}
B = {1,3,5,8}

*/