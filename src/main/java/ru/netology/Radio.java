package ru.netology;

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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < firstStation) {
            return;
        }
        if (station > lastStation) {
            return;
        }
        this.station = station;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
