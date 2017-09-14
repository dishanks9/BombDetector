
package pkgfinally;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Finally extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//        Image image=new Image("src/images/mall.jpg");
//        ImageView iv=new ImageView();
//        iv.setImage(image);
        
                
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        Implementation p=new Implementation();
        p.start();
        launch(args);
        
        
    }
    
}
