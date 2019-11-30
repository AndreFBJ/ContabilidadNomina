package uan.edu.co.NominaContable;

public class DevengadosAdiciones {
	
	private int auxTransporte;
	private double extraDiurna;
	private double extraNocturna;
	private int extraFestivoCompleto;
	private double extraFestivoDiurna;
	private double extraFestivoNocturna;
	private int bonificaciones;
	private int comisiones;
	
	public int getAuxTransporte() {
		return auxTransporte;
	}
	public void setAuxTransporte(int auxTransporte) {
		this.auxTransporte = auxTransporte;
	}
	public double getExtraDiurna() {
		return extraDiurna;
	}
	public void setExtraDiurna(double extraDiurna) {
		this.extraDiurna = extraDiurna;
	}
	public double getExtraNocturna() {
		return extraNocturna;
	}
	public void setExtraNocturna(double extraNocturna) {
		this.extraNocturna = extraNocturna;
	}
	public int getExtraFestivoCompleto() {
		return extraFestivoCompleto;
	}
	public void setExtraFestivoCompleto(int extraFestivoCompleto) {
		this.extraFestivoCompleto = extraFestivoCompleto;
	}
	public double getExtraFestivoDiurna() {
		return extraFestivoDiurna;
	}
	public void setExtraFestivoDiurna(double extraFestivoDiurna) {
		this.extraFestivoDiurna = extraFestivoDiurna;
	}
	public double getExtraFestivoNocturna() {
		return extraFestivoNocturna;
	}
	public void setExtraFestivoNocturna(double extraFestivoNocturna) {
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
	
	//CALCULAR HORA EXTRA DIURNA
	public double horaExtraDiurna(Empleado empleado, DevengadosAdiciones horaExtra) {
		
		if(horaExtra.getExtraDiurna() > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorDiurna = (valorHora*1.25)*horaExtra.getExtraDiurna();
			
			horaExtra.setExtraDiurna(valorDiurna);
		}
		else if(horaExtra.getExtraDiurna() == 0) {
			horaExtra.setExtraDiurna(0);
		}
		return horaExtra.getExtraDiurna();
	}
	
	//CALCULAR HORA EXTRA NOCTURNA
	public double horaExtraNocturna(Empleado empleado, DevengadosAdiciones horaNocturna) {
		 
		 if(horaNocturna.getExtraNocturna() > 0) {
			 int valorHora = empleado.getSueldoBasico()/240;
			 double valorNocturno = (valorHora*1.75)*horaNocturna.getExtraNocturna();
			 
			 horaNocturna.setExtraNocturna(valorNocturno);
		 }
		 else if(horaNocturna.getExtraNocturna() == 0) {
			 horaNocturna.setExtraNocturna(0);
		 }
		 
		 return horaNocturna.getExtraNocturna();
	}
	
	//CALCULAR HORA EXTRA FESTIVO COMPLETO - falta
	public int horaExtraFestivoCompleto(Empleado empleado, DevengadosAdiciones extraFestivo) {
		this.extraFestivoCompleto = 0;
		
		if(extraFestivoCompleto > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorFestiComple = (valorHora*1.75)*8;
		}
		
		return 
	}
	
	//CALCULAR HORA EXTRA FESTIVO DIURNO
	public double horaExtraFestivoDiurno(Empleado empleado, DevengadosAdiciones extraFestivoDiurno) {
		
		if(extraFestivoDiurno.getExtraFestivoDiurna() > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorFestiDiur = (valorHora*2)*extraFestivoDiurno.getExtraFestivoDiurna();
			
			extraFestivoDiurno.setExtraFestivoDiurna(valorFestiDiur);
		}
		else if(extraFestivoDiurno.getExtraFestivoDiurna() == 0) {
			extraFestivoDiurno.setExtraFestivoDiurna(0);
		}
		
		return extraFestivoDiurno.getExtraFestivoDiurna();
	}
	
	//CALCULAR HORA EXTRA FESTIVA NOCTURNA
	public double horaExtraFestivoNocturno(Empleado empleado, DevengadosAdiciones extraFestivoNoct) {
		
		if(extraFestivoNoct.getExtraFestivoNocturna() > 0) {
			int valorHora = empleado.getSueldoBasico()/240;
			double valorFestiNoctur = (valorHora*2.5)*extraFestivoNoct.getExtraFestivoNocturna();
			
			extraFestivoNoct.setExtraFestivoNocturna(valorFestiNoctur);
		}
		else if(extraFestivoNoct.getExtraFestivoNocturna() == 0) {
			extraFestivoNoct.setExtraFestivoNocturna(0);
		}
		
		return extraFestivoNoct.getExtraFestivoNocturna();
	} 
}