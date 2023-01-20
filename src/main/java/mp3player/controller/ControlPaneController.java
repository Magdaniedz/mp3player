package mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagConstant;
import org.farng.mp3.TagException;
import org.farng.mp3.TagOptionSingleton;
import org.farng.mp3.id3.ID3v2_3;

import java.io.IOException;

public class ControlPaneController {

    @FXML
    private Button previousButton;
    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Slider progressSlider;

    @FXML
    private Slider volumeSlider;


    public void initialize() {
        System.out.println("Control controller created");
        configureButtons();
        configureVolume();
        configureSliders();
    }

    private void configureSliders(){
        volumeSlider.valueProperty().addListener((observable,oldValue,newValue)->
                System.out.println("Zmiana głosności " + newValue.doubleValue()
                ));
        progressSlider.valueProperty().addListener(x-> System.out.println("Przesunięcie piosenki")
        );
    }
    private void configureVolume() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED,
                mouseEvent -> System.out.println("Wciśnieto przycisk na suwaku głośności"));
    }

    private void configureButtons() {
        previousButton.setOnAction(actionEvent -> System.out.println("Poprzednia piosenka"));
        nextButton.setOnAction(x-> System.out.println("Następna piosenka"));
        playButton.setOnAction( actionEvent -> {
            if (playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });
    }
}