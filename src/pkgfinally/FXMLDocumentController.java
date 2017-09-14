/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinally;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.util.Duration;

/**
 *
 * @author VinothPMoorthy
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton button;
    @FXML
    private RadioButton button1;
    @FXML
    private RadioButton button2;
    @FXML
    private RadioButton button3;
    @FXML
    private RadioButton button4;
    @FXML
    private RadioButton button5;
    @FXML
    private RadioButton button6;
    @FXML
    private RadioButton button7;
    @FXML
    private RadioButton button8;
    @FXML
    private RadioButton button9;
    @FXML
    private RadioButton button10;
    @FXML
    private RadioButton button11;
    @FXML
    private RadioButton button12;
    @FXML
    private RadioButton button13;
    @FXML
    private RadioButton button14;
    @FXML
    private RadioButton button15;
    @FXML
    private RadioButton button16;
    @FXML
    private RadioButton button17;
    @FXML
    private RadioButton button18;
    @FXML
    private RadioButton button19;
    @FXML
    private RadioButton button20;
    @FXML
    private RadioButton button21;
    @FXML
    private RadioButton button22;
    @FXML
    private RadioButton button23;
    @FXML
    private RadioButton button24;
    @FXML
    private RadioButton button25;
    @FXML
    private RadioButton button26;
    @FXML
    private RadioButton button27;
    @FXML
    private RadioButton button28;
    @FXML
    private RadioButton button29;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Polyline p = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            p.getPoints().add(new Double(Implementation.allLocations.get(0).get(i)[0]));
            p.getPoints().add(new Double(Implementation.allLocations.get(0).get(i)[1]));
        }
        PathTransition t = new PathTransition();

        t.setDuration(Duration.seconds(15));
        t.setNode(button);
        t.setPath(p);
        t.play();

        Polyline q = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            q.getPoints().add(new Double(Implementation.allLocations.get(1).get(i)[0]));
            q.getPoints().add(new Double(Implementation.allLocations.get(1).get(i)[1]));
        }

        PathTransition u = new PathTransition();

        u.setDuration(Duration.seconds(15));
        u.setNode(button1);
        u.setPath(q);
        u.play();

        Polyline r = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r.getPoints().add(new Double(Implementation.allLocations.get(2).get(i)[0]));
            r.getPoints().add(new Double(Implementation.allLocations.get(2).get(i)[1]));
        }

        PathTransition l = new PathTransition();

        l.setDuration(Duration.seconds(15));
        l.setNode(button2);
        l.setPath(r);
        l.play();
        Polyline r1 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r1.getPoints().add(new Double(Implementation.allLocations.get(3).get(i)[0]));
            r1.getPoints().add(new Double(Implementation.allLocations.get(3).get(i)[1]));
        }

        PathTransition l1 = new PathTransition();

        l1.setDuration(Duration.seconds(15));
        l1.setNode(button3);
        l1.setPath(r1);
        l1.play();
        Polyline r2 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r2.getPoints().add(new Double(Implementation.allLocations.get(4).get(i)[0]));
            r2.getPoints().add(new Double(Implementation.allLocations.get(4).get(i)[1]));
        }

        PathTransition l2 = new PathTransition();

        l2.setDuration(Duration.seconds(10));
        l2.setNode(button4);
        l2.setPath(r2);
        l2.play();
        Polyline r3 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r3.getPoints().add(new Double(Implementation.allLocations.get(5).get(i)[0]));
            r3.getPoints().add(new Double(Implementation.allLocations.get(5).get(i)[1]));
        }

        PathTransition l3 = new PathTransition();

        l3.setDuration(Duration.seconds(15));
        l3.setNode(button5);
        l3.setPath(r3);
        l3.play();
        Polyline r4 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r4.getPoints().add(new Double(Implementation.allLocations.get(6).get(i)[0]));
            r4.getPoints().add(new Double(Implementation.allLocations.get(6).get(i)[1]));
        }

        PathTransition l4 = new PathTransition();

        l4.setDuration(Duration.seconds(15));
        l4.setNode(button6);
        l4.setPath(r4);
        l4.play();
        Polyline r5 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r5.getPoints().add(new Double(Implementation.allLocations.get(7).get(i)[0]));
            r5.getPoints().add(new Double(Implementation.allLocations.get(7).get(i)[1]));
        }

        PathTransition l5 = new PathTransition();

        l5.setDuration(Duration.seconds(15));
        l5.setNode(button7);
        l5.setPath(r5);
        l5.play();
        Polyline r6 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r6.getPoints().add(new Double(Implementation.allLocations.get(8).get(i)[0]));
            r6.getPoints().add(new Double(Implementation.allLocations.get(8).get(i)[1]));
        }

        PathTransition l6 = new PathTransition();

        l6.setDuration(Duration.seconds(15));
        l6.setNode(button8);
        l6.setPath(r6);
        l6.play();
        Polyline r7 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r7.getPoints().add(new Double(Implementation.allLocations.get(9).get(i)[0]));
            r7.getPoints().add(new Double(Implementation.allLocations.get(9).get(i)[1]));
        }

        PathTransition l7 = new PathTransition();

        l7.setDuration(Duration.seconds(15));
        l7.setNode(button9);
        l7.setPath(r7);
        l7.play();
        Polyline r8 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r8.getPoints().add(new Double(Implementation.allLocations.get(10).get(i)[0]));
            r8.getPoints().add(new Double(Implementation.allLocations.get(10).get(i)[1]));
        }

        PathTransition l8 = new PathTransition();

        l8.setDuration(Duration.seconds(15));
        l8.setNode(button10);
        l8.setPath(r8);
        l8.play();
        Polyline r9 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r9.getPoints().add(new Double(Implementation.allLocations.get(11).get(i)[0]));
            r9.getPoints().add(new Double(Implementation.allLocations.get(11).get(i)[1]));
        }

        PathTransition l9 = new PathTransition();

        l9.setDuration(Duration.seconds(15));
        l9.setNode(button11);
        l9.setPath(r9);
        l9.play();
        Polyline r10 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r10.getPoints().add(new Double(Implementation.allLocations.get(12).get(i)[0]));
            r10.getPoints().add(new Double(Implementation.allLocations.get(12).get(i)[1]));
        }

        PathTransition l10 = new PathTransition();

        l10.setDuration(Duration.seconds(15));
        l10.setNode(button12);
        l10.setPath(r10);
        l10.play();
        Polyline r11 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r11.getPoints().add(new Double(Implementation.allLocations.get(13).get(i)[0]));
            r11.getPoints().add(new Double(Implementation.allLocations.get(13).get(i)[1]));
        }

        PathTransition l11 = new PathTransition();

        l11.setDuration(Duration.seconds(15));
        l11.setNode(button13);
        l11.setPath(r11);
        l11.play();
        Polyline r12 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r12.getPoints().add(new Double(Implementation.allLocations.get(14).get(i)[0]));
            r12.getPoints().add(new Double(Implementation.allLocations.get(14).get(i)[1]));
        }

        PathTransition l12 = new PathTransition();

        l12.setDuration(Duration.seconds(15));
        l12.setNode(button14);
        l12.setPath(r12);
        l12.play();
        Polyline r13 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r13.getPoints().add(new Double(Implementation.allLocations.get(15).get(i)[0]));
            r13.getPoints().add(new Double(Implementation.allLocations.get(15).get(i)[1]));
        }

        PathTransition l13 = new PathTransition();

        l13.setDuration(Duration.seconds(15));
        l13.setNode(button15);
        l13.setPath(r13);
        l13.play();
        Polyline r14 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r14.getPoints().add(new Double(Implementation.allLocations.get(16).get(i)[0]));
            r14.getPoints().add(new Double(Implementation.allLocations.get(16).get(i)[1]));
        }

        PathTransition l14 = new PathTransition();

        l14.setDuration(Duration.seconds(15));
        l14.setNode(button16);
        l14.setPath(r14);
        l14.play();
        Polyline r15 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r15.getPoints().add(new Double(Implementation.allLocations.get(17).get(i)[0]));
            r15.getPoints().add(new Double(Implementation.allLocations.get(17).get(i)[1]));
        }

        PathTransition l15 = new PathTransition();

        l15.setDuration(Duration.seconds(15));
        l15.setNode(button17);
        l15.setPath(r15);
        l15.play();
        Polyline r16 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r16.getPoints().add(new Double(Implementation.allLocations.get(18).get(i)[0]));
            r16.getPoints().add(new Double(Implementation.allLocations.get(18).get(i)[1]));
        }

        PathTransition l16 = new PathTransition();

        l16.setDuration(Duration.seconds(15));
        l16.setNode(button18);
        l16.setPath(r16);
        l16.play();
        Polyline r17 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r17.getPoints().add(new Double(Implementation.allLocations.get(19).get(i)[0]));
            r17.getPoints().add(new Double(Implementation.allLocations.get(19).get(i)[1]));
        }

        PathTransition l17 = new PathTransition();

        l17.setDuration(Duration.seconds(15));
        l17.setNode(button19);
        l17.setPath(r17);
        l17.play();
        Polyline r18 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r18.getPoints().add(new Double(Implementation.allLocations.get(20).get(i)[0]));
            r18.getPoints().add(new Double(Implementation.allLocations.get(20).get(i)[1]));
        }

        PathTransition l18 = new PathTransition();

        l18.setDuration(Duration.seconds(15));
        l18.setNode(button20);
        l18.setPath(r18);
        l18.play();
        Polyline r19 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r19.getPoints().add(new Double(Implementation.allLocations.get(21).get(i)[0]));
            r19.getPoints().add(new Double(Implementation.allLocations.get(21).get(i)[1]));
        }

        PathTransition l19 = new PathTransition();

        l19.setDuration(Duration.seconds(15));
        l19.setNode(button21);
        l19.setPath(r19);
        l19.play();
        Polyline r20 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r20.getPoints().add(new Double(Implementation.allLocations.get(22).get(i)[0]));
            r20.getPoints().add(new Double(Implementation.allLocations.get(22).get(i)[1]));
        }

        PathTransition l20 = new PathTransition();

        l20.setDuration(Duration.seconds(15));
        l20.setNode(button22);
        l20.setPath(r20);
        l20.play();
        Polyline r21 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r21.getPoints().add(new Double(Implementation.allLocations.get(23).get(i)[0]));
            r21.getPoints().add(new Double(Implementation.allLocations.get(23).get(i)[1]));
        }

        PathTransition l21 = new PathTransition();

        l21.setDuration(Duration.seconds(15));
        l21.setNode(button23);
        l21.setPath(r21);
        l21.play();
        Polyline r22 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r22.getPoints().add(new Double(Implementation.allLocations.get(24).get(i)[0]));
            r22.getPoints().add(new Double(Implementation.allLocations.get(24).get(i)[1]));
        }

        PathTransition l22 = new PathTransition();

        l22.setDuration(Duration.seconds(15));
        l22.setNode(button24);
        l22.setPath(r22);
        l22.play();
        Polyline r23 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r23.getPoints().add(new Double(Implementation.allLocations.get(25).get(i)[0]));
            r23.getPoints().add(new Double(Implementation.allLocations.get(25).get(i)[1]));
        }

        PathTransition l23 = new PathTransition();

        l23.setDuration(Duration.seconds(15));
        l23.setNode(button25);
        l23.setPath(r23);
        l23.play();
        Polyline r24 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r24.getPoints().add(new Double(Implementation.allLocations.get(26).get(i)[0]));
            r24.getPoints().add(new Double(Implementation.allLocations.get(26).get(i)[1]));
        }

        PathTransition l24 = new PathTransition();

        l24.setDuration(Duration.seconds(15));
        l24.setNode(button26);
        l24.setPath(r24);
        l24.play();
        Polyline r25 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r25.getPoints().add(new Double(Implementation.allLocations.get(27).get(i)[0]));
            r25.getPoints().add(new Double(Implementation.allLocations.get(27).get(i)[1]));
        }

        PathTransition l25 = new PathTransition();

        l25.setDuration(Duration.seconds(15));
        l25.setNode(button27);
        l25.setPath(r25);
        l25.play();
        
        Polyline r26 = new Polyline();
        r26.getPoints().add(new Double(100.0));
        r26.getPoints().add(new Double(100.0));
        r26.getPoints().add(new Double(380));
        r26.getPoints().add(new Double(280));

        PathTransition l26 = new PathTransition();

        l26.setDuration(Duration.seconds(1));
        l26.setNode(button28);
        l26.setPath(r26);
        l26.play();
        
        Polyline r27 = new Polyline();
        for (int i = 0; i < Implementation.allLocations.get(0).size(); i++) {
            r27.getPoints().add(new Double(Implementation.allLocations.get(29).get(i)[0]));
            r27.getPoints().add(new Double(Implementation.allLocations.get(29).get(i)[1]));
        }

        PathTransition l27 = new PathTransition();

        l27.setDuration(Duration.seconds(15));
        l27.setNode(button29);
        l27.setPath(r27);
        l27.play();
    }

}
