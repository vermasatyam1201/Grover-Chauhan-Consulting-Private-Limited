import javafx.application.Application;
import javafx.scene.Scene;  
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane; 
import javafx.geometry.Insets; 
import javafx.scene.layout.HBox; 
public class Sample extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
	   GridPane grid = new GridPane();
       grid.setAlignment(Pos.CENTER);
       grid.setHgap(10);
       grid.setVgap(10);
       grid.setPadding(new Insets(25, 25, 25, 25));
       Scene scene = new Scene(grid, 300, 275);
       primaryStage.setScene(scene);

       Label field1 = new Label("TextField 1:");
       grid.add(field1, 0, 1);

       TextField textfield1 = new TextField();
       grid.add(textfield1, 1, 1);

        Label field2 = new Label("TextField 2:");
        grid.add(field2, 0, 2);

        TextField textfield2 = new TextField();
        grid.add(textfield2, 1, 2);  


        Button btn = new Button("Button");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

         primaryStage.setTitle("Sample");
         primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}