cr = 1
ad = 1
for i in range(1,6):
    for j in range(ad,ad+i):
        print(j,end=" ")
    print("")
    ad += cr
    cr += 1