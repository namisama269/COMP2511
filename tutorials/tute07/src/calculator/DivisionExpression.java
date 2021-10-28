package calculator;

public class DivisionExpression implements Expression {
    private Expression a;
    private Expression b;

    public DivisionExpression(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return a.calculate() / b.calculate();
    }
}
