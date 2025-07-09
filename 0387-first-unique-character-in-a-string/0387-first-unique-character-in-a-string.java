class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char ch : s.toCharArray()){

                hashMap.put(ch, hashMap.getOrDefault(ch,0) + 1);

        }


        for(int i =0; i < s.length(); i++)
{
               if(hashMap.get(s.charAt(i)) == 1){
                return i;
               }

        }

        return -1;

    }
}