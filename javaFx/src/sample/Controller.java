package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.util.ArrayList;


public class Controller {

    public Label LabelNumber;
    public ArrayList<String> numbers = new ArrayList<>();
    public ArrayList<String> operator = new ArrayList<>();
    int result;
    int FirstNumber;
    int SecondNumber;
    String operators;
    public double total = 0;
    public boolean ButtonOperator = false;



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
            ButtonOperator = false;
        }
    }



    public void Add(ActionEvent actionEvent) {
        FirstNumber = Integer.parseInt(LabelNumber.getText());
        LabelNumber.setText("");
        operators = "plus";




    }

    public void Subtract(ActionEvent actionEvent) {
        FirstNumber = Integer.parseInt(LabelNumber.getText());
        LabelNumber.setText("");
        operators = "minus";


    }

    public void Multiply(ActionEvent actionEvent) {
        operators = "multiply";
        FirstNumber = Integer.parseInt(LabelNumber.getText());
        LabelNumber.setText("");

    }




    public void Equal(ActionEvent actionEvent) {

        String total;
        SecondNumber = Integer.parseInt(LabelNumber.getText());
        if (operators == "plus"){
            result = FirstNumber + SecondNumber;
            total = Integer.toString(result);
            LabelNumber.setText(total);
        }else if (operators == "minus"){
            result = FirstNumber - SecondNumber;
            total = Integer.toString(result);
            LabelNumber.setText(total);

        }else if(operators == "multiply"){
            result = FirstNumber * SecondNumber;
            total = Integer.toString(result);
            LabelNumber.setText(total);
        }
        }


    public void Clear(ActionEvent actionEvent) {
        LabelNumber.setText("");
        numbers.clear();
        operator.clear();
        ButtonOperator = false;
    }
}
