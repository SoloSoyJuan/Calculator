package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Button AdditionBT;

    @FXML
    private Button DeleteBT;

    @FXML
    private Button DivisionBT;

    @FXML
    private Button FiveBT;

    @FXML
    private Button FourBT;

    @FXML
    private Button HistoryCleanerBT;

    @FXML
    private Button MultiplicationBT;

    @FXML
    private Button NineBT;

    @FXML
    private Button OneBT;

    @FXML
    private Button OperationBT;

    @FXML
    private Button SevenBT;

    @FXML
    private Button SixBT;

    @FXML
    private Button SubtractionBT;

    @FXML
    private Button TreeBT;

    @FXML
    private Button TwoBT;

    @FXML
    private Button ZeroBT;

    @FXML
    private Button eightBT;

    @FXML
    private TextArea historyTA;

    @FXML
    private TextField operationBoxTF;

    private String operation;

    public MainWindowController(){
        this.operation = "";
    }

    @FXML
    void onClick(ActionEvent event) {
        Button b = (Button) event.getSource();
        String info = b.getText();
        if(info.equals("1") || info.equals("2") || info.equals("3") || info.equals("4") || info.equals("5") ||info.equals("6") || info.equals("7") || info.equals("8") || info.equals("9") || info.equals("0")){
            info = operationBoxTF.getText()+info;
            operationBoxTF.setText(info);
        }else if(info.equals("+") || info.equals("-") || info.equals("*") || info.equals("/")){
            info = operationBoxTF.getText()+info;
            operationBoxTF.setText(info);
            this.operation = info+"";
        }else if (info.equals("Calculate")){
            calculated();
        }else {
            historyTA.clear();
        }
    }

    public void calculated(){
        String a = operationBoxTF.getText();
        String [] b;
        switch (operation){
            case "+":
                //b = a.split("+");
                break;
            case "-":
                b = a.split("-");
                break;
            case "*":
                //b = a.split("*");
                break;
            case "/":
                b = a.split("/");
                break;
        }
        String info = historyTA.getText()+operationBoxTF.getText()+"\n";
        historyTA.setText(info);
        operationBoxTF.clear();
    }

}

