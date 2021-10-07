public class mt_set<T> implements Set<T> {

    public mt_set(){
    };

    @Override
    public boolean is_in(T t) {
        return false;
    }

    @Override
    public Set<T> delete(T t) {
        return new mt_set<T>();
    }

    @Override // this is written to override the methode in hava lang
    public String toString() {
        return "mt_set";
    }

}
