package uan.edu.co.NominaContable;

public class DevengadosAdiciones {
	
	private int auxTransporte;
	private int extraDiurna;
	private int extraNocturna;
	private int extraFestivoCompleto;
	private int extraFestivoDiurna;
	private int extraFestivoNocturna;
	private int bonificaciones;
	private int comisiones;
	
	public int getAuxTransporte() {
		return auxTransporte;
	}
	public void setAuxTransporte(int auxTransporte) {
		this.auxTransporte = auxTransporte;
	}
	public int getExtraDiurna() {
		return extraDiurna;
	}
	public void setExtraDiurna(int extraDiurna) {
		this.extraDiurna = extraDiurna;
	}
	public int getExtraNocturna() {
		return extraNocturna;
	}
	public void setExtraNocturna(int extraNocturna) {
		this.extraNocturna = extraNocturna;
	}
	public int getExtraFestivoCompleto() {
		return extraFestivoCompleto;
	}
	public void setExtraFestivoCompleto(int extraFestivoCompleto) {
		this.extraFestivoCompleto = extraFestivoCompleto;
	}
	public int getExtraFestivoDiurna() {
		return extraFestivoDiurna;
	}
	public void setExtraFestivoDiurna(int extraFestivoDiurna) {
		this.extraFestivoDiurna = extraFestivoDiurna;
	}
	public int getExtraFestivoNocturna() {
		return extraFestivoNocturna;
	}
	public void setExtraFestivoNocturna(int extraFestivoNocturna) {
		extraFestivoNocturna = extraFestivoNocturna;
	}
	public int getBonificaciones() {
		return bonificaciones;
	}
	public void setBonificaciones(int bonificaciones) {
		this.bonificaciones = bonificaciones;
	}
	public int getComisiones() {
		return comisiones;
	}
	public void setComisiones(int comisiones) {
		this.comisiones = comisiones;
	}
	
	
	//FUNCION PARA CALCULAR SI APLICA O NO EL AUXILIO DE TRNASPORTE
	public int auxTrans(Empleado empleado, DevengadosAdiciones auxTransporte) {
		if(empleado.getSueldoBasico() < 1656232)
    	{
    		auxTransporte.setAuxTransporte(empleado.getSueldoBasico()+97032);
    	}
    	else if(empleado.getSueldoBasico() > 1656232)
    	{
    		auxTransporte.setAuxTransporte(empleado.getSueldoBasico()+0);
    	}
		
		return auxTransporte.getAuxTransporte();
	}
	
	public int horaExtraDiurna(Empleado empleado) {
		
		this.extraDiurna = 0;
		
		if(extraDiurna > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorDiurna = (valorHora*1.25)*extraDiurna ;	
		}
	}
	
	public int horaExtraNocturna(Empleado empleado) {
		 this.extraNocturna = 0;
		 
		 if(extraNocturna > 0) {
			 int valorHora = empleado.getSueldoBasico()/240;
			 double valorNocturno = (valorHora*1.75)*extraNocturna;
		 }
	}
	
	public int horaExtraFestivoCompleto(Empleado empleado) {
		this.extraFestivoCompleto = 0;
		
		if(extraFestivoCompleto > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorFestiComple = (valorHora*1.75)*8;
		}
		
		return 
	}
	
	public int horaExtraFestivoDiurno(Empleado empleado) {
		this.extraFestivoDiurna = 0;
		
		if(extraFestivoDiurna > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorFestiDiur = (valorHora*1.25)*extraFestivoDiurna;
		}
	}
	
	public int horaExtraFestivoNocturno(Empleado empleado) {
		this.extraFestivoNocturna = 0;
		
		if(extraFestivoNocturna > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorFestiNoctur = (valorHora*1.25)*extraFestivoNocturna;
		}
	} 
}