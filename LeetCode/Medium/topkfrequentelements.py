class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count={}
        freq=[[] for i in range(len(nums)+1)]

        for n in nums: #loops to get the count of elements
            count[n]=1+count.get(n,0)

        for n,c in count.items():#loops to add them into the frequency array
            freq[c].append(n)

        res=[]
        for i in range(len(freq)-1, 0, -1): #loop to display top k frequencies
            for n in freq[i]:
                res.append(n)
                if(len(res)==k):
                    return res