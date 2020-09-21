public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 82;
        double growth = 1.90;
        double bodyMassIndex = service.calculate(bodyMass, growth);
        System.out.printf("Индекс массы тела %.2f", bodyMassIndex);    }

}
