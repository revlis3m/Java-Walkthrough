package General;

public class Solo<T> {
    private T value;

    public Solo() {
        this.value = null;
    }

    public Solo(T val) {
        this.value = val;
    }

    public void setValeur(T val) {
        this.value = val;
    }

    public T getValeur() {
        return this.value;
    }
}
