package com.ghalmoor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GhalmoorGame extends Application {

    @Override
    public void start(Stage palcoPrincipal) {
        // O StackPane é um container inicial apenas para validar a renderização.
        StackPane raiz = new StackPane();

        // Configuração matemática da Scene (Resolução HD base para jogos 2D)
        Scene cenaPrincipal = new Scene(raiz, 1280, 720);

        // Travando as configurações da janela no SO
        palcoPrincipal.setTitle("Ghalmoor - Engine Gráfica Ativa");
        palcoPrincipal.setScene(cenaPrincipal);
        palcoPrincipal.setResizable(false); // Impede que redimensionamento quebre a física do layout

        // Passa o controle da renderização para a GPU/SO
        palcoPrincipal.show();
    }
}