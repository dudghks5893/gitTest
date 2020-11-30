package Test;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class DemoController implements Initializable {
	@FXML
	private Button btn;
	@FXML
	private Label myLabel;
	@FXML
	private AnchorPane anPane;
	@FXML
	private ComboBox <String> combo;
	
    @FXML
    private Label myLabel1;

	//fx의 어레이리스트
	ObservableList<String> list = FXCollections.observableArrayList("망고", "오렌지", "사과");

	// Event Listener on Button[#btn].onAction
	@FXML
	public void ButtonClick(ActionEvent event) {
//		System.out.println("★버튼을 클릭했음★");
//		myLabel.setText("버튼을 클릭");
		Random random = new Random();
		int rand = random.nextInt(100) + 1; //0~99+1=>1~100 101로 설정하지 않은 이유는 1부터 나오게 하기위함. 101을 했을때 0에서 100까지 나오지만 0이 나옴.
		
		myLabel.setText(Integer.toString(rand));
	}
    @FXML
    void changed(ActionEvent event) {
    	myLabel1.setText(combo.getValue());
    }
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 프로그램이 실행할때 먼저 초기화 된다.
		combo.setItems(list);
		
	}
}

