class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
          Set<String> exact = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> devowelMap = new HashMap<>();
        for (String w : wordlist) {
            String lower = w.toLowerCase();
            caseMap.putIfAbsent(lower, w);
            devowelMap.putIfAbsent(devowel(lower), w);
        }
        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                ans[i] = q;
                continue;
            }
            String lower = q.toLowerCase();
            if (caseMap.containsKey(lower)) {
                ans[i] = caseMap.get(lower);
                continue;
            }
            ans[i] = devowelMap.getOrDefault(devowel(lower), "");
        }
        return ans;
    }

    private String devowel(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            char x = c;
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') x = '*';
            sb.append(x);
        }
        return sb.toString();
    }
}