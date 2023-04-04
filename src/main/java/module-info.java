module com.example.comp1006assignment02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1006assignment02 to javafx.fxml;
    exports com.example.comp1006assignment02;
}