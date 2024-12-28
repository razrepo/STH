module org.example.sth {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sth to javafx.fxml;
    exports org.example.sth;
}