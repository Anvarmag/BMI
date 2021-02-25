public class BmiService {
    double calculate(double masskg, double growthm) {
        double bmi = (double) (masskg / (growthm / 100 * growthm / 100));
        return bmi;
    }
}
