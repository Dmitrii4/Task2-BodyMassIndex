public class BmiService {
    public double calculate(double bodyMass, double growth) {
        double index = bodyMass / (growth * growth);
        return index ;
    }
}
