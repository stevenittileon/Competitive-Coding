for i in range(int(input())):
    n=int(input())
    s=input()
    sumodd, sumeven= 0,0
    st=int(s.split(" "))
    for _ in st:    
        if int(_) % 2==0:
            sumneven += st[_]
        else:
            sumodd += st[_]
    if(sumodd>sumeven):
        return (sumodd+(len(st)/2))
    else:
        return (sumeven+(len(st)/2))
