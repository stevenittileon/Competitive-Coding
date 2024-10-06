
f=0
for _ in range(int(input())):
    str=input()
    if str.find("++") > -1:
        f+=1
    else:
        f-=1
print(f)