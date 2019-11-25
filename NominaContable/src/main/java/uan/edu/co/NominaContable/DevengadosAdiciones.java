package uan.edu.co.NominaContable;

public class DevengadosAdiciones {
	
	private int auxTransporte;
	private int extraDiurna;
	private int extraNocturna;
	private int extraFestivoCompleto;
	private int extraFestivoDiurna;
	private int ExtraFestivoNocturna;
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
		return ExtraFestivoNocturna;
	}
	public void setExtraFestivoNocturna(int extraFestivoNocturna) {
		ExtraFestivoNocturna = extraFestivoNocturna;
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
	public int AuxTrans(Empleado empleado, DevengadosAdiciones auxTransporte) {
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

}
