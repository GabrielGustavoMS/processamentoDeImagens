#Importa biblioteca de processamento de img
import cv2 as cv
#Lê imagem - Se 1 - Colorida - Se 0 - Tons de cinza
img = cv.imread('mario.png',0)
# imprime larg, alt e canais - Para pegar apenas uma info - [id]
#Ex. print(img.shape[0])
print(img.shape)
print(img.shape[0])
# Mostra img na janela
cv.imshow("My img",img)
#Salva img no disco
cv.imwrite("imagensSaida/mario-tons-de-cinza.jpg",img)
#cv.waitKey(0)
