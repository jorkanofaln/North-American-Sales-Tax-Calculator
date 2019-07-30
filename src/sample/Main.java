package sample;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.geometry.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        VBox root = new VBox(5);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        //Adding Components
        Button btnQuit = new Button("quit");
        Label lblQuit = new Label("Press the Button to quit");
        Button btnShowMsg = new Button("Calculate");
        TextField priceField = new TextField();
        ComboBox stateSelector = new ComboBox();
        Label lblPrice = new Label("Enter the price of the item in the textbox: ");
        //Configuring ComboBox Options
        stateSelector.getItems().add("AB");
        stateSelector.getItems().add("AL");
        stateSelector.getItems().add("AK");
        stateSelector.getItems().add("AR");
        stateSelector.getItems().add("AZ");
        stateSelector.getItems().add("BC");
        stateSelector.getItems().add("CA");
        stateSelector.getItems().add("CO");
        stateSelector.getItems().add("DC");
        stateSelector.getItems().add("DE");
        stateSelector.getItems().add("DE");
        stateSelector.getItems().add("FL");
        stateSelector.getItems().add("GA");
        stateSelector.getItems().add("HI");
        stateSelector.getItems().add("ID");
        stateSelector.getItems().add("IL");
        stateSelector.getItems().add("IN");
        stateSelector.getItems().add("IA");
        stateSelector.getItems().add("KS");
        stateSelector.getItems().add("KY");
        stateSelector.getItems().add("LA");
        stateSelector.getItems().add("MA");
        stateSelector.getItems().add("MB");
        stateSelector.getItems().add("MD");
        stateSelector.getItems().add("ME");
        stateSelector.getItems().add("MI");
        stateSelector.getItems().add("MN");
        stateSelector.getItems().add("MO");
        stateSelector.getItems().add("MS");
        stateSelector.getItems().add("MT");
        stateSelector.getItems().add("NB");
        stateSelector.getItems().add("NC");
        stateSelector.getItems().add("ND");
        stateSelector.getItems().add("NE");
        stateSelector.getItems().add("NJ");
        stateSelector.getItems().add("NL");
        stateSelector.getItems().add("NH");
        stateSelector.getItems().add("NS");
        stateSelector.getItems().add("NT");
        stateSelector.getItems().add("NU");
        stateSelector.getItems().add("NV");
        stateSelector.getItems().add("NY");
        stateSelector.getItems().add("OH");
        stateSelector.getItems().add("OK");
        stateSelector.getItems().add("ON");
        stateSelector.getItems().add("OR");
        stateSelector.getItems().add("PA");
        stateSelector.getItems().add("PE");
        stateSelector.getItems().add("QC");
        stateSelector.getItems().add("RI");
        stateSelector.getItems().add("SC");
        stateSelector.getItems().add("SD");
        stateSelector.getItems().add("TN");
        stateSelector.getItems().add("TX");
        stateSelector.getItems().add("VA");
        stateSelector.getItems().add("VT");
        stateSelector.getItems().add("WA");
        stateSelector.getItems().add("WI");
        stateSelector.getItems().add("WV");
        stateSelector.getItems().add("WY");
        stateSelector.getItems().add("YT");

        //Adding quit function to the JavaFX application
        btnQuit.setOnAction(e ->{
            System.exit(0);
        });
        btnShowMsg.setOnAction(e->{
            //Acquiring information for calculating sales tax
            double price = Double.parseDouble(priceField.getText());
            String stateCode = (String) stateSelector.getValue();
            //Calling function to calculate sales Tax
            TaxCalculator taxCalc = new TaxCalculator(price,stateCode);
            double priceWithTaxes = taxCalc.calculateSalesTax();
            JOptionPane.showMessageDialog(null,"The item would actually cost: " + priceWithTaxes);
        });
        root.getChildren().add(lblPrice);
        root.getChildren().add(priceField);
        root.getChildren().add(stateSelector);
        root.getChildren().add(btnShowMsg);
        root.getChildren().add(lblQuit);
        root.getChildren().add(btnQuit);
        //Declaring the rest of the Windows parameters
        primaryStage.setTitle("North American Sales Tax Calculator");
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}