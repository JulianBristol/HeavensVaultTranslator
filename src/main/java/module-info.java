module com.example.heavensvaulttranslator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.heavensvaulttranslator to javafx.fxml;
    exports com.example.heavensvaulttranslator;
}