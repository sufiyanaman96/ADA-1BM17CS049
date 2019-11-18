n=int(input("enter number of coins : "))
coins=[0]
for i in range(n) :
    coins.append(int(input("enetr value : ")))

A = int(input("enter the sum to be made "))

def coinchange(d,c,s):
    c[0]=0
    s[0]=0
    for p in range(1,A+1) :
        mini = 9999999
        for i in range(1,n+1) :
            if d[i]<=p :
                if 1+c[p-d[i]]<mini :
                    mini = 1 + c[p - d[i]];
                    coin = i
        c.append(0)
        s.append(0)
        c[p],s[p]= mini,coin

def coinset(d,s) :
    a=A
    while(a>0) :
        print("use coin of denomination  : ",d[s[a]])
        a-=d[s[a]]


def dispaly (arr) :
    for c in range(0,A+1) :
        print(arr[c])


c=[0]*A
s=[0]*A
coinchange(coins,c,s)
print("min coins is ",c[A])
coinset(coins,s)
© 2019 GitHub, Inc.
