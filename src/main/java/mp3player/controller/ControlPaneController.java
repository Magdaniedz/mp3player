package mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;


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

    public Button getPreviousButton() {
        return previousButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public ToggleButton getPlayButton() {
        return playButton;
    }

    public Slider getProgressSlider() {
        return progressSlider;
    }

    public Slider getVolumeSlider() {
        return volumeSlider;
    }

    public void initialize() {
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
        previousButton.setOnAction(event -> System.out.println("Poprzednia piosenka"));
        nextButton.setOnAction(x -> System.out.println("Następna piosenka"));
        playButton.setOnAction(event -> {
            if(playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });
    }
}