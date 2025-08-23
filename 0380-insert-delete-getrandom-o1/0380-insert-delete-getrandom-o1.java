class RandomizedSet {

    Map<Integer, Integer> hashMap;
    List<Integer> list;
    Random random;
    public RandomizedSet() {
        hashMap = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(hashMap.containsKey(val)){
            return false;
        }

        list.add(val);
        hashMap.put(val, list.size() - 1);

        return true;
    }
    
    public boolean remove(int val) {
        if(!hashMap.containsKey(val)){
            return false;
        }

        int index = hashMap.get(val);
        int lastVal = list.get(list.size() - 1);

        list.set(index, lastVal);
        hashMap.put(lastVal, index);

        list.remove(list.size() - 1);
        hashMap.remove(val);


        return true;
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());


        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */