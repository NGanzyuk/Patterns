public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }
    @Override
    public double sum(double arg0, double arg1) {
        Double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.SUM)
                .result;
        return result;
    }

    @Override
    public double mult(double arg0, double arg1) {
        Double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.MULT)
                .result;
        return result;
    }

    @Override
    public double pow(double arg0, double arg1) {
        Double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.POW)
                .result;
        return result;
    }

    @Override
    public double sub(double arg0, double arg1) {
        Double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.SUB)
                .result;
        return result;
    }

    @Override
    public double div(double arg0, double arg1) {
        Double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.DIV)
                .result;
        return result;
    }
}
