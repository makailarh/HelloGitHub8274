module edu.utsa.cs3443.githubtry2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.githubtry2 to javafx.fxml;
    exports edu.utsa.cs3443.githubtry2;
}