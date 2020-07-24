package ru.netology;

public class Radio {
    private int volume;
    private int maxVolume;
    private int minVolume;
    private int station;
    private int firstStation;
    private int lastStation;
    private boolean on;

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
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume + 1;
    }

    public void decreaseVolume() {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume - 1;
    }

    public void nextStation() {
        if (station < firstStation) {
            return;
        }
        this.station = station + 1;
        if (station > lastStation) {
            this.station = firstStation;
        }

    }

    public void prevStation() {

        if (station > lastStation) {
            return;
        }
        this.station = station - 1;
        if (station < firstStation) {
            this.station = lastStation;
        }

    }
}
