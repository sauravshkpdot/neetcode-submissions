class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            else{

                int count = map.get(ch) - 1;
                if(count == 0){
                    map.remove(ch);
                }else{
                    map.put(ch,count);
                }    
            }
        }
        // if(map.size() == 0){
        //     return true;
        // }
        // return false;
        return map.isEmpty();
    }
}
