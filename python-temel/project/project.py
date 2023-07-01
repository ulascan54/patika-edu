# 1- Bir listeyi düzleştiren (flatten) fonksiyon yazın. Elemanları birden çok katmanlı listelerden ([[3],2] gibi) oluşabileceği gibi, non-scalar verilerden de oluşabilir. Örnek olarak:

# input: [[1,'a',['cat'],2],[[[3]],'dog'],4,5]

# output: [1,'a','cat',2,3,'dog',4,5]


mylist=[[1,'a',['cat'],2],[[[3]],'dog'],4,5]
def flatlist(mylist):
    l=[]
    for i in mylist:
        if isinstance(i,list):
            l.extend(flatlist(i))
        else:
            l.append(i)
    return l

mylist=[[1,'a',['cat'],2],[[[3]],'dog'],4,5]
result=flatlist(mylist)
print(result)

# 2- Verilen listenin içindeki elemanları tersine döndüren bir fonksiyon yazın. Eğer listenin içindeki elemanlar da liste içeriyorsa onların elemanlarını da tersine döndürün. Örnek olarak:

# input: [[1, 2], [3, 4], [5, 6, 7]]

# output: [[[7, 6, 5], [4, 3], [2, 1]]

l=[[1, 2], [3, 4], [5, 6, 7]]
result=[]
for i in range(len(l)-1,-1,-1):
    x=[]
    for j in range(len(l[i])-1,-1,-1):
        x.append(l[i][j])
    result.append(x)
result