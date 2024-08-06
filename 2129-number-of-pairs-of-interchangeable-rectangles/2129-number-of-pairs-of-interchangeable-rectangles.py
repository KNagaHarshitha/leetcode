class Solution:
    def interchangeableRectangles(self, rectangles: List[List[int]]) -> int:
        ans=0
        cnt=Counter()
        for w,h in rectangles:
            g = gcd(w,h)
            w = w//g
            h = h//g
            ans += cnt[(w,h)]
            cnt[(w,h)] += 1
        return ans    
