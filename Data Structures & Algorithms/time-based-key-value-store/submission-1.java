class TimeMap {
    static class Entry{
        int time;
        String val;
        public Entry(int time, String val){
            this.time=time;
            this.val=val;
        }
    }
    Map<String,ArrayList<Entry>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Entry e= new Entry(timestamp,value);
        if(map.containsKey(key)){
            ArrayList<Entry>temp=map.get(key);
            temp.add(e);
        }else{
            ArrayList<Entry> n= new ArrayList<>();
            n.add(e);
            map.put(key,n);
        }
    }
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        else{
            ArrayList<Entry> t = map.get(key);
            int left=0;
            int right=t.size()-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(t.get(mid).time>timestamp){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            String toBeReturned=null;
            if(left>=1){
                toBeReturned=t.get(left-1).val;}
            if(left==0){
                return "";
            }
            return toBeReturned;
        }
    }
}
