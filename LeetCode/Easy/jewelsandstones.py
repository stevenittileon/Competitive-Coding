class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        js=set(jewels)
        count = 0
        for stone in stones:
            if stone in js:
                count += 1
        return count

# making jewels as set makes it faster to compilation
# if normal time complexity would be O(N * M)
# with set it becomes O(N + M)