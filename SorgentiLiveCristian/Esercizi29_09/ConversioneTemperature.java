public class ConversioneTemperature {
    public static void main(String[] args) {
        double valoreConvertitoCelsius = celsius(123);
        System.out.printf("123 in Farheneit corrisponde a %.2f gradi celsius",valoreConvertitoCelsius);
    }


    public static double celsius(double farenheit){
        double temparaturaCelsius;
        temparaturaCelsius =  5.0 / 9.0 * (farenheit - 32);

        return temparaturaCelsius;
    }
}
