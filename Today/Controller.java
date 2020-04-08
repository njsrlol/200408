package FXML.Today;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private TextField idt;
	@FXML private TextField pwt;
	@FXML private Button btn;
	private myDB mydb;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn.setOnAction(e->{
			LoginProc();
		});
		
		btn.setOnKeyPressed(e->{
			enter(e);
		});
		
		pwt.setOnKeyPressed(e->{
			enter(e);
		});
		
	}
	
	
	public void LoginProc() {
		String id = idt.getText();
		String pw = pwt.getText();
		mydb = new myDB();
		if(pw.equals(mydb.getPw(id))) {
			showAlert("로그인이 성공하셨습니다.");
		}
		else showAlert("로그인이 실패하셨습니다.");
	}
	
	public void showAlert(String con) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("메시지");
		alert.setHeaderText("메시지");
		alert.setContentText(con);
		alert.show();
	}
	
	public void enter(KeyEvent e) {
		if(e.getCode() == KeyCode.ENTER) {
			LoginProc();
			pwt.requestFocus();
			pwt.clear();
		}
		
	}
	
	

}
