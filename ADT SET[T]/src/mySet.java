public class mySet<T> implements Set<T>{
    private T data;
    private Set<T> predecessor;

    public mySet(T data, Set<T> predecessor){
        this.data=data;
        this.predecessor=predecessor;
    }


    public Set<T> add(T t) {
        return null;
    }

    @Override
    public boolean is_in(T t) {
        return false;
    }

    @Override
    public Set<T> delete(T t) {
        return null;
    }
}
