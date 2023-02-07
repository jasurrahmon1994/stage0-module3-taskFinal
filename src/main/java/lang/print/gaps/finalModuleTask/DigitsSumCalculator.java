package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousand = (int)number / 1000;
        int hundred = (int)(number - thousand * 1000) / 100;
        int ten = (int)(number - thousand * 1000 - hundred * 100) / 10;
        int one = number - thousand * 1000 - hundred * 100 - ten * 10;
        System.out.println(thousand + hundred + ten + one);
    }
}
