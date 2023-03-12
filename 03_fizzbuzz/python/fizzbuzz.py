for i in range(1,101):
    f=i%3
    b=i%5
    f=('',str(i))[f*b>0]+('Fizz','')[f>0]+('Buzz','')[b>0]
    print((f,i)[f==''])


