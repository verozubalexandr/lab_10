package com;

import com.classes.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
        Scanner scanner = new Scanner(System.in);
        int task = 0;
        System.out.print("Task(0 - triangle, 1 - pyramid)   ->   ");
        task = scanner.nextInt();

        if (task == 0) {
            TableView<TriangleInfo> table = new TableView<TriangleInfo>();
            TableColumn<TriangleInfo, String> sideCol = new TableColumn<TriangleInfo, String>("Side");
            TableColumn<TriangleInfo, String> heightCol = new TableColumn<TriangleInfo, String>("Height");
            TableColumn<TriangleInfo, String> bisectorCol = new TableColumn<TriangleInfo, String>("Bisector");
            TableColumn<TriangleInfo, String> perimeterCol = new TableColumn<TriangleInfo, String>("Perimeter");
            TableColumn<TriangleInfo, String> areaCol = new TableColumn<TriangleInfo, String>("Area");

            sideCol.setCellValueFactory(new PropertyValueFactory<>("side"));
            heightCol.setCellValueFactory(new PropertyValueFactory<>("height"));
            bisectorCol.setCellValueFactory(new PropertyValueFactory<>("bisector"));
            perimeterCol.setCellValueFactory(new PropertyValueFactory<>("perimeter"));
            areaCol.setCellValueFactory(new PropertyValueFactory<>("area"));

            sideCol.setSortType(TableColumn.SortType.DESCENDING);
            heightCol.setSortType(TableColumn.SortType.DESCENDING);
            bisectorCol.setSortType(TableColumn.SortType.DESCENDING);
            areaCol.setSortType(TableColumn.SortType.DESCENDING);
            perimeterCol.setSortType(TableColumn.SortType.DESCENDING);

            ObservableList<TriangleInfo> list = getTrianglesList();
            table.setItems(list);

            table.getColumns().addAll(sideCol, heightCol, bisectorCol, areaCol, perimeterCol);

            StackPane root = new StackPane();
            root.setPadding(new Insets(5));
            root.getChildren().add(table);

            stage.setTitle("Triangles Database");
            Scene scene = new Scene(root, 395, 300);
            stage.setScene(scene);
            stage.show();
        } else {
            TableView<PyramidInfo> table = new TableView<PyramidInfo>();
            TableColumn<PyramidInfo, String> sideCol = new TableColumn<PyramidInfo, String>("Side");
            TableColumn<PyramidInfo, String> heightCol = new TableColumn<PyramidInfo, String>("Height");
            TableColumn<PyramidInfo, String> baseHeightCol = new TableColumn<PyramidInfo, String>("Base Height");
            TableColumn<PyramidInfo, String> apothemCol = new TableColumn<PyramidInfo, String>("Apothem");
            TableColumn<PyramidInfo, String> areaCol = new TableColumn<PyramidInfo, String>("Area");
            TableColumn<PyramidInfo, String> baseAreaCol = new TableColumn<PyramidInfo, String>("Base Area");
            TableColumn<PyramidInfo, String> volumeCol = new TableColumn<PyramidInfo, String>("Volume");

            sideCol.setCellValueFactory(new PropertyValueFactory<>("side"));
            heightCol.setCellValueFactory(new PropertyValueFactory<>("height"));
            baseHeightCol.setCellValueFactory(new PropertyValueFactory<>("baseHeight"));
            apothemCol.setCellValueFactory(new PropertyValueFactory<>("apothem"));
            areaCol.setCellValueFactory(new PropertyValueFactory<>("area"));
            baseAreaCol.setCellValueFactory(new PropertyValueFactory<>("baseArea"));
            volumeCol.setCellValueFactory(new PropertyValueFactory<>("volume"));


            sideCol.setSortType(TableColumn.SortType.DESCENDING);
            heightCol.setSortType(TableColumn.SortType.DESCENDING);
            baseHeightCol.setSortType(TableColumn.SortType.DESCENDING);
            areaCol.setSortType(TableColumn.SortType.DESCENDING);
            apothemCol.setSortType(TableColumn.SortType.DESCENDING);
            baseAreaCol.setSortType(TableColumn.SortType.DESCENDING);
            volumeCol.setSortType(TableColumn.SortType.DESCENDING);

            ObservableList<PyramidInfo> list = getPyramidsList();
            table.setItems(list);

            table.getColumns().addAll(sideCol, heightCol, baseHeightCol, baseAreaCol, apothemCol, areaCol, volumeCol);

            StackPane root = new StackPane();
            root.setPadding(new Insets(5));
            root.getChildren().add(table);

            stage.setTitle("Pyramids Database");
            Scene scene = new Scene(root, 550, 300);
            stage.setScene(scene);
            stage.show();
        }




    }
    private ObservableList<PyramidInfo> getPyramidsList() {
        PyramidsDatabase pyramidsDatabase = new PyramidsDatabase();
        fillPyramidsDatabase(pyramidsDatabase);

        ObservableList<PyramidInfo> list = FXCollections.observableArrayList();
        for (int i = 0; i < pyramidsDatabase.getPyramidList().size(); i++) {
            list.add(new PyramidInfo(
                    pyramidsDatabase.getPyramidFromList(i).getTriangleSide(),
                    (float) pyramidsDatabase.getPyramidFromList(i).getApothem(),
                    (float) pyramidsDatabase.getPyramidFromList(i).getHeight(),
                    (float) pyramidsDatabase.getPyramidFromList(i).getArea(),
                    (float) pyramidsDatabase.getPyramidFromList(i).getVolume(),
                    (float) pyramidsDatabase.getPyramidFromList(i).getBaseArea(),
                    (float) pyramidsDatabase.getPyramidFromList(i).getBaseHeight()
            ));
        }

        return list;
    }
    private ObservableList<TriangleInfo> getTrianglesList() {
        TrianglesDatabase trianglesDatabase = new TrianglesDatabase();
        fillTrianglesDatabase(trianglesDatabase);

        ObservableList<TriangleInfo> list = FXCollections.observableArrayList();
        for (int i = 0; i < trianglesDatabase.getEquilateralTrianglesList().size(); i++) {
            list.add(new TriangleInfo(
                    (float) trianglesDatabase.getEquilateralTriangleFromList(i).getHeight(),
                            trianglesDatabase.getEquilateralTriangleFromList(i).getTriangleSide(),
                    (float) trianglesDatabase.getEquilateralTriangleFromList(i).getBisector(),
                    (float) trianglesDatabase.getEquilateralTriangleFromList(i).getArea(),
                    (float) trianglesDatabase.getEquilateralTriangleFromList(i).getPerimeter()
            ));
        }

        return list;
    }
    public static void fillTrianglesDatabase(TrianglesDatabase trianglesDatabase) {
        float triangleSide;
        int trianglesIndex = 0;

        while (trianglesIndex < 20) {
            triangleSide = (float) (1 + ((Math.random()) * 7));
            trianglesDatabase.add(new EquilateralTriangle(triangleSide));
            trianglesIndex++;
        }
    }
    public static void fillPyramidsDatabase(PyramidsDatabase pyramidsDatabase) {
        double apothem;
        float triangleSide;
        int pyramidsIndex = 0;

        while (pyramidsIndex < 20) {
            apothem = (7 + ((Math.random()) * 7));
            triangleSide = (float) (1 + ((Math.random()) * 7));
            pyramidsDatabase.add(new Pyramid(apothem, triangleSide));
            pyramidsIndex++;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}