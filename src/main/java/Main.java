import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by Loving on 14.12.2018.
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainDialog.fxml"));
        primaryStage.setScene(new Scene(root));
//        primaryStage.setMaximized(true);
        ///////////////////////////////////////////////
        primaryStage.initStyle(StageStyle.UNDECORATED);

        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.exit(0);
    }

}

