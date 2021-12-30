package mywork2;

public class Time22 {
    
    private int hour;
    private int minute;
    
    public void setTime(int h, int m){
        if((h>=0 && h<24)&&(m >= 0 && m<60)){
            hour = h;
            minute = m;
        }
        else
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
    }
    
    public String toUniversalString(){
       return String.format("%02d:%02d", hour, minute);
    }
    
    public String toString(){
       return String.format("%d:%02d %s", ((hour==0||hour==12)? 12 : hour % 12), minute, (hour < 12 ? "AM" : "PM"));
    }

}