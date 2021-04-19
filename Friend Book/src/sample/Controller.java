package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label labelName;
    public Label labelSchool;
    public Label labelGrade;
    public TextField textName;
    public TextField textSchool;
    public TextField textGrade;
    public Button buttonDelete;
    public ListView <Friend> listFriends = new ListView<>();


    public void createFriend(ActionEvent actionEvent) {
        String name = textName.getText();
        String school = textSchool.getText();
        int grade = Integer.parseInt(textGrade.getText());
        Friend friend = new Friend(name, school, grade);
        listFriends.getItems().add(friend);
        textName.clear();
        textGrade.clear();
        textSchool.clear();
    }

    public void displayFriends() {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null) {
            return;
        }
        labelName.setText(friend.getName());
        labelSchool.setText( friend.getSchool());
        String garde = Integer.toString(friend.getGrade());
        labelGrade.setText( garde);

    }
}
