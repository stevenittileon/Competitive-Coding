n=input()
str=n.split(" ")
st=[]
i=0
k=0
tr=240-int(str[1])
for i in range(1,int(str[0])+1):
    tr=tr-5*i
    if(tr<0):
        k=k+1
        break
if(k>0):
    print(i-1)
else:
    print(i)
