public interface MyMap<K,V> {
    public MyMap<K, V> insert(K k, V v);

    public MyMap<K, V> update(K k, V v);

    public boolean is_in_dom(K k);

    public V lookup(K k);

//    public OPTION<V> lookup_opt(K key);
//    a definition for OPTION<V> must be prepaired previously

    public MyMap<K, V> delete(K k);

    public MyMap<K, V> union(MyMap<K, V> m);

    int size();
}
