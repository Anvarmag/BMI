public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = (double) service.calculate(82, 182);
        System.out.println(bmi);
    }
}