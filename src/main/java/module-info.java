module com.example.tm1_pharmacy {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.example.tm1_pharmacy to javafx.fxml;
    exports com.example.tm1_pharmacy;
}