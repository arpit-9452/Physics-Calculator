import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{

    public static double distanceCalc(double speed, double timeInMin){
        if(speed<=0 || timeInMin<=0){
            System.out.println("Invalid Entry..");
        }
        double distance = speed*timeInMin;
        return distance;
    }
    public static double speedCalc(double distance, double timeInMin){
        if(distance<=0 || timeInMin<=0){
            System.out.println("Invalid Entry..");
        };
        double speed = distance/timeInMin;
        return speed;
    }
    public static double timeCalc(double distance,double speed){
        if(distance<=0 || speed<=0){
            System.out.println("Invalid Entry..");
        }
        double time = distance/speed;
        return time;
    }
    public static void main(String args[]){
        System.out.println("What you want to Calculate");
        System.out.println("Press 1 for Distance, 2 for Speed, 3 for Time...");
        Scanner sc = new Scanner(System.in);
        int entry = sc.nextInt();
        if(entry == 1){
            System.out.println("Enter the Speed in K.M/h");
            double speed = sc.nextDouble();
            System.out.println("Entert he Time in Minutes..");
            double time = sc.nextDouble();
            double timeInMin = time/60;
            double distance = distanceCalc(speed, timeInMin);
            System.out.println(distance+" K.M Distance will cover..");
        }
        if(entry == 2){
            System.out.println("Enter the Distance in K.M");
            double distance = sc.nextDouble();
            System.out.println("Enter the Time in Minutes..");
            double time = sc.nextDouble();
            double timeInMin = time/60;
            double speed = speedCalc(distance, timeInMin);
            //System.out.println("Speed was at "+speed+" K.M/h");
            DecimalFormat format = new DecimalFormat("0.#");
            System.out.println(format.format(speed)+" K.M/h Speed you're Maintaing..");
        }
        if(entry == 3){
            System.out.println("Enter the Distance in K.M");
            double distance = sc.nextDouble();
            System.out.println("Enter the Speed in K.M/h");
            double speed = sc.nextDouble();
            double time = timeCalc(distance, speed);
            double timeInMin = time*60;
            System.out.println(timeInMin+" Minutes Will Take");
        }else{
            System.out.println("Invalid Entry..");
        }
    }
}