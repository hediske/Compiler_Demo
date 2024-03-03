module com.compiler.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires com.gluonhq.richtextarea;

    opens com.compiler.gui to javafx.fxml;
    opens com.compiler.gui.controller to javafx.fxml;
    exports com.compiler.gui;
}