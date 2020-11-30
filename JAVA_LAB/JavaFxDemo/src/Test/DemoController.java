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

	//fx�� ��̸���Ʈ
	ObservableList<String> list = FXCollections.observableArrayList("����", "������", "���");

	// Event Listener on Button[#btn].onAction
	@FXML
	public void ButtonClick(ActionEvent event) {
//		System.out.println("�ڹ�ư�� Ŭ��������");
//		myLabel.setText("��ư�� Ŭ��");
		Random random = new Random();
		int rand = random.nextInt(100) + 1; //0~99+1=>1~100 101�� �������� ���� ������ 1���� ������ �ϱ�����. 101�� ������ 0���� 100���� �������� 0�� ����.
		
		myLabel.setText(Integer.toString(rand));
	}
    @FXML
    void changed(ActionEvent event) {
    	myLabel1.setText(combo.getValue());
    }
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ���α׷��� �����Ҷ� ���� �ʱ�ȭ �ȴ�.
		combo.setItems(list);
		
	}
}

