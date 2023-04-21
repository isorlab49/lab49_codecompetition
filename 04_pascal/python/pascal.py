a=[]
for _ in range(20):
    a=list(map(sum,zip(a,[0]+a)))+[1]
    print(*a)