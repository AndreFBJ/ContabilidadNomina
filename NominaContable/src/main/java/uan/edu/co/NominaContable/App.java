package uan.edu.co.NominaContable;

import uan.edu.co.Controladores.*;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import javafx.stage.Stage;


public class App //extends Application
{
    public static void main( String[] args )
    {
        
    	//launch(args);
    	Scanner scan = new Scanner(System.in);
    	
    	Empleado empleado1 = new Empleado();
    	DevengadosAdiciones devengado1 = new DevengadosAdiciones();
    	DescuentosYDeducciones descuentos1 = new DescuentosYDeducciones();
    	
    	//Empleado 2
    	Empleado empleado2 = new Empleado();
    	DevengadosAdiciones devengado2 = new DevengadosAdiciones();
    	DescuentosYDeducciones descuentos2 = new DescuentosYDeducciones();
    	
    	//Empleado 3
    	Empleado empleado3 = new Empleado();
    	DevengadosAdiciones devengado3 = new DevengadosAdiciones();
    	DescuentosYDeducciones descuentos3 = new DescuentosYDeducciones();
    	
    	//Empleado 4
    	Empleado empleado4 = new Empleado();
    	DevengadosAdiciones devengado4 = new DevengadosAdiciones();
    	DescuentosYDeducciones descuentos4 = new DescuentosYDeducciones();
    	
    	//Empleado 5
    	Empleado empleado5 = new Empleado();
    	DevengadosAdiciones devengado5 = new DevengadosAdiciones();
    	DescuentosYDeducciones descuentos5 = new DescuentosYDeducciones();
    	
    	
    	//EMPLEADO 1 - DEVENGADOS Y ADICIONES -----------------------------------------------------------------------
    	System.out.println("Digite el sueldo para el empleado 1");
    	int sueldo1 = scan.nextInt();
    	empleado1.setSueldoBasico(sueldo1);
    	int auxTransporte1 = devengado1.auxTrans(empleado1, devengado1);
    	
    	
    	System.out.println("Digite las comisiones para el empleado 1");
    	int comision1 = scan.nextInt();
    	devengado1.setComisiones(comision1);
    	double comisionEmp1 = devengado1.getComisiones();
    	
    	System.out.println("Digite las bonificaciones para el empleado 1");
    	int bonificacion1 = scan.nextInt();
    	devengado1.setBonificaciones(bonificacion1);
    	double bonificaEmp1 = devengado1.getBonificaciones();
    		
    	System.out.println("Digite las horas extras diurnas para el empleado 1, si no tiene digite 0");
    	int horaExtraDiurna1 = scan.nextInt();
    	devengado1.setExtraDiurna(horaExtraDiurna1);
    	devengado1.horaExtraDiurna(empleado1, devengado1);
    	System.out.println(devengado1.getExtraDiurna());
    	double extraDiurEmp1 = devengado1.getExtraDiurna();
    	
    	System.out.println("Digite las horas extras nocturnas para el empleado 1, si no tiene digite 0");
    	int horaExtraNocturna1 = scan.nextInt();
    	devengado1.setExtraNocturna(horaExtraNocturna1);
    	devengado1.horaExtraNocturna(empleado1, devengado1);
    	System.out.println(devengado1.getExtraNocturna());
    	double extraNoturEmp1 = devengado1.getExtraNocturna();
    	
    	System.out.println("Si empleado 1 trabajo dia festivo, digite 1, si no, digite 2");
    	int festivoCompleto1 = scan.nextInt();
    	devengado1.setExtraFestivoCompleto(festivoCompleto1);
    	devengado1.horaExtraFestivoCompleto(empleado1, devengado1);
    	System.out.println(devengado1.getExtraFestivoCompleto());
    	double festivoCompletoEmp1 = devengado1.getExtraFestivoCompleto();
    	
    	System.out.println("Digite las horas extras festivas diurnas para el empleado 1, si no tiene digite 0");
    	int horaFestExtraDiurna1 = scan.nextInt();
    	devengado1.setExtraFestivoDiurna(horaFestExtraDiurna1);
    	devengado1.horaExtraFestivoDiurno(empleado1, devengado1);
    	System.out.println(devengado1.getExtraFestivoDiurna());
    	double extraFestDiurnEmp1 = devengado1.getExtraFestivoDiurna();
    	
    	System.out.println("Digite las horas extras festivas nocturnas para el empleado 1, si no tiene digite 0");
    	int horaFestExtraNocturna1 = scan.nextInt();
    	devengado1.setExtraFestivoNocturna(horaFestExtraNocturna1);
    	devengado1.horaExtraFestivoNocturno(empleado1, devengado1);
    	System.out.println(devengado1.getExtraFestivoNocturna());
    	double extraFestNocturEmp1 = devengado1.getExtraFestivoNocturna();
    	
    	double horasEmp1 = extraDiurEmp1 + extraNoturEmp1 + festivoCompletoEmp1 + extraFestDiurnEmp1 + extraFestNocturEmp1;
    	System.out.println(horasEmp1);
    	
    	// DESCUENTOS Y DEDUCCIONES
    	System.out.println("Digite 1 si aporta a salud o 2 si no aporta");
    	int salud1 = scan.nextInt();
    	descuentos1.setSalud(salud1);
    	descuentos1.saludS(empleado1, descuentos1);
    	double saludEmp1 = descuentos1.getSalud() + (horasEmp1*0.04);
    	System.out.println(saludEmp1);
    	
    	System.out.println("Digite 1 si aporta a pension o 2 si no aporta");
    	int pension1 = scan.nextInt();
    	descuentos1.setPension(pension1);
    	descuentos1.pensionS(empleado1, descuentos1);
    	System.out.println(descuentos1.getPension());
    	double pensionEmp1 = descuentos1.getPension() + (horasEmp1*0.04);
    	System.out.println(pensionEmp1);
    	
    	System.out.println("Digite el valor del prestamo que posee");
    	int prestamo1 = scan.nextInt();
    	descuentos1.setPrestamos(prestamo1);
    	//descuentos1.prestamoS(empleado1, descuentos1);
    	System.out.println(prestamo1);
    	
    	
    	System.out.println("Digite 1 si tiene un embargo o 2 si no lo tiene");
    	int embargo1 = scan.nextInt();
    	descuentos1.setEmbargos(embargo1);
    	descuentos1.embargoS(empleado1, descuentos1);
    	System.out.println(descuentos1.getEmbargos());
    	double embargoEmp1 = descuentos1.getEmbargos();
    	
    	System.out.println("Digite 1 si aporta a fondo de empleados o 2 si no aporta");
    	int fondoEmp1 = scan.nextInt();
    	descuentos1.setFondoEmpleados(fondoEmp1);
    	descuentos1.fondoEmpleadoS(empleado1, descuentos1);
    	System.out.println(descuentos1.getFondoEmpleados());
    	double fondoEmpleadosEmp1 = descuentos1.getFondoEmpleados() + (horasEmp1*0.1);
    	System.out.println(fondoEmpleadosEmp1);
    	
  
    	//EMPLEADO 2 - DEVENGADOS Y ADICIONES -----------------------------------------------------------------------
    	System.out.println("Digite el sueldo para el empleado 2");
    	int sueldo2 = scan.nextInt();
    	empleado2.setSueldoBasico(sueldo2);
    	int auxTransporte2 = devengado2.auxTrans(empleado2, devengado2);
    	
    	System.out.println("Digite las comisiones para el empleado 2");
    	int comision2 = scan.nextInt();
    	devengado2.setComisiones(comision2);
    	double comisionEmp2 = devengado2.getComisiones();
    	
    	System.out.println("Digite las bonificaciones para el empleado 2");
    	int bonificacion2 = scan.nextInt();
    	devengado2.setBonificaciones(bonificacion2);
    	double bonificaEmp2 = devengado2.getBonificaciones();
    	
    	System.out.println("Digite las horas extras diurnas para el empleado 2, si no tiene digite 0");
    	int horaExtraDiurna2 = scan.nextInt();
    	devengado2.setExtraDiurna(horaExtraDiurna2);
    	devengado2.horaExtraDiurna(empleado2, devengado2);
    	double extraDiurEmp2 = devengado2.getExtraDiurna();
    	
    	System.out.println("Digite las horas extras nocturnas para el empleado 2, si no tiene digite 0");
    	int horaExtraNocturna2 = scan.nextInt();
    	devengado2.setExtraNocturna(horaExtraNocturna2);
    	devengado2.horaExtraNocturna(empleado2, devengado2);
    	double extraNoturEmp2 = devengado2.getExtraNocturna();
    	
    	System.out.println("Si empleado 2 trabajo dia festivo, digite 8, si no, digite 0");
    	int festivoCompleto2 = scan.nextInt();
    	devengado2.setExtraFestivoCompleto(festivoCompleto2);
    	devengado2.horaExtraFestivoCompleto(empleado2, devengado2);
    	double festivoCompletoEmp2 = devengado2.getExtraFestivoCompleto();
    	
    	System.out.println("Digite las horas extras festivas diurnas para el empleado 2, si no tiene digite 0");
    	int horaFestExtraDiurna2 = scan.nextInt();
    	devengado2.setExtraFestivoDiurna(horaFestExtraDiurna2);
    	devengado2.horaExtraFestivoDiurno(empleado2, devengado2);
    	double extraFestDiurnEmp2 = devengado2.getExtraFestivoDiurna();
    	
    	System.out.println("Digite las horas extras festivas nocturnas para el empleado 2, si no tiene digite 0");
    	int horaFestExtraNocturna2 = scan.nextInt();
    	devengado2.setExtraFestivoNocturna(horaFestExtraNocturna2);
    	devengado2.horaExtraFestivoNocturno(empleado2, devengado2);
    	double extraFestNocturEmp2 = devengado2.getExtraFestivoNocturna();
    	
    	double horasEmp2 = extraDiurEmp2 + extraNoturEmp2 + festivoCompletoEmp2 + extraFestDiurnEmp2 + extraFestNocturEmp2;
    	System.out.println(horasEmp2);
    	
    	// DESCUENTOS Y DEDUCCIONES
    	System.out.println("Digite 1 si aporta a salud o 2 si no aporta");
    	int salud2 = scan.nextInt();
    	descuentos2.setSalud(salud2);
    	descuentos2.saludS(empleado2, descuentos2);
    	double saludEmp2 = descuentos2.getSalud() + (horasEmp2*0.04);
    	System.out.println(saludEmp2);
    	
    	System.out.println("Digite 1 si aporta a pension o 2 si no aporta");
    	int pension2 = scan.nextInt();
    	descuentos2.setPension(pension2);
    	descuentos2.pensionS(empleado2, descuentos2);
    	System.out.println(descuentos2.getPension());
    	double pensionEmp2 = descuentos2.getPension() + (horasEmp2*0.04);
    	System.out.println(pensionEmp2);
    	
    	System.out.println("Digite el valor del prestamo que posee");
    	int prestamo2 = scan.nextInt();
    	descuentos2.setPrestamos(prestamo2);
    	//descuentos2.prestamoS(empleado2, descuentos2);
    	System.out.println(prestamo2);
    	
    	System.out.println("Digite 1 si tiene un embargo o 2 si no lo tiene");
    	int embargo2 = scan.nextInt();
    	descuentos2.setEmbargos(embargo2);
    	descuentos2.embargoS(empleado2, descuentos2);
    	System.out.println(descuentos2.getEmbargos());
    	double embargoEmp2 = descuentos2.getEmbargos();
    	
    	System.out.println("Digite 1 si aporta a fondo de empleados o 2 si no aporta");
    	int fondoEmp2 = scan.nextInt();
    	descuentos2.setFondoEmpleados(fondoEmp2);
    	descuentos2.fondoEmpleadoS(empleado2, descuentos2);
    	System.out.println(descuentos2.getFondoEmpleados());
    	double fondoEmpleadosEmp2 = descuentos2.getFondoEmpleados() + (horasEmp2*0.1);
    	System.out.println(fondoEmpleadosEmp2);
    	
    	//EMPLEADO 3 - DEVENGADOS Y ADICIONES -----------------------------------------------------------------------
    	System.out.println("Defina el sueldo para el empleado 3");
    	int sueldo3 = scan.nextInt();
    	empleado3.setSueldoBasico(sueldo3);
    	int auxTransporte3 = devengado3.auxTrans(empleado3, devengado3);
    	
    	System.out.println("Digite las comisiones para el empleado 3");
    	int comision3 = scan.nextInt();
    	devengado3.setComisiones(comision3);
    	double comisionEmp3 = devengado3.getComisiones();
    	
    	System.out.println("Digite las bonificaciones para el empleado 3");
    	int bonificacion3 = scan.nextInt();
    	devengado3.setBonificaciones(bonificacion3);
    	double bonificaEmp3 = devengado3.getBonificaciones();
    	
    	System.out.println("Digite las horas extras diurnas para el empleado 3, si no tiene digite 0");
    	int horaExtraDiurna3 = scan.nextInt();
    	devengado3.setExtraDiurna(horaExtraDiurna3);
    	devengado3.horaExtraDiurna(empleado3, devengado3);
    	double extraDiurEmp3 = devengado3.getExtraDiurna();
    	
    	System.out.println("Digite las horas extras nocturnas para el empleado 3, si no tiene digite 0");
    	int horaExtraNocturna3 = scan.nextInt();
    	devengado3.setExtraNocturna(horaExtraNocturna3);
    	devengado3.horaExtraNocturna(empleado3, devengado3);
    	double extraNoturEmp3 = devengado3.getExtraNocturna();
    	
    	System.out.println("Si empleado 3 trabajo dia festivo, digite 8, si no, digite 0");
    	int festivoCompleto3 = scan.nextInt();
    	devengado3.setExtraFestivoCompleto(festivoCompleto3);
    	devengado3.horaExtraFestivoCompleto(empleado3, devengado3);
    	double festivoCompletoEmp3 = devengado3.getExtraFestivoCompleto();
    	
    	System.out.println("Digite las horas extras festivas diurnas para el empleado 3, si no tiene digite 0");
    	int horaFestExtraDiurna3 = scan.nextInt();
    	devengado3.setExtraFestivoDiurna(horaFestExtraDiurna3);
    	devengado3.horaExtraFestivoDiurno(empleado3, devengado3);
    	double extraFestDiurnEmp3 = devengado3.getExtraFestivoDiurna();
    	
    	System.out.println("Digite las horas extras festivas nocturnas para el empleado 3, si no tiene digite 0");
    	int horaFestExtraNocturna3 = scan.nextInt();
    	devengado3.setExtraFestivoNocturna(horaFestExtraNocturna3);
    	devengado3.horaExtraFestivoNocturno(empleado3, devengado3);
    	double extraFestNocturEmp3 = devengado3.getExtraFestivoNocturna();
    	
    	double horasEmp3 = extraDiurEmp3 + extraNoturEmp3 + festivoCompletoEmp3 + extraFestDiurnEmp3 + extraFestNocturEmp3;
    	System.out.println(horasEmp3);
    	
    	// DESCUENTOS Y DEDUCCIONES
    	System.out.println("Digite 1 si aporta a salud o 2 si no aporta");
    	int salud3 = scan.nextInt();
    	descuentos3.setSalud(salud3);
    	descuentos3.saludS(empleado3, descuentos3);
    	double saludEmp3 = descuentos3.getSalud() + (horasEmp3*0.04);
    	System.out.println(saludEmp3);
    	
    	System.out.println("Digite 1 si aporta a pension o 2 si no aporta");
    	int pension3 = scan.nextInt();
    	descuentos3.setPension(pension3);
    	descuentos3.pensionS(empleado3, descuentos3);
    	System.out.println(descuentos3.getPension());
    	double pensionEmp3 = descuentos3.getPension() + (horasEmp3*0.04);
    	System.out.println(pensionEmp3);
    	
    	System.out.println("Digite el valor del prestamo que posee");
    	int prestamo3 = scan.nextInt();
    	descuentos3.setPrestamos(prestamo3);
    	//descuentos3.prestamoS(empleado3, descuentos3);
    	System.out.println(prestamo3);
    	
    	System.out.println("Digite 1 si tiene un embargo o 2 si no lo tiene");
    	int embargo3 = scan.nextInt();
    	descuentos3.setEmbargos(embargo3);
    	descuentos3.embargoS(empleado3, descuentos3);
    	System.out.println(descuentos3.getEmbargos());
    	double embargoEmp3 = descuentos3.getEmbargos();
    	
    	System.out.println("Digite 1 si aporta a fondo de empleados o 2 si no aporta");
    	int fondoEmp3 = scan.nextInt();
    	descuentos3.setFondoEmpleados(fondoEmp3);
    	descuentos3.fondoEmpleadoS(empleado3, descuentos3);
    	System.out.println(descuentos3.getFondoEmpleados());
    	double fondoEmpleadosEmp3 = descuentos3.getFondoEmpleados() + (horasEmp3*0.1);
    	System.out.println(fondoEmpleadosEmp3);
    	
    	
    	//EMPLEADO 4 - DEVENGADOS Y ADICIONES -----------------------------------------------------------------------
    	System.out.println("Digite el sueldo para el empleado 4");
    	int sueldo4 = scan.nextInt();
    	empleado4.setSueldoBasico(sueldo4);
    	int auxTransporte4 = devengado4.auxTrans(empleado4, devengado4);
    	
    	System.out.println("Digite las comisiones para el empleado 4");
    	int comision4 = scan.nextInt();
    	devengado4.setComisiones(comision4);
    	double comisionEmp4 = devengado4.getComisiones();
    	
    	System.out.println("Digite las bonificaciones para el empleado 4");
    	int bonificacion4 = scan.nextInt();
    	devengado4.setBonificaciones(bonificacion4);
    	double bonificaEmp4 = devengado4.getBonificaciones();
    	
    	System.out.println("Digite las horas extras diurnas para el empleado 4, si no tiene digite 0");
    	int horaExtraDiurna4 = scan.nextInt();
    	devengado4.setExtraDiurna(horaExtraDiurna4);
    	devengado4.horaExtraDiurna(empleado4, devengado4);
    	double extraDiurEmp4 = devengado4.getExtraDiurna();
    	
    	System.out.println("Digite las horas extras nocturnas para el empleado 4, si no tiene digite 0");
    	int horaExtraNocturna4 = scan.nextInt();
    	devengado4.setExtraNocturna(horaExtraNocturna4);
    	devengado4.horaExtraNocturna(empleado4, devengado4);
    	double extraNoturEmp4 = devengado4.getExtraNocturna();
    	
    	System.out.println("Si empleado 4 trabajo dia festivo, digite 8, si no, digite 0");
    	int festivoCompleto4 = scan.nextInt();
    	devengado4.setExtraFestivoCompleto(festivoCompleto4);
    	devengado4.horaExtraFestivoCompleto(empleado4, devengado4);
    	double festivoCompletoEmp4 = devengado4.getExtraFestivoCompleto();
    	
    	System.out.println("Digite las horas extras festivas diurnas para el empleado 4, si no tiene digite 0");
    	int horaFestExtraDiurna4 = scan.nextInt();
    	devengado4.setExtraFestivoDiurna(horaFestExtraDiurna4);
    	devengado4.horaExtraFestivoDiurno(empleado4, devengado4);
    	double extraFestDiurnEmp4 = devengado4.getExtraFestivoDiurna();
    	
    	System.out.println("Digite las horas extras festivas nocturnas para el empleado 4, si no tiene digite 0");
    	int horaFestExtraNocturna4 = scan.nextInt();
    	devengado4.setExtraFestivoNocturna(horaFestExtraNocturna4);
    	devengado4.horaExtraFestivoNocturno(empleado4, devengado4);
    	double extraFestNocturEmp4 = devengado4.getExtraFestivoNocturna();
    	
    	double horasEmp4 = extraDiurEmp4 + extraNoturEmp4 + festivoCompletoEmp4 + extraFestDiurnEmp4 + extraFestNocturEmp4;
    	System.out.println(horasEmp4);
    	
    	// DESCUENTOS Y DEDUCCIONES
    	System.out.println("Digite 1 si aporta a salud o 2 si no aporta");
    	int salud4 = scan.nextInt();
    	descuentos4.setSalud(salud4);
    	descuentos4.saludS(empleado4, descuentos4);
    	double saludEmp4 = descuentos4.getSalud() + (horasEmp4*0.04);
    	System.out.println(saludEmp4);
    	
    	System.out.println("Digite 1 si aporta a pension o 2 si no aporta");
    	int pension4 = scan.nextInt();
    	descuentos4.setPension(pension4);
    	descuentos4.pensionS(empleado4, descuentos4);
    	System.out.println(descuentos4.getPension());
    	double pensionEmp4 = descuentos4.getPension() + (horasEmp4*0.04);
    	System.out.println(pensionEmp4);
    	
    	System.out.println("Digite el valor del prestamo que posee");
    	int prestamo4 = scan.nextInt();
    	descuentos4.setPrestamos(prestamo4);
    	//descuentos4.prestamoS(empleado4, descuentos4);
    	System.out.println(prestamo4);
    	
    	System.out.println("Digite 1 si tiene un embargo o 2 si no lo tiene");
    	int embargo4 = scan.nextInt();
    	descuentos4.setEmbargos(embargo4);
    	descuentos4.embargoS(empleado4, descuentos4);
    	System.out.println(descuentos4.getEmbargos());
    	double embargoEmp4 = descuentos4.getEmbargos();
    	
    	System.out.println("Digite 1 si aporta a fondo de empleados o 2 si no aporta");
    	int fondoEmp4 = scan.nextInt();
    	descuentos4.setFondoEmpleados(fondoEmp4);
    	descuentos4.fondoEmpleadoS(empleado4, descuentos4);
    	System.out.println(descuentos2.getFondoEmpleados());
    	double fondoEmpleadosEmp4 = descuentos4.getFondoEmpleados() + (horasEmp4*0.1);
    	System.out.println(fondoEmpleadosEmp4);
    	
    	//EMPLEADO 5 - DEVENGADOS Y ADICIONES -----------------------------------------------------------------------
    	System.out.println("Digite el sueldo para el empleado 5");
    	int sueldo5 = scan.nextInt();
    	empleado5.setSueldoBasico(sueldo5);
    	int auxTransporte5 = devengado5.auxTrans(empleado5, devengado5);
    	
    	System.out.println("Digite las comisiones para el empleado 5");
    	int comision5 = scan.nextInt();
    	devengado5.setComisiones(comision5);
    	double comisionEmp5 = devengado5.getComisiones();
    	
    	System.out.println("Digite las bonificaciones para el empleado 5");
    	int bonificacion5 = scan.nextInt();
    	devengado5.setBonificaciones(bonificacion5);
    	double bonificaEmp5 = devengado5.getBonificaciones();
    	
    	System.out.println("Digite las horas extras diurnas para el empleado 5, si no tiene digite 0");
    	int horaExtraDiurna5 = scan.nextInt();
    	devengado5.setExtraDiurna(horaExtraDiurna5);
    	devengado5.horaExtraDiurna(empleado5, devengado5);
    	double extraDiurEmp5 = devengado5.getExtraDiurna();
    	
    	System.out.println("Digite las horas extras nocturnas para el empleado 5, si no tiene digite 0");
    	int horaExtraNocturna5 = scan.nextInt();
    	devengado5.setExtraNocturna(horaExtraNocturna5);
    	devengado5.horaExtraNocturna(empleado5, devengado5);
    	double extraNoturEmp5 = devengado5.getExtraNocturna();
    	
    	System.out.println("Si empleado 5 trabajo dia festivo, digite 8, si no, digite 0");
    	int festivoCompleto5 = scan.nextInt();
    	devengado5.setExtraFestivoCompleto(festivoCompleto5);
    	devengado5.horaExtraFestivoCompleto(empleado5, devengado5);
    	double festivoCompletoEmp5 = devengado5.getExtraFestivoCompleto();
    	
    	System.out.println("Digite las horas extras festivas diurnas para el empleado 5, si no tiene digite 0");
    	int horaFestExtraDiurna5 = scan.nextInt();
    	devengado5.setExtraFestivoDiurna(horaFestExtraDiurna5);
    	devengado5.horaExtraFestivoDiurno(empleado5, devengado5);
    	double extraFestDiurnEmp5 = devengado5.getExtraFestivoDiurna();
    	
    	
    	System.out.println("Digite las horas extras festivas nocturnas para el empleado 5, si no tiene digite 0");
    	int horaFestExtraNocturna5 = scan.nextInt();
    	devengado5.setExtraFestivoNocturna(horaFestExtraNocturna5);
    	devengado5.horaExtraFestivoNocturno(empleado5, devengado5);
    	double extraFestNocturEmp5 = devengado5.getExtraFestivoNocturna();
    	
    	double horasEmp5 = extraDiurEmp5 + extraNoturEmp5 + festivoCompletoEmp5 + extraFestDiurnEmp5 + extraFestNocturEmp5;
    	System.out.println(horasEmp5);
    	
    	// DESCUENTOS Y DEDUCCIONES
    	System.out.println("Digite 1 si aporta a salud o 2 si no aporta");
    	int salud5 = scan.nextInt();
    	descuentos5.setSalud(salud5);
    	descuentos5.saludS(empleado5, descuentos5);
    	double saludEmp5 = descuentos5.getSalud() + (horasEmp5*0.04);
    	System.out.println(saludEmp5);
    	
    	System.out.println("Digite 1 si aporta a pension o 2 si no aporta");
    	int pension5 = scan.nextInt();
    	descuentos5.setPension(pension5);
    	descuentos5.pensionS(empleado5, descuentos5);
    	System.out.println(descuentos5.getPension());
    	double pensionEmp5 = descuentos5.getPension() + (horasEmp5*0.04);
    	System.out.println(pensionEmp5);
    	
    	System.out.println("Digite el valor del prestamo que posee");
    	int prestamo5 = scan.nextInt();
    	descuentos5.setPrestamos(prestamo5);
    	//descuentos5.prestamoS(empleado5, descuentos5);
    	System.out.println(prestamo5);
    	
    	System.out.println("Digite 1 si tiene un embargo o 2 si no lo tiene");
    	int embargo5 = scan.nextInt();
    	descuentos5.setEmbargos(embargo5);
    	descuentos5.embargoS(empleado5, descuentos5);
    	System.out.println(descuentos5.getEmbargos());
    	double embargoEmp5 = descuentos5.getEmbargos();
    	
    	System.out.println("Digite 1 si aporta a fondo de empleados o 2 si no aporta");
    	int fondoEmp5 = scan.nextInt();
    	descuentos5.setFondoEmpleados(fondoEmp5);
    	descuentos2.fondoEmpleadoS(empleado2, descuentos2);
    	System.out.println(descuentos2.getFondoEmpleados());
    	double fondoEmpleadosEmp5 = descuentos5.getFondoEmpleados() + (horasEmp5*0.1);
    	System.out.println(fondoEmpleadosEmp5);
    	
    	double totalSueldosBasicos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
    	double totalAuxTranspor = auxTransporte1 + auxTransporte2 + auxTransporte3 + auxTransporte4 + auxTransporte5;
    	double horasExtrasTotales = horasEmp1 + horasEmp2 +horasEmp3 + horasEmp4 + horasEmp5;
    	double totalBonificaiones = bonificaEmp1 + bonificaEmp2 + bonificaEmp3 + bonificaEmp4 + bonificaEmp5;
    	double totalComisiones = comisionEmp1 + comisionEmp2 + comisionEmp3 + comisionEmp4 + comisionEmp5;
    	
    	double totalSalud = saludEmp1 + saludEmp2 + saludEmp3 + saludEmp4 + saludEmp5;
    	double totalPensiones = pensionEmp1 + pensionEmp2 + pensionEmp3 + pensionEmp4 + pensionEmp5;
    	double totalPrestamos = prestamo1 + prestamo2 + prestamo3 + prestamo4 + prestamo5;
    	double totalEmbargos = embargoEmp1 + embargoEmp2 + embargoEmp3 + embargoEmp4 + embargoEmp5;
    	double totalFondoEmpleados = fondoEmpleadosEmp1 + fondoEmpleadosEmp2 + fondoEmpleadosEmp3 + fondoEmpleadosEmp4 + fondoEmpleadosEmp5;
    	
    	
    	double totalDevengadoEmp1 = sueldo1 + auxTransporte1 + horasEmp1 + bonificaEmp1 + comisionEmp1;
    	double totalDevengadoEmp2 = sueldo2 + auxTransporte2 + horasEmp2 + bonificaEmp2 + comisionEmp2;
    	double totalDevengadoEmp3 = sueldo3 + auxTransporte3 + horasEmp3 + bonificaEmp3 + comisionEmp3;
    	double totalDevengadoEmp4 = sueldo4 + auxTransporte4 + horasEmp4 + bonificaEmp4 + comisionEmp4;
    	double totalDevengadoEmp5 = sueldo5 + auxTransporte5 + horasEmp5 + bonificaEmp5 + comisionEmp5;
    	double totalDevengadosTodos = totalDevengadoEmp1 + totalDevengadoEmp2 + totalDevengadoEmp3 + totalDevengadoEmp4 + totalDevengadoEmp5;
    	
    	double totalDescuentoDeducciEmp1 = saludEmp1 + pensionEmp1 + prestamo1 + embargoEmp1 + fondoEmpleadosEmp1;
    	double totalDescuentoDeducciEmp2 = saludEmp2 + pensionEmp2 + prestamo2 + embargoEmp2 + fondoEmpleadosEmp2;
    	double totalDescuentoDeducciEmp3 = saludEmp3 + pensionEmp3 + prestamo3 + embargoEmp3 + fondoEmpleadosEmp3;
    	double totalDescuentoDeducciEmp4 = saludEmp4 + pensionEmp4 + prestamo4 + embargoEmp4 + fondoEmpleadosEmp4;
    	double totalDescuentoDeducciEmp5 = saludEmp5 + pensionEmp5 + prestamo5 + embargoEmp5 + fondoEmpleadosEmp5;
    	double TotalDescuentosYDeducciones = totalDescuentoDeducciEmp1 + totalDescuentoDeducciEmp2 + totalDescuentoDeducciEmp3 + totalDescuentoDeducciEmp4 + totalDescuentoDeducciEmp5;
    	
    	double netoPagarEmp1 = totalDevengadoEmp1 - totalDescuentoDeducciEmp1;
    	double netoPagarEmp2 = totalDevengadoEmp2 - totalDescuentoDeducciEmp2;
    	double netoPagarEmp3 = totalDevengadoEmp3 - totalDescuentoDeducciEmp3;
    	double netoPagarEmp4 = totalDevengadoEmp4 - totalDescuentoDeducciEmp4;
    	double netoPagarEmp5 = totalDevengadoEmp5 - totalDescuentoDeducciEmp5;
    	double netoTotalPagar = netoPagarEmp1 + netoPagarEmp2 + netoPagarEmp3 + netoPagarEmp4 + netoPagarEmp5;
    }
    
    /*
    @Override
    public void start(Stage primaryStage) throws Exception{
    	try {
    	Parent root = FXMLLoader.load(getClass().getResource("/uan/edu/co/Vista/VistaNomina.fxml"));
    	Scene scene = new Scene(root);
    	primaryStage.setScene(scene);
    	
    	primaryStage.show();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }*/
}
