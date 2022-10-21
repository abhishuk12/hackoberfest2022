# Python program for implementation of Bubble Sort

def bubbleSort(arr):
	n = len(arr)
	
	swapped = False

	for i in range(n-1):
		
		for j in range(0, n-i-1):

			
			if arr[j] > arr[j + 1]:
				swapped = True
				arr[j], arr[j + 1] = arr[j + 1], arr[j]
		
		if not swapped:
			
			return
# input like this 64, 34, 25, 12, 22, 11, 90  
# or remove " ',' " from the "arr" and input like this 64 34 25 12 22 11 90 
arr = list(map(int,input().split(',')))

bubbleSort(arr)

print("Sorted array is: \n")
for i in range(len(arr)):
	print("% d" % arr[i], end=" ")
print('\n')
