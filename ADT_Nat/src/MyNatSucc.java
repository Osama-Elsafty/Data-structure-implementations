public class MyNatSucc implements MyNat{
    public MyNat prev; // this indicates the previos Nat of our Nat

    public MyNatSucc(MyNat myNat) {
        this.prev = myNat;
    }

    public String toString() {
        return "succ(" + prev + ")";
    }

    @Override
    public MyNat succ() {
        return new MyNatSucc(this);
    }

    @Override
    public MyNat pred() {
        assert !less(new MyNatZero()) :"precondition is not satisfied";
        return prev;
    }

    @Override
    public boolean less(MyNat n) {
        // is this Nat less than the passed Nat m? if yes return true
        if (n instanceof MyNatZero)
            return false;
        return this.prev.less(n.pred());
    }

    @Override
    public MyNat add(MyNat m) {
        return prev.add(m).succ();
        //this will keep going back one step and adding a successor instead
        // at some point this will reach zero and in the implementation of the function add in zero the other
        // number gets returned, so it will be returned with successors equal to this
    }

    @Override
    public MyNat mult(MyNat m1) {
        return prev.mult(m1).add(m1);
    }
}

