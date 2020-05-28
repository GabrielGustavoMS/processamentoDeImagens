import cv2 as cv
import numpy as np

img = cv.imread('rabisco.jpg')

mask = cv.imread('mascara.jpg',0)

tirar_risco = cv.inpaint(img,mask,3,cv.INPAINT_TELEA)

res = np.concatenate((img, tirar_risco), axis =1)

cv.imwrite('rabiscada_x_mascara.jpg', res)

cv.imshow('Tirar Rabisco', res)

cv.waitKey(0)
cv.destroyAllWindows()
