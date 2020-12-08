package lesson6.client;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class ViewController {

    @FXML
    public ListView<String> usersList;

    @FXML
    private Button sendButton;
    @FXML
    private TextArea chatHistory;
    @FXML
    private TextField textField;


    private Network network;

    public void setNetwork(Network network) {
        this.network = network;
    }

    @FXML
    public void initialize() {
        usersList.setItems(FXCollections.observableArrayList(EchoClient.USER_TEST_DATA));
        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewController.this.sendMessage();
            }
        });
        textField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewController.this.sendMessage();
            }
        });
    }

    private void sendMessage() {
        String message = textField.getText();
/*        if (message.isEmpty()) {
            System.out.println("Вы ничего не написали");
        } else {
            appendMessage(message);
        }
        textField.clear();*/
//        appendMessage(message);
        textField.clear();

        try {
            network.getOut().writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Ошибка при отправке сообщения");
            EchoClient.showErrorMessage("Ошибка подключения", "Ошибка при отправке сообщения", e.getMessage());

        }

    }

    public void appendMessage(String message) {
        chatHistory.appendText(message);
        chatHistory.appendText(System.lineSeparator());
    }

}