
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap_Implementation {
    @SuppressWarnings("unused")
    static class HashMap<K,V>{ // generics
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        @SuppressWarnings("FieldMayBeFinal")
        private int N;
        private LinkedList<Node> buckets [];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<N;i++){
                this.buckets[i]=new LinkedList<>();
            }

        }

        private int hashFunction(K key){
            int index=key.hashCode();
            return Math.abs(index)%N;

        }

        private int searchInLL(K key,int index){
            LinkedList<Node> list=buckets[index];
            for(int i=0;i<list.size();i++){
                if(list.get(i).key.equals(key)){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node>[] oldBuckets=buckets;
            buckets=new LinkedList[N*2];
            this.N*=2;
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }

            for (LinkedList<Node> list : oldBuckets) {
                for(int j=0;j<list.size();j++){
                    Node node=list.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int index = hashFunction(key);
            int data_index=searchInLL(key,index);
            if(data_index==-1){  // key does not exist
                buckets[index].add(new Node(key, value));
                n++;
            }

            else{   // Key already exists
                Node node=buckets[index].get(data_index);
                node.value=value;
            }

            double lambda=(double)n/N;
            if(lambda>2.0){
                // rehashing 
                rehash();
            }

            
        }

        public V get(K key){
            int index = hashFunction(key);
            int data_index=searchInLL(key,index);
            if(data_index==-1){  // key does not exist
                return null;
                
            }

            else{
                Node node=buckets[index].get(data_index);
                return node.value;
            }

        }

        public boolean containsKey(K key){
            int index = hashFunction(key);
            int data_index=searchInLL(key,index);
            return data_index != -1; // key does not exist
        }

        public V remove(K key){
            int index = hashFunction(key);
            int data_index=searchInLL(key,index);
            if(data_index==-1){  // key does not exist
                return null;
            }
            else{
                Node node=buckets[index].remove(data_index);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> LL=buckets[i];

                for(int j=0;j<LL.size();j++){
                    Node node=LL.get(j);
                    keys.add(node.key);
                }
            }

            return  keys;
        }
        


    }

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("US", 25);
        map.put("China", 100);
        map.put("Japan", 50);

        ArrayList<String> keys = map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }

        System.out.println(map.remove("India"));
        System.out.println(map.get("India"));

    }
    
}
