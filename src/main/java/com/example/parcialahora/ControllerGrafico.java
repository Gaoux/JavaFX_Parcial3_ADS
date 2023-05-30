package com.example.parcialahora;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGrafico {
    @FXML
    private Button salir;
    @FXML
    private Button cargar;
    @FXML
    private TableView<Reporte> tableView = new TableView<>();
    @FXML
    private TableColumn colNombre = new TableColumn();
    @FXML
    private TableColumn colID = new TableColumn();
    @FXML
    private TableColumn colSalario = new TableColumn();

    ObservableList<Reporte> personas;

    @FXML
    public void cargarDatos(ActionEvent event) throws IOException {
        this.personas = FXCollections.observableArrayList();
        this.colNombre.setCellValueFactory(new  PropertyValueFactory("Nombre"));
        this.colID.setCellValueFactory(new PropertyValueFactory("ID"));
        this.colSalario.setCellValueFactory(new PropertyValueFactory("Salario"));
        for(Persona p: ControllerMenu.nomina.getPersonas()) {
            String nombre = p.getNombre();
            int id = p.getNumeroIdentificacion();
            double salario = Nomina.calcularSalarioPersona(p);
            Reporte persona = new Reporte(nombre,id,salario);
            this.personas.add(persona);
        }
        this.tableView.setItems(personas);
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
