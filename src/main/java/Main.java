public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(82,182);
        System.out.println(bmi);
    }
}
