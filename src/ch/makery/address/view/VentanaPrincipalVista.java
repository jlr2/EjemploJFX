package ch.makery.address.view;

import ch.makery.address.MainApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaPrincipalVista {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private VentanaPersonaVista personavista;

    /**
     * el método equivale al método start de la versión inicial
     * @param primaryStage
     */
    public void inicioStage(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        personavista = new VentanaPersonaVista(primaryStage, rootLayout);
        personavista.showPersonOverview();
    }


    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
