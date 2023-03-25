package com.example.tm1_pharmacy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.example.tm1_pharmacy.Model.PharmacyPrice;


public class PharmacyController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Pharmacy Store!");
    }
}