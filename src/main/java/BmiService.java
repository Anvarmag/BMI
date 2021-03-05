public class BmiService {
    double calculate(double masskg, double growthm) {
        int bmi = (int) (masskg / (growthm / 100 * growthm / 100));
        return bmi;
    }
}
