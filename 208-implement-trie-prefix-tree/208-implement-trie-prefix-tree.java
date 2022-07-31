class Trie {
    List<String> list;

    public Trie() {
        list=new ArrayList<>();
        
    }
    
    public void insert(String word) {
        list.add(word);
    }
    
    public boolean search(String word) {
        return list.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        boolean ans=false;
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String str=iterator.next();
            if(str.length()<prefix.length())
                continue;
            if(str.startsWith(prefix)){
                ans=true;
                break;
            }   
        }
        return ans;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */