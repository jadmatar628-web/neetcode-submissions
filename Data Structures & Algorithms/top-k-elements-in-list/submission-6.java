
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> list=new HashMap<>();
        for(int num: nums){
            list.put(num,list.getOrDefault(num,0)+1);
        }
        int[] answer= new int[k];

        PriorityQueue <Map.Entry<Integer,Integer>>queue= 
        new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry: list.entrySet()){
            queue.offer(entry);
        }
        int bound=queue.size()-k;
        for(int i=0;i<bound;i++){
            queue.poll();
        }
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> temp=queue.poll();
            int key=temp.getKey();
            answer[i]=key;
        }
        return answer;
    }
}
