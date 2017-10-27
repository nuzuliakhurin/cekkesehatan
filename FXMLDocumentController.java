/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cek_kesehatan;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class FXMLDocumentController {

    @FXML
    private TextField Nama;

    @FXML
    private TextField Beratbadan;

    @FXML
    private TextField TinggiBadan;

    @FXML
    private RadioButton pr;

    @FXML
    private ToggleGroup pilihan;

    @FXML
    private RadioButton lk;

    @FXML
    private Button Proses;

    @FXML
    private Button Hapus;

    @FXML
    private TextArea Hasil;

    @FXML
    private TextArea Saran;

    @FXML
    private TextField beratideal;

    @FXML
    void Hapus(ActionEvent event) {
        Nama.setText("");
           TinggiBadan.setText("");
           Beratbadan.setText("");
           lk.setSelected(false);
           pr.setSelected(false);
           Hasil.setText("");
           beratideal.setText("");
           Hapus.setText("");
           Saran.setText("");
    }

    @FXML
    void Proses(ActionEvent event) {
        int ideal = 0;
    String nama = Nama.getText();
    int Tinggi = Integer.parseInt(TinggiBadan.getText());
    int Berat = Integer.parseInt(Beratbadan.getText());
     
    if(lk.isSelected()) {
        ideal = parseInt(TinggiBadan.getText()) -105;
        
        beratideal.setText(""+ideal);
    if (ideal== Berat){
            Hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" ideal ");
            Saran.setText("SIP!");
        }
        else if (ideal < Berat){
            Hasil.setText("nama: "+Nama+ " Tinggi: "+Tinggi+" Overweight ");
            Saran.setText("Jangan jajan terus:(");
        }
        else if (ideal > Berat){
            Hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" Underweight ");
            Saran.setText("Jajan yang banyak dong! :)");
        }
    }
       if(pr.isSelected()) {
        ideal = parseInt(TinggiBadan.getText()) -110;
        
        beratideal.setText(""+ideal);
    if (ideal==Berat){
            Hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" ideal ");
            Saran.setText("SIP!");
        }
        else if (ideal < Berat){
            Hasil.setText("nama: "+Nama+ " Tinggi: "+Tinggi+" Overweight ");
            Saran.setText("Jangan jajan terus :(");
        }
        else if (ideal > Berat){
            Hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" Underweight ");
            Saran.setText("Makan yang banyak dong! :)");
            }
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}

/**
 *
 * @author Nuzulia Khurin
 */

    
    
    

