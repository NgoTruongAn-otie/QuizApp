module com.nta.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nta.quizapp to javafx.fxml;
    exports com.nta.quizapp;
}
