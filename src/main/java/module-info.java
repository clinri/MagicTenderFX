module com.example.magicjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.magicjavafx to javafx.fxml;
    exports com.example.magicjavafx;
}