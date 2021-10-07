public interface Set<T> {
    //public Set<T> add(T t);
    // in Axioms add is not defined for the mt_set
    public boolean is_in(T t);
    public Set<T> delete(T t);

}
