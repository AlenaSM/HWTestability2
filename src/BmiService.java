public class BmiService {
    public int calculate(double lengthM, double weightKg) {
        double y = Math.pow(lengthM, 2);
        double result = (weightKg / y);
        return (int) result;
    }
}
