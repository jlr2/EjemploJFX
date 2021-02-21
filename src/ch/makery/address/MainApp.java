package ch.makery.address;

import ch.makery.address.view.VentanaPrincipalVista;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {


    private VentanaPrincipalVista ventanaprincipal;
    

    @Override
    public void start(Stage primaryStage) {
      VentanaPrincipalVista ventanaprincipal = new VentanaPrincipalVista();
      ventanaprincipal.inicioStage(primaryStage);

    }



    public static void main(String[] args) {
        launch(args);
    }
}