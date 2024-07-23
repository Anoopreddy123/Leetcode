class Solution:
    def reverseWords(self, s: str) -> str:
        st = []
        st = s.split()
        n = len(st)
        print(st[::-1])
        result = ' '.join([str(word) for word in st[::-1]])
        return result