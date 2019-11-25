package uan.edu.co.NominaContable;

/**
 * Hello world!
 *
 */
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
    	
    	empleado1.setNombre("empleado 1");
    	empleado2.setNombre("empleado 2");
    	empleado3.setNombre("empleado 3");
    	empleado4.setNombre("empleado 4");
    	empleado5.setNombre("empleado 5");
    	
    	empleado1.setSueldoBasico(500);
    	empleado2.setSueldoBasico(500);
    	empleado3.setSueldoBasico(500);
    	empleado4.setSueldoBasico(100);
    	empleado5.setSueldoBasico(100);
    	
    	
    }
}
