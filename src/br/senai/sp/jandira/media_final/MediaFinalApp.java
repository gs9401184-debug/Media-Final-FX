package br.senai.sp.jandira.media_final;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MediaFinalApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Determinando o tamanho do stage
        stage.setWidth(600);
        stage.setHeight(500);

        // Determinando o título do stage (Tela/janela)
        stage.setTitle("Média Final");

        //Painel Raiz (root)
        BorderPane root = new BorderPane();

        Label labelTitulo = new Label();
        labelTitulo.setText("Escola \"Prof. Vicente Amato\"");
        // Formatação do texto da Label
        labelTitulo.setStyle("-fx-text-fill: #005aff;-fx-font-size: 32;-fx-font-weight: bold;");
        labelTitulo.setPadding(new Insets(10, 0, 10, 10));

        // Painel de resultados - Parte de baixo
        VBox painelResultado = new VBox();
        painelResultado.setPadding(new Insets(0, 0 , 10,10));
        Label labelAluno = new Label("Nome do Aluno:");
        Label labelMediaFinal = new Label("Média Final");
        Label labelSituacao = new Label("Situação:");
        painelResultado.getChildren().addAll(labelAluno, labelMediaFinal, labelSituacao);



        // Painel de botões
        VBox painelDeBotoes = new VBox();
        painelDeBotoes.setPadding(new Insets(0, 10 , 10,0));
        painelDeBotoes.setSpacing(10);
        Button buttonCalcularMedia = new Button("Calcular média");
        buttonCalcularMedia.setPrefWidth(150);
        buttonCalcularMedia.setPrefHeight(40);
        Button buttonLimpar = new Button("Limpar");
        buttonLimpar.setPrefWidth(150);
        buttonLimpar.setPrefHeight(40);
        Button buttonSair = new Button("Sair");
        buttonSair.setPrefWidth(150);
        buttonSair.setPrefHeight(40);
        painelDeBotoes.getChildren().addAll(buttonCalcularMedia, buttonLimpar, buttonSair);

        // Painel Formulário
        VBox painelFormulario = new VBox();
        painelFormulario.setPadding(new Insets(0, 0 , 10,10));
        Label labelNome = new Label("Nome do Aluno");
        Label labelNota1 = new Label("Nota 1");
        Label labelNota2 = new Label("Nota 2");
        Label labelNota3 = new Label("Nota 3");
        Label labelNota4 = new Label("Nota 4");
        TextField textFieldNome = new TextField();
        TextField textFieldNota1 = new TextField();
        TextField textFieldNota2 = new TextField();
        TextField textFieldNota3 = new TextField();
        TextField textFieldNota4 = new TextField();
        painelFormulario.getChildren().addAll(
                labelNome, textFieldNome,
                labelNota1, textFieldNota1,
                labelNota2, textFieldNota2,
                labelNota3, textFieldNota3,
                labelNota4, textFieldNota4
        );

        root.setTop(labelTitulo);
        root.setBottom(painelResultado);
        root.setRight(painelDeBotoes);
        root.setLeft(painelFormulario);

        // Criando a cena
        Scene scene = new Scene(root);

        stage.setScene(scene);


        // Mostrar o stage (Tela/)
        stage.show();

        // Eventos de clique
        //buttonCalcularMedia.addEventHandler();


    }
}
