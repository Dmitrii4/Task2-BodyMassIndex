public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Body_mass_index = service.calculate(82,1.90);
        System.out.println(Body_mass_index);
    }

}
