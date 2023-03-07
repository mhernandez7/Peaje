
package peaje;

import java.util.Scanner;
import co.uniminuto.edu.clases.CarroFamiliar;
import co.uniminuto.edu.clases.CarroMediano;
import co.uniminuto.edu.clases.Motos;
import co.uniminuto.edu.clases.VehiculoGrande;

public class Peaje {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int ingreso = 0;
        System.out.println("Seleccione el tipo de Vehiculo");
        System.out.println("Para pago de vehiculo familiar ingrese 1: ");
        System.out.println("Para vehiculo Mediano ingrese  2: ");
        System.out.println("Para Motos ingrese             3: ");
        System.out.println("Para vehiculo Grandes ingrese  4: ");
        ingreso = read.nextInt();
        
        switch (ingreso){
                
            case 1:{
                CarroFamiliar();
                break;
            }
            case 2:{
                CarroMediano();
                break;
            }
            case 3:{
                Motos();
                break;
            }
            case 4:{
                VehiculoGrande();
                break;
            }
            case 5:{
                System.out.println("No ha ingresado una opcion valida ");
                break;
            }    
        
        }
    }
    public static void CarroFamiliar(){
        
        CarroFamiliar carrito = new CarroFamiliar("Peaje Siberia","Cundinamarca ");
        
        System.out.println("La cantidad de vehiculos ingresados es de:  "+carrito.ingresoPeaje());
        System.out.println("El valor total de pago sobre el peaje es de: "+carrito.pagoPeaje());
        System.out.println(carrito.toString());
        
    }
    public static void CarroMediano(){
        
        CarroMediano carrito = new CarroMediano("Peaje Siberia","Cundinamarca ");
        
        System.out.println("La cantidad de vehiculos ingresados es de:  "+carrito.ingresoPeaje());
        System.out.println("El valor total de pago sobre el peaje es de: "+carrito.pagoPeaje());
        System.out.println(carrito.toString());
    
    }
    public static void Motos(){
        
        Motos motos = new Motos("Peaje Siberia","Cundinamarca ");
        System.out.println("La cantidad de vehiculos ingresados es de:  "+motos.ingresoPeaje());
        System.out.println("El valor total de pago sobre el peaje es de: "+motos.pagoPeaje());
        System.out.println(motos.toString());
    
    }
    public static void VehiculoGrande(){
        VehiculoGrande carrito = new VehiculoGrande("Peaje Siberia","Cundinamarca ");
        System.out.println("La cantidad de vehiculos ingresados es de:  "+carrito.ingresoPeaje());
        System.out.println(carrito.validacionEjes());
        System.out.println("El valor total de pago sobre el peaje es de: "+carrito.pagoPeaje());
        System.out.println(carrito.toString());
        
        
    }
    
}
