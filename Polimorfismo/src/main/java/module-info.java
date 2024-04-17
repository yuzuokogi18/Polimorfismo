module com.adr.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.adr.polimorfismo.models to javafx.base;
    opens com.adr.polimorfismo to javafx.fxml;
    exports com.adr.polimorfismo;
    exports com.adr.polimorfismo.controllers;
    opens com.adr.polimorfismo.controllers to javafx.fxml;
}