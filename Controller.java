package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField loginTextField;

    @FXML
    private TextField passowrdTextField;

    @FXML
    private Label resultLabel;

    private String loginCheck = "hello@gmail.com";
    private String passwordCheck = "1234567890";

    public void loginButtonPress(ActionEvent event)
    {
        String login = loginTextField.getText();
        String password = passowrdTextField.getText();

        if(!login.equals(loginCheck))
        {
            resultLabel.setText("Логин не подходит");
            return;
        }

        if(!password.equals(passwordCheck))
        {
            resultLabel.setText("Пароль не подходит");
            return;
        }

        resultLabel.setText("Вход выполнен!");
    }

}
