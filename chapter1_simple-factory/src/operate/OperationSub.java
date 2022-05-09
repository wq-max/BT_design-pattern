package operate;

public class OperationSub extends Operation{
    @Override
    public Double getResult(){
        return getNumberA() - getNumberB();
    }
}
