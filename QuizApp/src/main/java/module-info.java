module com.nta.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.nta.quizapp to javafx.fxml;
    exports com.nta.quizapp;
}