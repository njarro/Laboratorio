package unal.poo.practica;

import becker.robots.*;
import java.awt.Color;
import java.util.Random;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
import java.util.Scanner;
public class RobotBase
{    
        public static City parcela;
        public static Robot granjero;
        public static Robot iconoVaca;
        
        
	public static void main (String[] args){
            //numero de ciclos
            int Ciclo=0;
            //Creacion de la parcela y granjero
            parcela = new City("Field.txt");
            granjero = new Robot(parcela,0, 2, Direction.EAST,0);
            //Creacion de los lotes
            Lote lot1=new Lote(1);
            Lote lot2 =new Lote(2);
            Lote lot3 = new Lote(3);
            //Creacion de una vaca y de la clase parcela
            Parcela granja=new Parcela(lot1,lot2,lot3);
            //creacion de lector 
            Scanner lectura=new Scanner(System.in);
            //Menu
            int op=0;
            while(op!=9){
            System.out.println("Seleccione una opcion");
            System.out.println("1.Registrar vaca");
            System.out.println("2.Revisar vaca");
            System.out.println("3.Registrar cambios de salud");
            System.out.println("4.Siguiente ciclo");
            System.out.println("5.Lote a ordenar");
            System.out.println("9.Salir");
            op=lectura.nextInt();
            switch(op){
                case 1:{
             //Registrar vaca
             //Pedir datos vaca
            System.out.println("Ingrese el identificador(ID)de la vaca");
            String nro;
            nro=lectura.next();
            System.out.println("Ingrese el pulso de la vaca");
            int pulso;
            pulso=lectura.nextInt();
            System.out.println("Ingrese el ritmo cardiaco de la vaca");
            double ritmoCardiaco;
            ritmoCardiaco=lectura.nextDouble();
            System.out.println("Ingrese la temperatura de la vaca");
            double temperatura;
            temperatura=lectura.nextDouble();
            System.out.println("Ingrese la cantidad de leche que da la vaca");
            double cantidadLeche;
            cantidadLeche=lectura.nextDouble();
            System.out.println("Ingrese el ciclo reproductivo de la vaca en dias");
            int cicloReproductivo;
            cicloReproductivo=lectura.nextInt();
            System.out.println("Ingrese el avance de gestacion de la vaca en meses");
            int avanceGestacion;
            avanceGestacion=lectura.nextInt();
            //opciones para salud 
            System.out.println("Ingrese el estado de salud la vaca:");
                    System.out.println("(1)Condicones normales");
                    System.out.println("(2)Estado de gestacion");
                    System.out.println("(3)Niveles altos");
             int condicion;
             String salud=null;
            condicion=lectura.nextInt();
                switch (condicion) {
                    case 1:{
                         salud="codiciones normales";
                        break;
                    }
                    case 2:{
                        salud="estado de gestacion";
                        break;
                    }
                    case 3:{
                       salud="niveles altos";
                        break;
                    }
                    default:
                        System.out.println("No valido");
                        break;
                    
                }
            //Creacion de la vaca
            iconoVaca =new Robot(parcela,4,2,Direction.NORTH,0);
            Vaca vaca =new Vaca(pulso,ritmoCardiaco,temperatura,salud,cantidadLeche,cicloReproductivo,avanceGestacion,nro);
            //Asignacion de color
            switch (condicion) {
                    case 1:
                        iconoVaca.setColor(Color.BLACK);
                        break;
                    case 2:
                        iconoVaca.setColor(Color.BLUE);
                        break;
                    case 3:
                        iconoVaca.setColor(Color.RED);
                        break;
                    default:
                        break;
                }
            //Asignacion de el robot a la vaca
            vaca.setIcono(iconoVaca);
            
            //Asignacion de la vaca a la parcela
            granja.RegistrarVacas(vaca,vaca.getNro());
            break;
        }
                case 2:{
                    //Revisar vaca
                    System.out.println("Ingrese el numero de la vaca");
                    String ID;
                    ID=lectura.next();
                    granja.MirarVaca(ID); 
                    break;
                }
                case 3:{
                    //Cambio de salud
                    System.out.println("Ingrese el numero de la vaca");
                    String Id;
                    int cambio;
                    Id=lectura.next();
                    cambio=granja.CambioSalud(Id);
                    //cambio de color
                    switch (cambio) {
                    case 1:
                        iconoVaca.setColor(Color.BLACK);
                        break;
                    case 2:
                        iconoVaca.setColor(Color.BLUE);
                        break;
                    case 3:
                        iconoVaca.setColor(Color.RED);
                        break;
                    default:
                        break;
                }
                    break;
                }
                case 4:{
                    //Siguiente ciclo
                    Ciclo++;
                    //Cambio de salud aleatorio
                    Random aleatorio= new Random();
                    int numero;
                    numero=aleatorio.nextInt(3);
                    granja.SaludAleatoria(numero);
                    break;
                    
                }
                case 5:{
                    
                    System.out.println("Leche disponible:");
                }
                
                
                
                
                
            }
            }
        }
}    