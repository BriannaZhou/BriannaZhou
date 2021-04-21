package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

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
        labelName.setText("Name: " + friend.getName());
        labelSchool.setText("School " + friend.getSchool());
        String garde = Integer.toString(friend.getGrade());
        labelGrade.setText("Grade: " + garde);

    }


    public void deleteFriend(ActionEvent actionEvent) {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null) {
            return;
        }
        listFriends.getItems().remove(friend);
        labelName.setText("Name: ");
        labelSchool.setText("School: ");
        labelGrade.setText("Grade: ");
    }

    public void saveFriends(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = listFriends.getItems();
        for ( Friend f : myList) {
            f.writeToFile();
        }
        listFriends.getItems().clear();

    }

    public void LoadFriends(ActionEvent actionEvent) throws IOException {
        listFriends.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends("Friends.txt");
        for(Friend f: friends){
            listFriends.getItems().add(f);
        }
    }
}
