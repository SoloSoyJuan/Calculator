package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Button OperationBT;

    @FXML
    private Button historyCleanerBT;

    @FXML
    private TextArea historyTA;

    @FXML
    private TextField operationBoxTF;

    public MainWindowController(){

    }

    @FXML
    void onClick(ActionEvent event) {
        Button b = (Button) event.getSource();
        String info = "";
        if (b.getText().equals("Calculate")){
            info = historyTA.getText()+operationBoxTF.getText()+"\n";
            historyTA.setText(info);
            operationBoxTF.clear();
        }else {
            historyTA.clear();
        }
    }

}

