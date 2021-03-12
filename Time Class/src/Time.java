public class Time {


    private int hour;
    private int minute;
    private int second;


    Time(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public void setHour(int hour) {

        if (hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public int getHour() {

        return hour;
    }

    public void setMinute(int minute) {

        if (minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public String toString() {

        String time = " ";
        if (this.hour >= 10) {
            time = time + hour;
        } else {
            time = "0" + hour;
        }

        if (this.minute >= 10) {
            time = time + minute;
        } else {
            time = "0" + minute;
        }

        if (this.second >= 10) {
            time = time + second;
        } else {
            time = "0" + second;
        }
        return "Time: \n" + hour + ": " + minute + ": " + second;
    }

    public void previousSecond() {
        second--;
        if (second < 0) {
            this.second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }

    }

    public void nextSecond() {
        second++;
        if (second > 59) {
            this.second = 0;
            minute++;
            if (minute > 59) {
                minute = 0;
                hour++;
                if (hour > 23) {
                   hour = 0;
                }
            }
        }
    }


}