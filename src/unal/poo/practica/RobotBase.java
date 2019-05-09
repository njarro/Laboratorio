package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
import java.util.*;
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City parcela;
        public static Robot granjero;
	public static void main (String[] args){
            
            //Declarar la creacion de la ciudad
            parcela = new City("Field.txt");
	    parcela.showThingCounts(true);
            granjero = new Robot(parcela,0, 2, Direction.EAST,10);
            HashMap<String,Vaca>vacas1=null;
            HashMap<String,Vaca>vacas2 = null;
            HashMap<String,Vaca>vacas3=null;
            Lote lot1= new Lote(1,vacas1);
            Lote lot2= new Lote(1,vacas2);
            Lote lot3= new Lote(1,vacas3);
            Parcela parcela=new Parcela(lot1,lot2,lot3);
           
          
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            granjero.move ();
            
            //Girar a la izquierda
            granjero.turnLeft();
            
            
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = granjero.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               granjero.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = granjero.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            granjero.putThing();
                       
            //Si el frente esta libre de Wall
            granjero.frontIsClear();
            
            //Invocando una funcion
            creacionFuncion(4);
            
            //Toman un Thing
            granjero.pickThing();
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                granjero.move();
        }
}

