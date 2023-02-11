module com.example.javaoops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaoops to javafx.fxml;
    exports com.example.javaoops;
    exports mainjava;
    opens mainjava to javafx.fxml;
    exports polymorphism;
    opens polymorphism to javafx.fxml;
    exports inheritance;
    opens inheritance to javafx.fxml;
    exports abstraction;
    opens abstraction to javafx.fxml;
    exports constructor;
    opens constructor to javafx.fxml;
    exports encapsulation;
    opens encapsulation to javafx.fxml;
}