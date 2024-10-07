c=input()
up, low= 0, 0
for _ in c:
    if(_.isupper() == True):
        up+=1
    else:
        low+=1
if(up > low):
    print(c.upper())
else:
    print(c.lower())