f=0
for i in range(int(input())):
    s=input()
    st=s.split(" ")
    if (int(st[1]) - int(st[0])) >=2:
        f+=1
print(f)