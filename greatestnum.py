
def max(a,b,c):
    if(a>b):
        if(a>c):
            return a
        else:
            return c
        
    else:
        if(b>c):
            return b
        else:
            return c
            
num1=230
num2=34
num3=56
c=max(num1,num2,num3)
print("the   greatest numer from the given three number is "+str(c))