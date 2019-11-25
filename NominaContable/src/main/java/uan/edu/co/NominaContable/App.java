package uan.edu.co.NominaContable;

import uan.edu.co.Controladores.*;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Empleado empleado1 = new Empleado();
    	Empleado empleado2 = new Empleado();
    	Empleado empleado3 = new Empleado();
    	Empleado empleado4 = new Empleado();
    	Empleado empleado5 = new Empleado();
    	
    	DevengadosAdiciones devengados = new DevengadosAdiciones();
    	VistaControlador controller = new VistaControlador();
    	
    	empleado1.setNombre("empleado 1");
    	empleado2.setNombre("empleado 2");
    	empleado3.setNombre("empleado 3");
    	empleado4.setNombre("empleado 4");
    	empleado5.setNombre("empleado 5");
    	
    	empleado1.setSueldoBasico(500); // AQUI SE PONE EL GET-TEXT QUE HAGA EN EL DISEÑO
    	empleado2.setSueldoBasico(500);
    	empleado3.setSueldoBasico(500);
    	empleado4.setSueldoBasico(100);
    	empleado5.setSueldoBasico(100);
    	
    	DevengadosAdiciones auxilioTransporte = new DevengadosAdiciones();
    	
    	//AUXILIO DE TRANSPORTE EMPLEADO 1
    	int auxEmpleado1= devengados.auxTrans(empleado1, auxilioTransporte);
    	
    	//AUXILIO DE TRANSPORTE EMPLEADO 2
    	int auxEmpleado2= devengados.auxTrans(empleado2, auxilioTransporte);
    	
    	//AUXILIO DE TRNASPORTE EMPLEADO 3
    	int auxEmpleado3= devengados.auxTrans(empleado3, auxilioTransporte);
    	
    	//AUXILIO DE TRNASPORTE EMPLEADO 4
    	int auxEmpleado4= devengados.auxTrans(empleado4, auxilioTransporte);
    	
    	//AUXILIO DE TRANSPORTE EMPLEADO 5
    	int auxEmpleado5= devengados.auxTrans(empleado5, auxilioTransporte);
    	
    	
    }
}
