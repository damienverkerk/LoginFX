/**
 * Damien Verkerk
 * OOP1
 * 16-9-2019
 */
package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    @FXML
    private Label label;

    @FXML
    private TableView myTable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn id = new TableColumn("ID");
        TableColumn name = new TableColumn("NAME");
        TableColumn age = new TableColumn("AGE");
        TableColumn mail = new TableColumn("MAIL");

        TableColumn primary = new TableColumn("PRIMARY");
        TableColumn secondary = new TableColumn("SECONDARY");

        mail.getColumns().addAll(primary, secondary);


        myTable.getColumns().addAll(id, name, age, mail);

        final ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("1", "Jacob", "24", "", "jacob.smith@example.com", "jacob.smith@example.com"),
                new Person("2","Isabella", "25", "","isabella.johnson@example.com", "jacob.smith@example.com"),
                new Person("3","Ethan", "27","" ,"ethan.williams@example.com", "jacob.smith@example.com"),
                new Person("4","Emma", "28","" ,"emma.jones@example.com", "jacob.smith@example.com"),
                new Person("5","Michael", "29", "" ,"michael.brown@example.com", "jacob.smith@example.com")
                );

        id.setCellValueFactory(new PropertyValueFactory<Person,String>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        age.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
        primary.setCellValueFactory(new PropertyValueFactory<Person,String>("primary"));
        secondary.setCellValueFactory(new PropertyValueFactory<Person,String>("secondary"));

        myTable.setItems(data);

    }
}
