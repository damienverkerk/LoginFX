/**
 * Damien Verkerk
 * OOP1
 * 16-9-2019
 */
package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class LoginController {
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassWord;



    public void Login(ActionEvent event) throws Exception {
        final ObservableList<User> data = FXCollections.observableArrayList(
                new User("david", "david"),
                new User("robert", "robert"),
                new User("user",""),
                new Admin("admin","pass"));



        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.size());
            User user = data.get(i);
            if (user.authenticate(txtUserName.getText(), txtPassWord.getText()))
        {
            user.setUsername(txtUserName.getText());
            lblStatus.setText("Login Success");
            ((Node)event.getSource()).getScene().getWindow().hide();
            user.getMenu().show();
            break;

        }else{
            lblStatus.setText("Login Failed");
        }}

    }
}
