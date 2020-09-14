
package javaapplication16;

public class Time1 {
    
    private int hour;
    private int minute;
    private int second;
    
    public Time1(int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    private void setHour(int h){
        if(h<0 || h>23)
            throw new IllegalArgumentException("Hour value must be within 0-23");
        this.hour=h;
    }
    private void setMinute(int m){
        if(m<0 || m>59)
            throw new IllegalArgumentException("Minute value must be within 0-59");
        this.minute=m;
    }
    private void setSecond(int s){
        if(s<0 || s>59)
            throw new IllegalArgumentException("Second value must be within 0-59");
        this.second=s;
    }
    //universal format HH.MM.SS
    public String toString(){
        return String.format("%02d:%02d:%02d %s", ((this.hour==0 || this.hour==12)? 12 : this.hour%12),
        this.minute, this.second,((this.hour<12) ? "AM" : "PM"));//burada if kullanamadığımız için karizmatik if kullandık.
    }
    //US format hh.mm.ss AM/PM
    public String toUniversal(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
