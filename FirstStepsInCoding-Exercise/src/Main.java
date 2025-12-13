import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // System.out.println(0.1 * 0.1 * 0.1);
        // 0.1 * 0.1 * 0.1 is not exactly 0.001 because floating-point numbers cannot precisely represent most decimal fractions in binary.
        // The result may look like 0.0010000000000000002 due to this precision error.
        // Use BigDecimal for exact decimal calculations.

        BigDecimal d = new BigDecimal("0.1");
        BigDecimal result = d.multiply(d).multiply(d);
        System.out.println(result); // 0.001
    }
}