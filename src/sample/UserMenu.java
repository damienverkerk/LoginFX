/**
 * Damien Verkerk
 * OOP1
 * 16-9-2019
 */
package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UserMenu implements Menu {
    @Override
    public void show() throws IOException {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("User.fxml"));
            primaryStage.setTitle("User menu");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }
    }

