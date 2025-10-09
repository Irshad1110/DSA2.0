package numberSystem;

public class AnyBaseToAnyBase {

    public static int anyBaseToAnyBase(int n, int b1, int b2) {
        int num = AnyBaseToDecimal.anyBaseToDecimal(n, b1);
        return DecimalToAnyBase.decimalToAnyBase(num, b2);
    }
}
