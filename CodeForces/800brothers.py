n= input()
str=n.split(" ")
stk=[3,2,1]
stk.remove(int(str[0]))
stk.remove(int(str[1]))
print(stk[0])