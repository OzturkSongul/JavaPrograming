package week11;

public class ParkingMeters {
    // two instance variables named timeLeft and maxTime of type if int

    public int timeLeft =0;
    public int maxTime;

    public ParkingMeters(int number) {// need to initilize maxtime
        maxTime = number;
    }
    public boolean add(int i){
        boolean flag=false;
        if(i==25) {
            if (!(timeLeft + 30 > maxTime)) {
                timeLeft += 30;
                flag = true;
            }
        }
        return flag;
            }
        }


