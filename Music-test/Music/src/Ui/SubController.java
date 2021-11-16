package Ui;

import javafx.event.Event;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class SubController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		try {
			user_move();
		} catch (Exception e) {
			// TODO: handle exception

		}
	}

	// 시작부분
	@FXML
	private ImageView start;

	@FXML
	private ImageView start01;

	@FXML
	private ImageView start02;

	@FXML
	private ImageView test01;

	public void number01() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("play.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) start.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void number02() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Drum.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) start01.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void number03() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Xylophone.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) start02.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 드럼 부분

	@FXML
	private Button Back;

	public void Musical() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Home.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) Back.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 리코더
	@FXML
	private Button Back01;

	public void Musical01() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Home.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) Back01.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 실로폰
	@FXML
	private Button Back02;

	public void Musical02() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Home.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) Back02.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 사용설명
	@FXML
	private Button User;

	public void How() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Use.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) User.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private ImageView exit;

	public void wayback() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Home.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) exit.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void user_move() {
		// 캐릭터
		test01.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				move(event, null);
				move1(event, null);
				move2(event, null);

			}
		});
	}

	public void move(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.W)) {
			System.out.println("ddddddd");
		}

	}

	public void move1(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.E)) {
			System.out.println("FFFFFFFF");
		}

	}

	public void move2(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.R)) {
			System.out.println("FFFFFFFF");
		}

	}

}