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
    	empleado1.setNombre("empleado 1");
    	int sueldo=Integer.parseInt(sueldoEmp1.getText());
    	empleado1.setSueldoBasico(sueldo);
    	
    	devengado1.auxTrans(empleado1, devengado1);
    	
    	double extrasDiurna = Double.parseDouble(exDiurEmp1.getText());
    	devengado1.setExtraDiurna(extrasDiurna);
    	devengado1.horaExtraDiurna(empleado1, devengado1);
    	
    	double extrasNocturna = Double.parseDouble(exNoctuEmp1.getText());
    	devengado1.setExtraNocturna(extrasNocturna);
    	devengado1.horaExtraNocturna(empleado1, devengado1);
    	
    	double extrasFestivoDiurnos = Double.parseDouble(exDiurFesEmp1.getText());
    	devengado1.setExtraFestivoDiurna(extrasFestivoDiurnos);
    	devengado1.horaExtraFestivoDiurno(empleado1, devengado1);
    	
    	double extrasFestivoNocturnos = Double.parseDouble(exNoctFesEmp1.getText());
    	devengado1.setExtraFestivoDiurna(extrasFestivoNocturnos);
    	devengado1.horaExtraFestivoNocturno(empleado1, devengado1);
    }

}
