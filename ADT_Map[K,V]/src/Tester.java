public class Tester {
    public static void main(String[] args) {
        MyMap<Integer, String> empty= new MyMapMt_map<Integer, String>();
        System.out.println("===empty_map: \n" + empty + "\n");

        MyMap<Integer, String> map = empty.insert(1, "p");
        System.out.println("===add p at key 1 to empty: \n"+ map + "\n");

        map = map.insert(2, "p2");
        System.out.println("===adding p2 at key 2: \n" + map + "\n");

        map = map.insert(3,"p2");
        System.out.println("===adding p2 again but at key 3: \n" + map + "\n");


        map = map.update(3, "hi");
        System.out.println("===update the value of key 3 : \n" + map + "\n");
        // no change

        map = map.update(5, "I am 5");
        System.out.println("===trying to update a key 5 that did not exist: \n" + map + "\n");

        System.out.println("===size: \n" + map.size() + "\n");

        map = map.delete(2).delete(3);
        System.out.println("===delete key 2 and 3 \n" + map + "\n");

        MyMap<Integer, String> map2 = new MyMapMt_map().insert(2, "p2");
        System.out.println("===new map: \n" + map2 + "\n");

        map = map.union(map2);
        System.out.println("===unioin of both: \n" + map + "\n");





    }
}
