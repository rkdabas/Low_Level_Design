package org.example.HashMapInternalImpl;

public class MyHashMap<K,V> {
    private static final int INITIAL_SIZE=16;
    private static final int MAXIMUM_CAPACITY=1<<30;

    public Entry[] hashTable;

    public MyHashMap(){
        hashTable=new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity){
        int tableSize=talbleSizeFor(capacity);
        hashTable=new Entry[tableSize];
    }

    final int talbleSizeFor(int cap){
        int n=cap-1;
        n |= n>>1;
        n |= n>>2;
        n |= n>>4;
        n |= n>>8;
        n |= n>>16;
        return (n<0) ? 1 :(n>=MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : n+1);
    }

    class Entry<K,V>{
        public K key;
        public V value;
        public Entry next;

        Entry(K k,V v){
            key=k;
            value=v;
        }
    }

    public void put(K key, V value){
        int hashCode=key.hashCode() % hashTable.length;
        Entry node=hashTable[hashCode];

        if(node==null){
            Entry newNode=new Entry(key,value);
            hashTable[hashCode]=newNode;
        }
        else{
            Entry previousNode=node;
            while(node!=null){
                if(node.key == key){
                    node.value=value;
                    return;
                }
                previousNode=node;
                node=node.next;
            }
            Entry newNode=new Entry(key,value);
            previousNode.next=newNode;
        }
    }

    public V get(K key){
        int hashCode=key.hashCode()%hashTable.length;
        Entry node=hashTable[hashCode];
        while(node!=null){
            if(node.key.equals(key)){
                return (V) node.value;
            }
            node=node.next;
        }
        return null;
    }


    public static void main(String args[]){
        MyHashMap<Integer,String> mp=new MyHashMap<Integer,String >(2);

        mp.put(1,"h1");
        mp.put(2,"bye");
        mp.put(3,"name");
        mp.put(4,"ok");

        String value=mp.get(4);
        System.out.println(value);
    }


}
