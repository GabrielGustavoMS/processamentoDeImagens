
import cv2 as cv
import numpy as np
#Lê imagem
img = cv.imread('neblina.jpg',0)
equal = cv.equalizeHist(img) #
#Concatenate concate apenas imgs de canais e tamanhos iguais
res = np.concatenate((img , equal), axis = 1)

cv.imwrite("imagensSaida/neblinaEqualizada.jpg", res)
#Mostra img na janela
cv.imshow("Neblina",res)
cv.waitKey(0)
