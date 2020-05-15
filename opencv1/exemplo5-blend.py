import cv2 as cv

objectImage = cv.imread("lena.jpg")

mask = cv.imread("grid.png")

result = cv.addWeighted(objectImage,0.5,mask,0.5,0)

cv.imshow("Imagem",result)
cv.waitKey(0)
cv.destroyWindow("Image")
