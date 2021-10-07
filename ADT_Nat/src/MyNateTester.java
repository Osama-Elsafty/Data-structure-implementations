public class MyNateTester {
    public static void main(String args[]){
         MyNat zero = new MyNatZero();
        System.out.println("zero= " + zero);

        // test operation succ
        MyNat one= zero.succ();
        MyNat two = one.succ();
        System.out.println("one= "+ one);
        System.out.println("two= "+ two);

        // test operation pred
        MyNat four= zero.succ().succ().succ().succ();
        System.out.println("Three= "+ four.pred());

        // test operation less
        System.out.println("zero<two: "+ zero.less(two));
        System.out.println("two<four: "+ two.less(four));
        System.out.println("four<one: "+ four.less(one));

        // testing add
        System.out.println("zero + two= "+ zero.add(two));
        System.out.println("four + one= "+ four.add(one));
        System.out.println("one + four= "+ one.add(four));

        //testing mult
        System.out.println("two * one= " + two.mult(one));
        System.out.println("two * four= " + two.mult(four));
        System.out.println("two * two= " + two.mult(two));
        System.out.println("four * zero= " + four.mult(zero));






    }
}
