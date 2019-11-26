package uan.edu.co.Controladores;


import uan.edu.co.NominaContable.*;
import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class VistaControlador {
	
	Empleado empleado1 = new Empleado();
	DevengadosAdiciones devengado1 = new DevengadosAdiciones();
	
	Empleado empleado2 = new Empleado();
	DevengadosAdiciones devengado2 = new DevengadosAdiciones();
	
	Empleado empleado3 = new Empleado();
	DevengadosAdiciones devengado3 = new DevengadosAdiciones();
	
	Empleado empleado4 = new Empleado();
	DevengadosAdiciones devengado4 = new DevengadosAdiciones();
	
	Empleado empleado5 = new Empleado();
	DevengadosAdiciones devengado5 = new DevengadosAdiciones();

	@FXML
    private TextField sueldoEmp1;

    @FXML
    private TextField bonifiEmp1;

    @FXML
    private TextField comisioEmp1;

    @FXML
    private TextField exDiurEmp1;

    @FXML
    private TextField exNoctuEmp1;

    @FXML
    private TextField exDiurFesEmp1;

    @FXML
    private TextField exNoctFesEmp1;

    @FXML
    private RadioButton festDiaEmp1;

    @FXML
    private TextField prestamoEmp1;

    @FXML
    private RadioButton saludEmp1;

    @FXML
    private RadioButton pensionEmp1;

    @FXML
    private RadioButton embargoEmp1;

    @FXML
    private RadioButton fondoEmp1;

    @FXML
    private TextField sueldoEmp2;

    @FXML
    private TextField bonifiEmp2;

    @FXML
    private TextField comisioEmp2;

    @FXML
    private TextField exDiurEmp2;

    @FXML
    private TextField exNoctuEmp2;

    @FXML
    private TextField exDiurFesEmp2;

    @FXML
    private TextField exNoctFesEmp2;

    @FXML
    private RadioButton festDiaEmp2;

    @FXML
    private TextField prestamoEmp2;

    @FXML
    private RadioButton saludEmp2;

    @FXML
    private RadioButton pensionEmp2;

    @FXML
    private RadioButton embargoEmp2;

    @FXML
    private RadioButton fondoEmp2;

    @FXML
    private TextField sueldoEmp3;

    @FXML
    private TextField bonifiEmp3;

    @FXML
    private TextField comisioEmp3;

    @FXML
    private TextField exDiurEmp3;

    @FXML
    private TextField exNoctuEmp3;

    @FXML
    private TextField exDiurFesEmp3;

    @FXML
    private TextField exNoctFesEmp3;

    @FXML
    private RadioButton festDiaEmp3;

    @FXML
    private TextField prestamoEmp3;

    @FXML
    private RadioButton saludEmp3;

    @FXML
    private RadioButton pensionEmp3;

    @FXML
    private RadioButton embargoEmp3;

    @FXML
    private RadioButton fondoEmp3;

    @FXML
    private TextField sueldoEmp4;

    @FXML
    private TextField bonifiEmp4;

    @FXML
    private TextField comisioEmp4;

    @FXML
    private TextField exDiurEmp4;

    @FXML
    private TextField exNoctuEmp4;

    @FXML
    private TextField exDiurFesEmp4;

    @FXML
    private TextField exNoctFesEmp4;

    @FXML
    private RadioButton festDiaEmp4;

    @FXML
    private TextField prestamoEmp4;

    @FXML
    private RadioButton saludEmp4;

    @FXML
    private RadioButton pensionEmp4;

    @FXML
    private RadioButton embargoEmp4;

    @FXML
    private RadioButton fondoEmp4;

    @FXML
    private TextField sueldoEmp5;

    @FXML
    private TextField bonifiEmp5;

    @FXML
    private TextField comisioEmp5;

    @FXML
    private TextField exDiurEmp5;

    @FXML
    private TextField exNoctuEmp5;

    @FXML
    private TextField exDiurFesEmp5;

    @FXML
    private TextField exNoctFesEmp5;

    @FXML
    private RadioButton festDiaEmp5;

    @FXML
    private TextField prestamoEmp5;

    @FXML
    private RadioButton saludEmp5;

    @FXML
    private RadioButton pensionEmp5;

    @FXML
    private RadioButton embargoEmp5;

    @FXML
    private RadioButton fondoEmp5;

    @FXML
    private Button generarNominaTotal;
    
    @FXML
    void calculoTotalNomina(ActionEvent event) {
    	
    	//Para empleado 1
    	empleado1.setNombre("empleado 1");
    	int sueldo1=Integer.parseInt(sueldoEmp1.getText());
    	empleado1.setSueldoBasico(sueldo1);
    	
    	devengado1.auxTrans(empleado1, devengado1);
    	
    	double extrasDiurna1 = Double.parseDouble(exDiurEmp1.getText());
    	devengado1.setExtraDiurna(extrasDiurna1);
    	devengado1.horaExtraDiurna(empleado1, devengado1);
    	
    	double extrasNocturna1 = Double.parseDouble(exNoctuEmp1.getText());
    	devengado1.setExtraNocturna(extrasNocturna1);
    	devengado1.horaExtraNocturna(empleado1, devengado1);
    	
    	double extrasFestivoDiurnos1 = Double.parseDouble(exDiurFesEmp1.getText());
    	devengado1.setExtraFestivoDiurna(extrasFestivoDiurnos1);
    	devengado1.horaExtraFestivoDiurno(empleado1, devengado1);
    	
    	double extrasFestivoNocturnos1 = Double.parseDouble(exNoctFesEmp1.getText());
    	devengado1.setExtraFestivoDiurna(extrasFestivoNocturnos1);
    	devengado1.horaExtraFestivoNocturno(empleado1, devengado1);
    	
    	//Para empleado 2
    	empleado2.setNombre("empleado 2");
    	int sueldo2=Integer.parseInt(sueldoEmp2.getText());
    	empleado1.setSueldoBasico(sueldo2);
    	
    	devengado2.auxTrans(empleado2, devengado2);
    	
    	double extrasDiurna2 = Double.parseDouble(exDiurEmp2.getText());
    	devengado2.setExtraDiurna(extrasDiurna2);
    	devengado2.horaExtraDiurna(empleado2, devengado2);
    	
    	double extrasNocturna2 = Double.parseDouble(exNoctuEmp2.getText());
    	devengado2.setExtraNocturna(extrasNocturna2);
    	devengado2.horaExtraNocturna(empleado2, devengado2);
    	
    	double extrasFestivoDiurnos2 = Double.parseDouble(exDiurFesEmp2.getText());
    	devengado2.setExtraFestivoDiurna(extrasFestivoDiurnos2);
    	devengado2.horaExtraFestivoDiurno(empleado2, devengado2);
    	
    	double extrasFestivoNocturnos2 = Double.parseDouble(exNoctFesEmp2.getText());
    	devengado2.setExtraFestivoDiurna(extrasFestivoNocturnos2);
    	devengado2.horaExtraFestivoNocturno(empleado2, devengado2);
    	
    	//Para empleado 3
    	empleado3.setNombre("empleado 3");
    	int sueldo3=Integer.parseInt(sueldoEmp3.getText());
    	empleado3.setSueldoBasico(sueldo3);
    	
    	devengado3.auxTrans(empleado3, devengado3);
    	
    	double extrasDiurna3 = Double.parseDouble(exDiurEmp3.getText());
    	devengado3.setExtraDiurna(extrasDiurna3);
    	devengado3.horaExtraDiurna(empleado3, devengado3);
    	
    	double extrasNocturna3 = Double.parseDouble(exNoctuEmp3.getText());
    	devengado3.setExtraNocturna(extrasNocturna3);
    	devengado3.horaExtraNocturna(empleado3, devengado3);
    	
    	double extrasFestivoDiurnos3 = Double.parseDouble(exDiurFesEmp3.getText());
    	devengado3.setExtraFestivoDiurna(extrasFestivoDiurnos3);
    	devengado3.horaExtraFestivoDiurno(empleado3, devengado3);
    	
    	double extrasFestivoNocturnos3 = Double.parseDouble(exNoctFesEmp3.getText());
    	devengado3.setExtraFestivoDiurna(extrasFestivoNocturnos3);
    	devengado3.horaExtraFestivoNocturno(empleado3, devengado3);
    	
    	//Para empleado 4
    	empleado4.setNombre("empleado 4");
    	int sueldo4=Integer.parseInt(sueldoEmp4.getText());
    	empleado4.setSueldoBasico(sueldo4);
    	
    	devengado4.auxTrans(empleado4, devengado4);
    	
    	double extrasDiurna4 = Double.parseDouble(exDiurEmp4.getText());
    	devengado4.setExtraDiurna(extrasDiurna4);
    	devengado4.horaExtraDiurna(empleado4, devengado4);
    	
    	double extrasNocturna4 = Double.parseDouble(exNoctuEmp4.getText());
    	devengado4.setExtraNocturna(extrasNocturna4);
    	devengado4.horaExtraNocturna(empleado4, devengado4);
    	
    	double extrasFestivoDiurnos4 = Double.parseDouble(exDiurFesEmp4.getText());
    	devengado4.setExtraFestivoDiurna(extrasFestivoDiurnos4);
    	devengado4.horaExtraFestivoDiurno(empleado4, devengado4);
    	
    	double extrasFestivoNocturnos4 = Double.parseDouble(exNoctFesEmp4.getText());
    	devengado4.setExtraFestivoDiurna(extrasFestivoNocturnos4);
    	devengado4.horaExtraFestivoNocturno(empleado4, devengado4);
    	
    	//Para empleado 5
    	empleado5.setNombre("empleado 5");
    	int sueldo5=Integer.parseInt(sueldoEmp5.getText());
    	empleado5.setSueldoBasico(sueldo5);
    	
    	devengado5.auxTrans(empleado5, devengado5);
    	
    	double extrasDiurna5 = Double.parseDouble(exDiurEmp5.getText());
    	devengado2.setExtraDiurna(extrasDiurna5);
    	devengado5.horaExtraDiurna(empleado5, devengado5);
    	
    	double extrasNocturna5 = Double.parseDouble(exNoctuEmp5.getText());
    	devengado5.setExtraNocturna(extrasNocturna5);
    	devengado5.horaExtraNocturna(empleado5, devengado5);
    	
    	double extrasFestivoDiurnos5 = Double.parseDouble(exDiurFesEmp5.getText());
    	devengado5.setExtraFestivoDiurna(extrasFestivoDiurnos5);
    	devengado5.horaExtraFestivoDiurno(empleado5, devengado5);
    	
    	double extrasFestivoNocturnos5 = Double.parseDouble(exNoctFesEmp5.getText());
    	devengado5.setExtraFestivoDiurna(extrasFestivoNocturnos5);
    	devengado5.horaExtraFestivoNocturno(empleado5, devengado5);
    	
    }

}
