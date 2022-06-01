module com.example.lab_10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.lab_10 to javafx.fxml;
    exports com;
    opens com to javafx.fxml;
    exports com.classes;
    opens com.classes to javafx.fxml;
}