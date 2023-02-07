package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundred = (int)number / 100;
        int ten = (int)(number - hundred * 100) / 10;
        int one = number - hundred * 100 - ten * 10;
        System.out.println("" + one + ten + hundred);
    }
}
