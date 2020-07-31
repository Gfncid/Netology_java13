package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int station;
    private int firstStation = 0;
    private int lastStation;
    private boolean on;

    public Radio(int volume) {
        this.volume = volume;
    }

    public Radio(int station, int lastStation) {
        this.station = station;
        this.lastStation = lastStation;
    }

    public void increaseVolume() {
        this.volume = volume + 1;
        if (volume <= minVolume) {
            this.volume = minVolume;
        }
        if (volume >= maxVolume) {
            this.volume = maxVolume;
        }

    }

    public void decreaseVolume() {
        this.volume = volume - 1;
        if (volume > maxVolume) {
            this.volume = maxVolume;
        }
        if (volume <= minVolume) {
            this.volume = minVolume;
        }
    }

    public void nextStation() {
        this.station = station + 1;
        if (station < firstStation) {
            this.station = firstStation;
        }
        if (station > lastStation) {
            this.station = firstStation;
        }

    }


    public void prevStation() {
        this.station = station - 1;
        if (station > lastStation) {
            this.station = lastStation;
        }
        if (station < firstStation) {
            this.station = lastStation;
        }

    }
}
