package xml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controlador2 implements Initializable {

	@FXML
	Button ventanaInicial;

	@FXML
	Button numero1;

	@FXML
	Button numero2;

	@FXML
	Button numero3;

	@FXML
	Button numero4;

	@FXML
	Button numero5;

	@FXML
	Button numero6;

	@FXML
	Button interrogante1;

	@FXML
	Button interrogante2;

	@FXML
	Button interrogante3;

	@FXML
	Button interrogante4;

	@FXML
	Button interrogante5;

	@FXML
	private void random(ActionEvent event) {
		System.out.println("numeros random");
	}

	@FXML
	private void limpiar(ActionEvent event) {
		System.out.println("limpiar");
	}

	@FXML
	private void numeros(ActionEvent event) {
		System.out.println("numeros izquierda");
	}

	@FXML
	private void operaciones(ActionEvent event) {
		System.out.println("signos de operaciones");
	}

	@FXML
	private void ventanaInicial(ActionEvent event) {

		try {

			Stage stage = (Stage) this.ventanaInicial.getScene().getWindow();
			stage.close();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Controlador.class.getResource("ventanaprincipal.fxml"));
			Scene scene = new Scene(loader.load());
			Stage stage2 = new Stage();
			stage2.setTitle("Xifres Enigmatiques");
			stage2.setScene(scene);
			stage2.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		numero1.setText("numero1");
		numero2.setText("numero2");
		numero3.setText("numero3");
		numero4.setText("numero4");
		numero5.setText("numero5");
		numero6.setText("numero6");
	}

}
