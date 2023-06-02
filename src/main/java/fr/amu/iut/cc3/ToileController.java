package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;


    @FXML
    private Pane toile;
    @FXML
    private TextField competence1TextField;
    @FXML
    private TextField competence2TextField;
    @FXML
    private TextField competence3TextField;
    @FXML
    private TextField competence4TextField;
    @FXML
    private TextField competence5TextField;
    @FXML
    private TextField competence6TextField;

    @FXML
    private VBox competenccesVBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    @FXML
    private void button1Action(){
        double note = Double.parseDouble(competence1TextField.getText());
        Circle point = new Circle(10, 10, 10, Color.BLACK);
        point.setFill(Color.BLACK);
        point.relocate(getXRadarChart(note, 1),getYRadarChart(note, 1));
        Label messageErreur = new Label("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");
        messageErreur.setTextFill(Color.RED);
        if (note <= 20 && note >= 0){
            toile.getChildren().add(point);
        }
        else{
            competenccesVBox.getChildren().add(1, messageErreur);
        }
    }
    @FXML
    private void button2Action(){
        double note = Double.parseDouble(competence2TextField.getText());
        Circle point = new Circle(10, 10, 10, Color.BLACK);
        point.setFill(Color.BLACK);
        point.relocate(getXRadarChart(note, 2),getYRadarChart(note, 2));
        Label messageErreur = new Label("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");
        messageErreur.setTextFill(Color.RED);
        if (note <= 20 && note >= 0){
            toile.getChildren().add(point);
        }
        else{
            competenccesVBox.getChildren().add(1, messageErreur);
        }
    }
    @FXML
    private void button3Action(){
        double note = Double.parseDouble(competence3TextField.getText());
        Circle point = new Circle(10, 10, 10, Color.BLACK);
        point.setFill(Color.BLACK);
        point.relocate(getXRadarChart(note, 3),getYRadarChart(note, 3));
        Label messageErreur = new Label("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");
        messageErreur.setTextFill(Color.RED);
        if (note <= 20 && note >= 0){
            toile.getChildren().add(point);
        }
        else{
            competenccesVBox.getChildren().add(1, messageErreur);
        }
    }
    @FXML
    private void button4Action(){
        double note = Double.parseDouble(competence4TextField.getText());
        Circle point = new Circle(10, 10, 10, Color.BLACK);
        point.setFill(Color.BLACK);
        point.relocate(getXRadarChart(note, 4),getYRadarChart(note, 4));
        Label messageErreur = new Label("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");
        messageErreur.setTextFill(Color.RED);
        if (note <= 20 && note >= 0){
            toile.getChildren().add(point);
        }
        else{
            competenccesVBox.getChildren().add(1, messageErreur);
        }
    }
    @FXML
    private void button5Action(){
        double note = Double.parseDouble(competence5TextField.getText());
        Circle point = new Circle(10, 10, 10, Color.BLACK);
        point.setFill(Color.BLACK);
        point.relocate(getXRadarChart(note, 5),getYRadarChart(note, 5));
        Label messageErreur = new Label("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");
        messageErreur.setTextFill(Color.RED);
        if (note <= 20 && note >= 0){
            toile.getChildren().add(point);
        }
        else{
            competenccesVBox.getChildren().add(1, messageErreur);
        }
    }
    @FXML
    private void button6Action(){
        double note = Double.parseDouble(competence6TextField.getText());
        Circle point = new Circle(10, 10, 10, Color.BLACK);
        point.setFill(Color.BLACK);
        point.relocate(getXRadarChart(note, 6),getYRadarChart(note, 6));
        Label messageErreur = new Label("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");
        messageErreur.setTextFill(Color.RED);
        if (note <= 20 && note >= 0){
            toile.getChildren().add(point);
        }
        else{
            competenccesVBox.getChildren().add(1, messageErreur);
        }
    }

}
