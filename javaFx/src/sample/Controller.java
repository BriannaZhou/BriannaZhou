package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.util.ArrayList;


public class Controller {

    public Label LabelNumber;
    public ArrayList<String> numbers = new ArrayList<>();
    public ArrayList<String> operators = new ArrayList<>();
    String plus = "plus";
    public double total = 0;



    public void SetZone(ActionEvent actionEvent) { addNumber("0"); }

    public void setOne(ActionEvent actionEvent) { addNumber("1"); }

    public void setTwo(ActionEvent actionEvent) {
        addNumber("2");
    }

    public void setThree(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void setFour(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void setFive(ActionEvent actionEvent) {addNumber("5"); }

    public void setSix(ActionEvent actionEvent) { addNumber("6"); }

    public void setSeven(ActionEvent actionEvent) {addNumber("7"); }

    public void setEight(ActionEvent actionEvent) { addNumber("8");}

    public void setNine(ActionEvent actionEvent) { addNumber("9");}

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
        numbers.add(LabelNumber.getText());
        LabelNumber.setText("");
        operators.add(plus);



    }

    public void Subtract(ActionEvent actionEvent) {
        LabelNumber.setText("");


    }

    public void Multiply(ActionEvent actionEvent) {
        LabelNumber.setText("");

    }

    public void Equal(ActionEvent actionEvent) {
        LabelNumber.setText("");
        for (int i = 0; i < numbers.size(); i++) {

        }
        String number = numbers.get(0);
        LabelNumber.setText(String.valueOf(number));

    }

    public void Clears(ActionEvent actionEvent) {
        LabelNumber.setText("");
    }



}
