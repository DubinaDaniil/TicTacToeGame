module com.tictactoegame.tictactoegame {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.ticTacToeGame;
    opens com.ticTacToeGame to javafx.fxml;
}