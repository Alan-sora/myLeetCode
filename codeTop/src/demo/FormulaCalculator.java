import org.mariuszgromada.math.mxparser.*;

public class FormulaCalculator {
    public static double calculateFormula(String formula, List<Double> parameters) {
        Expression expression = new Expression(formula);

        // 设置参数变量
        for (int i = 0; i < parameters.size(); i++) {
            expression.setVariableValue(Character.toString((char) ('a' + i)), parameters.get(i));
        }

        // 计算结果
        return expression.calculate();
    }

    public static void main(String[] args) {
        String formula1 = "a - b";
        List<Double> parameters1 = Arrays.asList(10.0, 5.0);

        String formula2 = "(a + b + c) / d";
        List<Double> parameters2 = Arrays.asList(10.0, 5.0, 3.0, 2.0);

        double result1 = calculateFormula(formula1, parameters1);
        double result2 = calculateFormula(formula2, parameters2);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}