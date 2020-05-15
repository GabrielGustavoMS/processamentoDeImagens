import cv2 as cv
import time as t
img1 = cv.imread("lena.jpg")

img2 = cv.imread("grid.png")
j = 1.0
i=0.0
result = cv.addWeighted(img1,(i),img2,(j),0)
cv.imshow("Imagem",result)
while(i<1):
    result = cv.addWeighted(img1,(i),img2,(j),0)
    cv.imshow("Imagem",result)
    cv.waitKey(10)
    t.sleep(0.0015)
    j=j-0.001
    i=i+0.001
    
    
