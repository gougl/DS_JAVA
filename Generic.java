public class Generic<T> {
    private T var;
    // notice: Generic<T>(){} is wrong
    public Generic(){

    }
    public Generic(T var){
        this.var = var;
    }

    public void setVar(T var){
        this.var = var;
    }
    public T getVar(){
        return var;
    }
    public void print(){
        System.out.println(getVar());
    }
}
