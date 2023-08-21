// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double lengthM = 1.7;
        double weightKg = 70.5;
        double index = service.calculate(lengthM, weightKg);
        System.out.println((int)index);

    }
}