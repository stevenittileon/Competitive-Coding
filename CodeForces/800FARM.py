n=int(input())
f=0
for i in range(n):
    k=int(input())
    while(k!=0):
        if(k%4==0):
            k=k-4
            f=f+1
        else:
            k=k-2
            f=f+1
    print(f)
    f=0