package Primitives;

public class CarInfo {

    public static void main(String[] args) {

        byte numberOfSeats = 5; //camel case
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short power = 362;
        short horsPower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 2345566787665654L;

        float fuelConsumptionCombiner = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 152.234523445556565343343e-1;

        boolean isDamage = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: €" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The car is Damaged: " + isDamage);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "kW(" + horsPower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + "g/km");
        System.out.println("Emission sticker: " + emissionSticker + "(Energy efficiency category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombiner + " l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Extra Urban fuel consumption: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Price average fuel consumption: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("number of previous owners: " + numberOfVehicleOwners);
        System.out.println("number of doors: " + numberOfDoors);
        System.out.println("number of seats: " + numberOfSeats);

        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The value of new number of seats: " + newNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombiner;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + " l/100km");

        CarInfo carInfo = new CarInfo();
        s("1");
    }

    public static void s(String s) {
        System.out.println(s);
    }
}