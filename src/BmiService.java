public class BmiService {
    public double calculate(double weight, double growth) {
        double index = weight / (growth * growth);
        return index;
    }
}
