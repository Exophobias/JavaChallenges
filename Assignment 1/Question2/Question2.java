public class Question2 {

    /**
     * Metric mass = 7.34767309 x 10^22 kg
     * Metric distance = 384,400 km
     */

    public static void main(String[] args) {

        double metricMass = Math.pow(7.34767309, 22);
        double metricDistance = 384400;

        poundsAndFeet(metricMass, metricDistance);

        double[] temp = yardsAndInches(metricDistance); // Returns [Distance1, Distance2]
        System.out.println(temp[0]);
        System.out.println(temp[1]);

    }

    /**
     * Use the metric mass and distance of the moon and convert it to pounds and feet
     * 
     * @param mass : double     The metric mass of the moon (kg)
     * @param distance : double     The metric distance of the moon (km)
     */
    static void poundsAndFeet(double mass, double distance) {

        double returnMass = mass * 2.20462262; // Convert kg to pounds
        double returnDistance = distance * 3280.8399; // Convert km to feet

        System.out.printf("Kilograms to Pounds: %.2f \n", returnMass);
        System.out.printf("Kilometers to Feet: %.2f \n", returnDistance);

    }

    /**
     * Use the metric mass and distance of the moon and convert it to yards and inches
     * 
     * @param mass : double     The metric mass of the moon
     * @param distance : double     The metric distance of the moon
     */
    static double[] yardsAndInches(double distance) {

        double[] returnDistances = new double[2];

        returnDistances[0] = distance * 1093.6133;
        returnDistances[1] = distance *  39370.0787;

        return returnDistances;
    }

    /**
     * Use the metric mass and distance of the moon and convert it to miles and US tons
     * 
     * @param mass : double     The metric mass of the moon
     * @param distance : double     The metric distance of the moon
     */
    static void milesAndUSTons(double mass, double distance) {

        

    }

}