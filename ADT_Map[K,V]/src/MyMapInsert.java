public class MyMapInsert<K, V> implements MyMap<K, V>{
    public K k2;
    public V v2;
    public MyMap<K, V> m2;

    public MyMapInsert(K k, V v, MyMap<K, V> m) {
        this.k2 = k;
        this.v2 = v;
        this.m2 = m;
    }

    public String toString() {
        return "insert(" + k2 + "," + v2 + "," + m2 + ")";
    }

    @Override
    public MyMap<K, V> insert(K k1, V v1) {
        if(k1==k2)
            return new MyMapInsert<>(k2, v1,m2);
        else
            return  new MyMapInsert<>(k2,v2,m2.insert(k1,v1));
        // return m2.insert(k1, v1).insert(k2, v2);
        // try above line will never lead to add a new key and value in case that the key wasn't existing before
        // and that is not what we are looking for
    }

    @Override
    public MyMap<K, V> update(K k1, V v1) {
        if(k1==k2)
            return m2.insert(k2,v1);
        else
            return m2.update(k1, v1).insert(k2, v2);
    }

    @Override
    public boolean is_in_dom(K k1) {
        if(k1==k2)
            return true;
        else
            return m2.is_in_dom(k1);
    }

    @Override
    public V lookup(K k1) {
        assert !is_in_dom(k1) : "precondition is not satisfied";
        if(k2==k1)
            return v2;
        else return m2.lookup(k1);
    }

    @Override
    public MyMap<K, V> delete(K k1) {
        if(k1==k2)
            return m2;
        else
            return m2.delete(k1).insert(k2, v2);
    }

    @Override
    public MyMap<K, V> union(MyMap<K, V> m1) {
        return m2.union(m1).insert(k2, v2);
    }

    @Override
    public int size() {
        return m2.size()+1;
    }
}
