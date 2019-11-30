package uan.edu.co.NominaContable;

public class DescuentosYDeducciones {
	
	private double salud;
	private double pension;
	private double prestamos;
	private double embargos;
	private double fondoEmpleados;
	
	public double getSalud() {
		return salud;
	}
	public void setSalud(double salud) {
		this.salud = salud;
	}
	public double getPension() {
		return pension;
	}
	public void setPension(double pension) {
		this.pension = pension;
	}
	public double getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(double prestamos) {
		this.prestamos = prestamos;
	}
	public double getEmbargos() {
		return embargos;
	}
	public void setEmbargos(double embargos) {
		this.embargos = embargos;
	}
	public double getFondoEmpleados() {
		return fondoEmpleados;
	}
	public void setFondoEmpleados(double fondoEmpleados) {
		this.fondoEmpleados = fondoEmpleados;
	}

	//SALUD
	public double saludS(Empleado empleado, DescuentosYDeducciones saludEmp) {
		
		if(saludEmp.getSalud() == 1) {
			double valorSalud = empleado.getSueldoBasico() *0.04;
			
			
			saludEmp.setSalud(valorSalud);
		}
		else if(saludEmp.getSalud() == 2) {
			saludEmp.setSalud(0);
		}
		
		return saludEmp.getSalud();
	}
	
	
	//PENSION
	public double pensionS(Empleado empleado, DescuentosYDeducciones pensionEmp) {
		
		if(pensionEmp.getPension() == 1) {
			double valorPension = empleado.getSueldoBasico()*0.04;
			
			
			pensionEmp.setPension(valorPension);
		}
		else if(pensionEmp.getPension() == 2) {
			pensionEmp.setPension(0);
		}
		
		return pensionEmp.getPension();
	}
	
	
	/*/PRESTAMOS
	public double prestamoS(Empleado empleado, DescuentosYDeducciones prestamoEmp) {
		
		if(prestamoEmp.getPrestamos() > 0) {
			double valorPrestamo = (empleado.getSueldoBasico()-828116)/5;
			
			
			prestamoEmp.setPrestamos(valorPrestamo);
		}
		else if(prestamoEmp.getPrestamos() == 0) {
			prestamoEmp.setPrestamos(0);
		}
		
		return prestamoEmp.getPrestamos();
	}*/

	
	//EMBARGOS
	public double embargoS(Empleado empleado, DescuentosYDeducciones embargoEmp) {
		
		if(embargoEmp.getEmbargos() == 1) {
			double valorEmbargo = (empleado.getSueldoBasico()-828116)/5;
			
			
			embargoEmp.setEmbargos(valorEmbargo);
		}
		else if(embargoEmp.getEmbargos() == 2) {
			embargoEmp.setEmbargos(0);
		}
		
		return embargoEmp.getEmbargos();
	}
	
	
	//FONDO DE EMPLEADOS
	public double fondoEmpleadoS(Empleado empleado, DescuentosYDeducciones fondoEmp) {
		
		if(fondoEmp.getFondoEmpleados() == 1) {
			double valorFondoEmp = empleado.getSueldoBasico()*0.1;
			
			
			fondoEmp.setFondoEmpleados(valorFondoEmp);
		}
		else if(fondoEmp.getFondoEmpleados() == 2) {
			fondoEmp.setFondoEmpleados(0);
		}
		
		return fondoEmp.getFondoEmpleados();
	}
}
