import java.util.*;

// good class video https://www.youtube.com/watch?v=4xKihjI6HJ0&list=WL&index=15
//this gets executed first so code for class must be here
public class Classes {
    public static void main(String[] args) {
        /*
        int num;
        num = 3;
        // these are same thing
        aircraft boeing747;
        boeing747 = new aircraft();
        */
        aircraft boeing747 = new aircraft(); // creates object (Boeing 747) of class aircraft

        aircraft piperSaratoga = new aircraft();

        // like variables
        boeing747.passengers = 9;
        boeing747.speed = 170;
        boeing747.fuelCap = 65.7;
        boeing747.fuelBurnRate = 9.3;
        boeing747.milesFlight = (boeing747.fuelCap / boeing747.fuelBurnRate) * boeing747.speed;


        System.out.println("Boeing747 passengers: " + boeing747.passengers);
        System.out.println("Boeing Fuel burn rate: " + boeing747.fuelBurnRate + " Gallons Per Hour");
        System.out.println("The Boeing747 will be able to fly for: " + boeing747.milesFlight
        + " Miles before having to refuel");

        piperSaratoga.passengers = 6;
        piperSaratoga.speed = 154;
        piperSaratoga.fuelBurnRate = 8.7;
        piperSaratoga.fuelCap = 210;


    }
}
//has to be outside ^, in its own class area

/*class aircraft {
    // Variables for aircraft class
    int passengers; // number of people
    int speed;   // mph
    double fuelCap;   // gallons
    double fuelBurnRate;  //gallons per hours
    double milesFlight;
}

 */