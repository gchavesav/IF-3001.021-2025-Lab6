package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import domain.Vector; //nuestra clase vector
import javafx.scene.layout.Pane;


public class VectorController
{
    @javafx.fxml.FXML
    private TextField nTExtField;
    @javafx.fxml.FXML
    private TextArea textArea;
    Alert alert;
    Vector vector;
    @javafx.fxml.FXML
    private Pane buttonPane;

    @javafx.fxml.FXML
    public void initialize() {
        this.alert = util.FXUtility.alert("Vector Algorithm", "There was an error");
        alert.setAlertType(Alert.AlertType.ERROR);
    }

    @javafx.fxml.FXML
    public void createOnAction(ActionEvent actionEvent) {
        try{
            int n = Integer.valueOf(this.nTExtField.getText());
            this.vector = new Vector(n);
            this.buttonPane.setDisable(false);
            this.textArea.setText("The vector has been created for "+n+ " elements");

        }catch (Exception ex){
            alert.setContentText("Please complete the information and try again...");
            alert.show();
        }

    }

    @javafx.fxml.FXML
    public void removeValueOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
        this.vector.clear();
        this.nTExtField.clear();
        this.textArea.clear();
        this.buttonPane.setDisable(true);
    }

    @javafx.fxml.FXML
    public void addIndexOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fillShowOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void removeIndexOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void containsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addValueOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sizeOnAction(ActionEvent actionEvent) {
    }
}