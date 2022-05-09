package operate;

public class OperationAdd extends Operation{
    @Override
    public Double getResult(){
        return getNumberA() + getNumberB();
    }
}
