public class MyNatZero implements MyNat {
    public MyNatZero() {
    }
    public String toString() {
        return "zero()";
    }

    @Override
    public MyNat succ() {
        return new MyNatSucc(this);
    }

    @Override
    public MyNat pred() {
        assert !less(new MyNatZero()) :"precondition is not satisfied";
        throw new IllegalStateException("operation undefined");
    }

    @Override
    public boolean less(MyNat m) {
        return true;
    }

    @Override
    public MyNat add(MyNat m) {
        return m;
    }

    @Override
    public MyNat mult(MyNat m1) {
        return this;
    }
}
