/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.udp;

/**
 *
 * @author vikas
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    //final variable firstname="vikas";

    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        
        primaryStage.setTitle(" WebView ");
        webView.getEngine().setOnError(event -> System.err.println(event.getMessage()));
	webView.getEngine().setOnAlert(event -> System.err.println(event.getData()));

        webView.getEngine().setJavaScriptEnabled(true);
        webView.getEngine().load("http://46.165.243.164:9876/gwplpos/menucard?pt=4_EXT6");    
        // action event 
        VBox vBox = new VBox(webView);

        Scene scene = new Scene(vBox, 1900, 700);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}