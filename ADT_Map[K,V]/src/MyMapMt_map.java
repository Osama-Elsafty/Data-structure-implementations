public class MyMapMt_map<K, V> implements MyMap<K, V>{
    public MyMapMt_map() {
    }
    public String toString() {
        return "mt_map";
    }

    @Override
    public MyMap<K, V> insert(K k, V v) {
        return new MyMapInsert<>(k, v, this);
    }

    @Override
    public MyMap<K, V> update(K k, V v) {
        return this;
    }

    @Override
    public boolean is_in_dom(K k) {
        return false;
    }

    @Override
    public V lookup(K k) {
        assert !is_in_dom(k) : "precondition is not satisfied";
        throw new IllegalStateException("Operation not difined");
    }

    @Override
    public MyMap<K, V> delete(K k) {
        return this;
    }

    @Override
    public MyMap<K, V> union(MyMap<K, V> m) {
        return m;
    }

    @Override
    public int size() {
        return 0;
    }
}
