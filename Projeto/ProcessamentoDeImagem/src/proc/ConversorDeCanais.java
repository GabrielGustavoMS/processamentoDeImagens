/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proc;


import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;
import java.io.File;//Para manipular arquivos
import java.awt.image.BufferedImage;
import java.net.URISyntaxException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Gabriel Gustavo
 */
public class ConversorDeCanais {
    public static String toGrayScale(String urlOrigem,String nomeImgOriginal,String urlDestino) {
        try{
           
           
            File arquivoDeEntrada = new File(urlOrigem);
            System.out.println(arquivoDeEntrada.getAbsoluteFile());
           
            BufferedImage imagem = ImageIO.read(arquivoDeEntrada);
            BufferedImage imagemResultado = new BufferedImage(imagem.getWidth(),imagem.getHeight(),BufferedImage.TYPE_INT_RGB);
            
            //Graphics2d é uma classe q extende Graphics e permite manipular "Formas e 2D"
            Graphics2D grafico = imagemResultado.createGraphics();
            grafico.drawImage(imagem,0,0, Color.WHITE,null);
            
            for(int i = 0; i < imagemResultado.getHeight();i++){
               
                for(int j = 0; j<imagemResultado.getWidth();j++){
                    //Note q ao percorrer uma imagem, as "cordenadas são invertidas" 
                    //De cima para baixo, da esquerda para direita
                    Color corDoPixel = new Color(imagemResultado.getRGB(j, i));
                    int canalVermelho = (int) (corDoPixel.getRed());
                    int canalVerde = (int) (corDoPixel.getGreen());
                    int canalAzul = (int) (corDoPixel.getBlue());
                    int mediaDosCanais = (canalVermelho+canalVerde+canalAzul)/3;
                    Color novaCorDoPixel = new Color(mediaDosCanais,mediaDosCanais,mediaDosCanais);
                    
                    imagemResultado.setRGB(j, i, novaCorDoPixel.getRGB());                    
                }
            }
            String endSaida =urlDestino+"/"+nomeImgOriginal+"-grayScale.png";
            File arquivoDeSaida = new File(endSaida);
            ImageIO.write(imagemResultado,"png",arquivoDeSaida);
            return endSaida;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
        
    }
    public static String toBlackAndWhite(String urlOrigem,String nomeImgOriginal,String urlDestino) {
        try{
           
           
            File arquivoDeEntrada = new File(urlOrigem);
            System.out.println(arquivoDeEntrada.getAbsoluteFile());
           
            BufferedImage imagem = ImageIO.read(arquivoDeEntrada);
            BufferedImage imagemResultado = new BufferedImage(imagem.getWidth(),imagem.getHeight(),BufferedImage.TYPE_INT_RGB);
            
            //Graphics2d é uma classe q extende Graphics e permite manipular "Formas e 2D"
            Graphics2D grafico = imagemResultado.createGraphics();
            grafico.drawImage(imagem,0,0, Color.WHITE,null);
           
            for(int i = 0; i < imagemResultado.getHeight();i++){
                for(int j = 0; j<imagemResultado.getWidth();j++){
                    //Note q ao percorrer uma imagem, as "cordenadas são invertidas" 
                    //De cima para baixo, da esquerda para direita
                    Color corDoPixel = new Color(imagemResultado.getRGB(j, i));
                    int canalVermelho = (int) (corDoPixel.getRed());
                    int canalVerde = (int) (corDoPixel.getGreen());
                    int canalAzul = (int) (corDoPixel.getBlue());
                    int mediaDosCanais = (canalVermelho+canalVerde+canalAzul)/3;
                    if(mediaDosCanais>127){
                        mediaDosCanais=255;
                    }else{
                        mediaDosCanais = 0;
                    }
                    Color novaCorDoPixel = new Color(mediaDosCanais,mediaDosCanais,mediaDosCanais);
                    
                    imagemResultado.setRGB(j, i, novaCorDoPixel.getRGB());                    
                }
            }
            
            String end = urlDestino+"/"+nomeImgOriginal+"-black-and-white.png";
            File arquivoDeSaida = new File(end);
            ImageIO.write(imagemResultado,"png",arquivoDeSaida);
            return end;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
