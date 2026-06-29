class Solution {
    public double angleClock(int hour, int minutes) {
        double total_minute = minutes * 6;

        double total_hour = (hour % 12) * 30 + minutes * 0.5;


        
        
        double diff =  Math.abs(total_hour - total_minute);


        return Math.min(diff , 360-diff);
    }
}