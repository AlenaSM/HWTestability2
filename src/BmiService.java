public class BmiService {
    public int calculate(double length_m, double weight_kg) {
        double y = Math.pow(length_m, 2);
        double result = (weight_kg / y);
        return (int) result;
    }
}
