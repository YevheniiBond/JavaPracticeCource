package Primitives;

public class ObjectReferenceApp  {

    public static void main(){
        byte numberOfSeats = 5;
        Short horsePover = 392;
        Integer price = 14999;
        Long registrationNumber = 242324242324232423L;

        Float flueConsumptionCombined = 15.5F;
        Double fuelConsumptionPrices = 15.3445563434535463;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';
        String carModel = "DodgeChallenger SRT 392 ";
        String carModelNew = new String("DodgeChallanger SRT 392");
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepover: " + horsePover);
        System.out.println(" Price $: " + price.doubleValue());
        System.out.println("Registration number: " + registrationNumber );
        System.out.println("Precide  fuel consumption: " + fuelConsumptionPrices.intValue());
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy efficiecy category: " + energyEfficiencyCategory);

        System.out.println("The car model: " + carModel);
        System.out.println("The car model to uppercase : " + carModel.toUpperCase());
        System.out.println("The car model to lowercase : " + carModel.toLowerCase());
        System.out.println("Car model and car model with new keywords are equals: " + carModel.toLowerCase());
        System.out.println("The car model with new keyword: " + carModelNew);



    }


}
