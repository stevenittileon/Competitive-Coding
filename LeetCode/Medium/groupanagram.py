from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic=defaultdict(list)
        for word in strs:
            dic["".join(sorted(word))].append(word)
        return dic.values()

# really good for basics in dictionary and defaultdicts
# .join helps to join the list values together