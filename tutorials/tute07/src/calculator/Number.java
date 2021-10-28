package calculator;

public class Number implements Expression {
    /**
     * Leaf in Composite Pattern
     */
    private int a;

    public Number(int a) {
        this.a = a;
    }

    @Override
    public int calculate() {
        return a;
    }
}
