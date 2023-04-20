a=[]
for i in range(20):
    a.append(1)
    b = a.copy()
    for i in range(1,len(b)-1):a[i]=b[i]+b[i-1]
    print(*a)