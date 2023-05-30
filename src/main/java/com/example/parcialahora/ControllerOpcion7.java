package com.example.parcialahora;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.parcialahora.FileHandler.escribirArchivoReporte;

public class ControllerOpcion7 {
    @FXML
    private Button descarga;
    @FXML
    private Button salir;
    @FXML
    private Button botonTabla;

    private Nomina nomina;
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nomina = ControllerMenu.nomina;
    }
    @FXML
    public void downloadFile() {
        File file = null;
        try {
            String filePath = escribirArchivoReporte(ControllerMenu.nomina);
            file = new File(filePath);
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
    public void showTable() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("reporteGrafico.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Table");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(botonTabla.getScene().getWindow());
            stage.show();
            Stage st = (Stage) botonTabla.getScene().getWindow();
            st.setOpacity(0.0);
        } catch (Exception e) {
        }
    }
    @FXML
    public void llamarMenu(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Menu");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(salir.getScene().getWindow());
            stage.show();
            Stage st = (Stage) salir.getScene().getWindow();
            st.setOpacity(0.0);
        } catch (Exception e) {
        }
    }
}
