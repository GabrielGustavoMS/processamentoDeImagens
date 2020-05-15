import cv2 as cv

imgLena= cv.imread("lena.jpg")

cv.imshow("Janela",imgLena)

imgGrid = cv.imread("grid.png")
cv.imshow("Janela1",imgGrid)

imgAdd = cv.add(imgLena,imgGrid)
cv.imshow("Janela2",imgAdd)

cv.imwrite("imagensSaida/lenaAddGrid.jpg",imgAdd)
