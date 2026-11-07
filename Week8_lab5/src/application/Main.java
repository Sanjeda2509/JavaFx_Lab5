package application;
	


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
     // Requirement 2: Top HBox

        Label title = new Label("College Student Services");
        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");

        HBox header = new HBox(10);
        header.getChildren().add(title);

        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(15));

        root.setTop(header);
        
      // requirement 3: left VBox
        
        Button b1 =new Button("Dashboard");
        Button b2 = new Button("Registration");
        Button b3 = new Button ("Courses");
        Button b4 = new Button("Help");
        
        VBox leftvbox = new VBox(13);
        leftvbox.getChildren().addAll(b1,b2,b3,b4);
        
        leftvbox.setPadding(new Insets(15));
        
        root.setLeft(leftvbox);
        
      // requirement 4: Center VBox
        
        VBox centervbox = new VBox(15);
        
        centervbox.setPadding(new Insets(15));
        root.setCenter(centervbox);
        
       // Requirement 5: GridPane
        
        TextField id = new TextField();
        TextField name = new TextField();
        TextField email = new TextField();
        TextField program = new TextField();
        
        GridPane grid = new GridPane();
        
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15));
        
        grid.add(new Label("Student ID"), 0, 0);
        grid.add(id, 1, 0);
        
        grid.add(new Label("Full Name"),0,1);
        grid.add(name, 1, 1);
        
        grid.add(new Label("Email"),0,2);
        grid.add(email, 1, 2);
        
        grid.add(new Label("Program"),0,3);
        grid.add(program, 1, 3);
        
     // Add grid in VBox
        
        centervbox.getChildren().add(grid);
        
     // Requirement 6
        
     // Requirement 6: HBox for buttons

        Button register = new Button("Register");
        Button clear = new Button("Clear");

        HBox buttonBox = new HBox(10);

        buttonBox.getChildren().addAll(register, clear);

        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(10));

        centervbox.getChildren().add(buttonBox);
        
        Scene scene = new Scene(root, 750, 450);

        primaryStage.setTitle("College Student Registration");

        primaryStage.setScene(scene);

        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}