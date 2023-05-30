package com.example.parcialahora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.parcialahora.FileHandler.escribirArchivoReporte;

public class ControllerOpcion7 {
    @FXML
    private Button descarga;

    private Nomina nomina;
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nomina = ControllerMenu.nomina;
    }
    @FXML
    public void downloadFile() {
        try {
            String filePath = escribirArchivoReporte(ControllerMenu.nomina);
            File file = new File(filePath);
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())
                desktop.open(file);
            else
                System.out.println("El archivo no existe.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al abrir el archivo.");
        }
    }
}
