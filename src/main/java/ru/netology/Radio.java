package ru.netology;

public class Radio {
    private int Volume;
    private int maxVolume;
    private int minVolume;
    private int Station;
    private int firstStation;
    private int lastStation;
    private boolean on;

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
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
        return Station;
    }

    public void setStation(int station) {
        Station = station;
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
        if (Volume > maxVolume) {
            return;
        }
        if (Volume < minVolume) {
            return;
        }
        this.Volume = Volume + 1;
    }

    public void decreaseVolume() {
        if (Volume > maxVolume) {
            return;
        }
        if (Volume < minVolume) {
            return;
        }
        this.Volume = Volume - 1;
    }

    public void nextStation() {
        if (Station < firstStation) {
            return;
        }
        this.Station = Station + 1;
        if (Station > lastStation) {
            this.Station = firstStation;
        }

    }

        public void prevStation() {

            if (Station > lastStation) {
                return;
            }
            this.Station = Station - 1;
            if (Station < firstStation) {
                this.Station = lastStation;
            }

        }
    }
