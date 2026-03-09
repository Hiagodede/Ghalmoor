package com.ghalmoor;

import javafx.application.Application;

public class Launcher {
    public static void main(String[] args) {
        // Inicia a aplicação JavaFX burlando a checagem nativa de módulos da JVM
        Application.launch(GhalmoorGame.class, args);
    }
}