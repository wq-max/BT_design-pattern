package operate;

public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

    public static void main(String[] args) throws Exception {
        Operation oper;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA(1.001);
        oper.setNumberB(2.0);
        System.out.println(oper.getResult());
    }
}
