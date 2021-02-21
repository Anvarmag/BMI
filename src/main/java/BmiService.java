public class BmiService {
        int calculate(double masskg, double growthm) {
        int bmi = (int) (masskg / (growthm / 100 * growthm / 100 ));
            int norm = 24;
            if (bmi == norm) {
                System.out.println("norm");
            } else {
                System.out.println("bad");
            }
        return bmi;
        }
    }
