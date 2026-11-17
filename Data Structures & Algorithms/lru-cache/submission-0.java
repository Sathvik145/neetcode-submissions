class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }

    }
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
         head=new Node(0,0);
         tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    private void remove(Node node){
        Node pre=node.prev;
        Node nex=node.next;

        pre.next=nex;
        nex.prev=pre;
    }
    private void insert(Node node){
        Node nex=head.next;
       head.next=node;
       node.prev=head;

       node.next=nex;
       nex.prev=node;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            node.value=value;
            insert(node);
        }else{
            Node node=new Node(key,value);
            
            map.put(key,node);
            insert(node);
            if(map.size()>capacity){
                Node lru=tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
        }
    }
}
