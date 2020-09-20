public class BmiService {
    public double calculate(double body_mass, double growth) {
        double index = body_mass / (growth * growth);
        return index ;
    }
}
