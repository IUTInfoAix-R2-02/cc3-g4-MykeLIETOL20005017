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
    private void action() {
        //récupérer la note saisie
        double note = Double.parseDouble(sourceOfEvent.getText());
        // identifier la compétence associée au champs de saisie
        String comptAssocie = sourceOfEvent.getId();
        int axe = 0;
        switch (comptAssocie){
            case "competence1TextField":
                axe = 1; break;
            case "competence2TextField":
                axe = 2; break;
            case "competence3TextField":
                axe = 3; break;
            case "competence4TextField":
                axe = 4; break;
            case "competence5TextField":
                axe = 5; break;
            case "competence6TextField":
                axe = 6; break;
        }
        // dessiner le point (un cercle JavaFX) sur l'axe correspondant dans le diagramme radar.
        Circle point = new Circle(10, 10, 10, Color.BLACK);
        point.setFill(Color.BLACK);
        toile.getChildren().add(point);
    }

}
