package org.example;

public class BroadcastsTime implements Comparable<BroadcastsTime>{
    private byte hour;
    private byte minute;

    BroadcastsTime(byte hour, byte minute){
        this.hour = hour;
        this.minute = minute;
    }
    BroadcastsTime(String time){
        String[] curTime = time.split(":");
        this.hour = Byte.parseByte(curTime[0]);
        this.minute = Byte.parseByte(curTime[1]);
    }
    @Override
    public int compareTo(BroadcastsTime other) {
        if (this.hour!= other.hour) {
            return Byte.compare(this.hour, other.hour);
        } else {
            return Byte.compare(this.minute, other.minute);
        }
    }
    byte hour() {return hour;}
    byte minutes() {return minute;}
    public boolean after(BroadcastsTime t) {
        return this.compareTo(t) > 0;
    }

    public boolean before(BroadcastsTime t) {
        return this.compareTo(t) < 0;
    }

    public boolean between(BroadcastsTime t1, BroadcastsTime t2) {
        return (!before(t1)) && (!after(t2));
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}


