module com.example.vendingmachine {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.vendingmachine to javafx.fxml;
    exports com.example.vendingmachine.machine;
}