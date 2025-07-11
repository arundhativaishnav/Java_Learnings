package DataStructures.HashMapsImplementationoffunctions;
import java.util.*;
public class putfunctionImplementation {
        static class HashMap<K ,V>{
            private class Node {
                K key;
                V value ;

                public Node(K key ,V value){
                    this.key = key ;
                    this.value = value ;
                }
            }

            private int n ; //number of nodes
            private int N ;// size of array
            private LinkedList<Node> bucket[];//this is going to be our hashmap

            @SuppressWarnings("uncheked")
            public HashMap(){
                this.N = 4;
                this.bucket = new LinkedList[4];
                for(int i=0;i<4;i++){
                    this.bucket[i] = new LinkedList<>();
                }
            }
            private int hashfunction(K key){
                int bi = key.hashCode();
                return Math.abs(bi) % N;
            }

            private int searchInLL( K key , int bi){
                LinkedList<Node> ll = bucket[bi];
                int di = 0;
                for(int i=0;i<ll.size();i++){
                    if(ll.get(i).key== key)return i ;
                }
                return -1;

            }
            public void put(K key , V value){
                int bi = hashfunction(key);//bi=bucket index
                int di = searchInLL(key, bi);//di = dataindex

                if(di == -1){
                    bucket[bi].add(new Node(key , value));
                    n++;
                }else{
                    Node Data = bucket[bi].get(di);
                    Data.value = value;
                }
                double lambda = (double) n/N;
                if(lambda >= 2.0){
                    resHashing(key , value);
                }
            }

            private void resHashing(K key, V value) {
                LinkedList<Node> oldBucket[] = bucket;
                bucket = new LinkedList[N*2];

                for(int i =0;i<N*2;i++){
                    bucket[i] = new LinkedList<>();
                }
                for(int i=0;i<N*2;i++){
                    LinkedList<Node> ll = oldBucket[i];
                    for(int j=0;j<ll.size();j++){
                        Node node = ll.get(j);
                        put(node.key , node.value);
                    }

                }
            }
        }

    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India",1200);
        map.put("china",13000);
        map.put("US",29000);
        System.out.println(map);
    }
}
