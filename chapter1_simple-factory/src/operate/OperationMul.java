package operate;

public class OperationMul extends Operation{
    @Override
    public Double getResult(){
        return getNumberA() * getNumberB();
    }
}
