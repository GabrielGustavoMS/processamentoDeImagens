import cv2 as cv

imgLena= cv.imread("lena.jpg")

cv.imshow("Janela",imgLena)

imgGrid = cv.imread("grid.png")
cv.imshow("Janela1",imgGrid)

imgSub = cv.subtract(imgLena,imgGrid)
cv.imshow("Janela2",imgSub)

cv.imwrite("imagensSaida/lenaSubGrid.jpg",imgSub)
