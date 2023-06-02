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
    private Button viderButton;
    @FXML
    private Label messageErreurLabel;

    List<Circle> listeCompetence = new ArrayList<Circle>();

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
        if (note <= 20 && note >= 0){
            Circle point = new Circle(getXRadarChart(note, 1), getYRadarChart(note, 1), 10, Color.BLACK);
            toile.getChildren().add(point);
            messageErreurLabel.setText(" ");
            listeCompetence.add(point);
        }
        else{messageErreurLabel.setText("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");}
    }
    @FXML
    private void button2Action(){
        double note = Double.parseDouble(competence2TextField.getText());
        if (note <= 20 && note >= 0){
            Circle point = new Circle(getXRadarChart(note, 2), getYRadarChart(note, 2), 10, Color.BLACK);
            toile.getChildren().add(point);
            messageErreurLabel.setText(" ");
            listeCompetence.add(point);
        }
        else{messageErreurLabel.setText("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");}
    }
    @FXML
    private void button3Action(){
        double note = Double.parseDouble(competence3TextField.getText());
        if (note <= 20 && note >= 0){
            Circle point = new Circle(getXRadarChart(note, 3), getYRadarChart(note, 3), 10, Color.BLACK);
            toile.getChildren().add(point);
            messageErreurLabel.setText(" ");
            listeCompetence.add(point);
        }
        else{messageErreurLabel.setText("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");}
    }
    @FXML
    private void button4Action(){
        double note = Double.parseDouble(competence4TextField.getText());
        if (note <= 20 && note >= 0){
            Circle point = new Circle(getXRadarChart(note, 4), getYRadarChart(note, 4), 10, Color.BLACK);
            toile.getChildren().add(point);
            messageErreurLabel.setText(" ");
            listeCompetence.add(point);
        }
        else{messageErreurLabel.setText("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");}
    }
    @FXML
    private void button5Action(){
        double note = Double.parseDouble(competence5TextField.getText());
        if (note <= 20 && note >= 0){
            Circle point = new Circle(getXRadarChart(note, 5), getYRadarChart(note, 5), 10, Color.BLACK);
            toile.getChildren().add(point);
            messageErreurLabel.setText(" ");
            listeCompetence.add(point);
        }
        else{messageErreurLabel.setText("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");}
    }
    @FXML
    private void button6Action(){
        double note = Double.parseDouble(competence6TextField.getText());
        if (note <= 20 && note >= 0){
            Circle point = new Circle(getXRadarChart(note, 6), getYRadarChart(note, 6), 10, Color.BLACK);
            toile.getChildren().add(point);
            messageErreurLabel.setText(" ");
            listeCompetence.add(point);
        }
        else{messageErreurLabel.setText("Erreur de saisie : \n Les valeurs doivent être entre 0 et 20");}
    }

    @FXML
    private void buttonViderAction(){
        messageErreurLabel.setText(" ");
        toile.getChildren().clear();
        competence1TextField.clear();
        competence2TextField.clear();
        competence3TextField.clear();
        competence4TextField.clear();
        competence5TextField.clear();
        competence6TextField.clear();
    }

    @FXML
    private void buttonTracerAction(){
        for (int i = 0; i < listeCompetence.size()-1; i++) {
            Line ligne = new Line(listeCompetence.get(i).getCenterX(), listeCompetence.get(i).getCenterY(), listeCompetence.get(i+1).getCenterX(), listeCompetence.get(i+1).getCenterY());
            toile.getChildren().add(ligne);
        }

    }
}
