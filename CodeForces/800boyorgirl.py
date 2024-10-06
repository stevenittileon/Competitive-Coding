str=input()
st=""
for _ in str:
    if(st.count(_)>0):
        continue
    else:
        st=st+_
l=len(st)
if(l%2==0):
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")