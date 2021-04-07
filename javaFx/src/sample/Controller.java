package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;



public class Controller {
    public Label LabelNumber;



    public void SetZone(ActionEvent actionEvent) {
    }

    public void setOne(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void setTwo(ActionEvent actionEvent) {
        addNumber("2");
    }

    public void setThree(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void setFour(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void setFive(ActionEvent actionEvent) {
    }

    public void setSix(ActionEvent actionEvent) {
    }

    public void setSeven(ActionEvent actionEvent) {
    }

    public void setEight(ActionEvent actionEvent) {
    }

    public void setNine(ActionEvent actionEvent) {
    }

    private void addNumber(String number){
        if (LabelNumber.getText().equals("0") ) {
            String display = number;
            LabelNumber.setText(display);
        }
        else{
            String display = LabelNumber.getText() + number;
            LabelNumber.setText(display);
        }
    }

    public void Add(ActionEvent actionEvent) {
    }

    public void Subtract(ActionEvent actionEvent) {
    }

    public void Multiply(ActionEvent actionEvent) {
    }

    public void Equal(ActionEvent actionEvent) {
    }

    public void Clears(ActionEvent actionEvent) {
    }



}
