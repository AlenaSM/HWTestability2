// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double length_m = 1.7;
        double weight_kg = 70.5;
        double index = service.calculate(length_m, weight_kg);
        System.out.println((int)index);

    }
}