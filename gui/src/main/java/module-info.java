module com.compiler.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.compiler.gui to javafx.fxml;
    exports com.compiler.gui;
}