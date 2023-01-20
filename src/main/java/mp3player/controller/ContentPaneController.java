package mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import mp3player.mp3.Mp3Song;

public class ContentPaneController {

    private static String TITLE_COLUMN = "Tytuł";
    private static String AUTHOR_COLUMN = "Autor";
    private static String ALBUM_COLUMN = "Album";
    @FXML
    private TableView<?> contentTable;

    public void initialize() {
        System.out.println("Menu content created");
    }


    private void configureTableColumns(){
        TableColumn<Mp3Song, String> titleColumn=new TableColumn<Mp3Song,String>(TITLE_COLUMN);

    }
}
