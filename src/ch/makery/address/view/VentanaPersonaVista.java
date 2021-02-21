package ch.makery.address.view;

import ch.makery.address.MainApp;
import ch.makery.address.controller.PersonOverviewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaPersonaVista {

    private Stage stageppal;
    private BorderPane rootLayout;

    public VentanaPersonaVista(Stage stageppal, BorderPane  rootLayout) {
        this.stageppal = stageppal;
        this.rootLayout = rootLayout;
    }



    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);

            // Give the controller access to the main app.
            PersonOverviewController controller = loader.getController();
            controller.setVista(this,stageppal);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
