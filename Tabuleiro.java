/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;


public class Tabuleiro {
      String [][]matriz1 = new String[10][9];
        String [][]matriz2 = new String[10][9];
        boolean concedido;
        
        public boolean verifica(int X, int Y ,int tamanho){
        if(X + tamanho > 10){
        return  concedido = false;
        }
          return false;

        }
    
    public void mostrar(int indice){
        
         for(int k=0; k<matriz1.length; k++){
             for(int l=0; l<matriz1[indice].length; l++){
                 matriz1[k][l]= "~";

                 System.out.print(matriz1[0][l] + " ");
             }
             System.out.println(matriz1[k][0]);
         }
    }
    public void posicionamentoBarco1(int x, int y, int indice){
        x = x -1;
        y = y -1;
    for(int l=0; l<matriz1.length; l++){
             for( int k=0; k<matriz1[indice].length; k++){
                 if(matriz1[l][k]!="1"){
                matriz1[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz1[l][k]= "1";
                 }
                 System.out.print(matriz1[l][k] + " ");
             
             }
              System.out.println(" ");
    
         }
    }
     public void posicionamentoBarco2(int x, int y, int indice, boolean vertical,int tamanho){
        x = x -1;
        y = y -1;
    for(int l=0; l<matriz1.length; l++){
             for( int k=0; k<matriz1[indice].length; k++){
                 if(matriz1[l][k]!="1" &&matriz1[l][k]!="2" ){
                matriz1[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz1[l][k]= "2";
                    if(vertical == true){
                        int i = l;
                      
                       int cont = 0;
                       for(i=l;cont<tamanho;i++){
                           matriz1[i][k]= "2";
                           cont++;
                       }
                    }
                    if(vertical != true){
                        int i = k;
                     
                       int cont = 0;
                       for(i=k;cont<tamanho;i++){
                           matriz1[l][i]= "2";
                           cont++;
                       }
                    }
 
                 }
                 System.out.print(matriz1[l][k] + " ");
             
             }
              System.out.println(" ");    
         }
    }
     public void posicionamentoBarco3(int x, int y, int indice, boolean vertical,int tamanho){
        x = x -1;
        y = y -1;
    for(int l=0; l<matriz1.length; l++){
             for( int k=0; k<matriz1[indice].length; k++){
                 if(matriz1[l][k]!="1" &&matriz1[l][k]!="2"&&matriz1[l][k]!="3"){
                matriz1[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz1[l][k]= "3";
                    if(vertical == true){
                        int i = l;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=l;cont<tamanho;i++){
                           matriz1[i][k]= "3";
                           cont++;
                       }
                    }
                    if(vertical != true){
                        int i = k;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=k;cont<tamanho;i++){
                           matriz1[l][i]= "3";
                           cont++;
                       }
                    }
                   
                 }
                 System.out.print(matriz1[l][k] + " ");
             
             }
              System.out.println(" ");
    
         }

    }
     public void posicionamentoBarco4(int x, int y, int indice, boolean vertical,int tamanho){
        x = x -1;
        y = y -1;
    for(int l=0; l<matriz1.length; l++){
             for( int k=0; k<matriz1[indice].length; k++){
                 if(matriz1[l][k]!="1" &&matriz1[l][k]!="2"&&matriz1[l][k]!="3" && matriz1[l][k]!="4"){
                matriz1[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz1[l][k]= "4";
                    if(vertical == true){
                        int i = l;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=l;cont<tamanho;i++){
                           matriz1[i][k]= "4";
                           cont++;
                       }
                    }
                    if(vertical != true){
                        int i = k;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=k;cont<tamanho;i++){
                           matriz1[l][i]= "4";
                           cont++;
                       }
                    } 
                 }
                 System.out.print(matriz1[l][k] + " ");
             
             }
              System.out.println(" ");   
         }      
    }
      public void mostrarjogo(){
      
      }
      public void posicionamento2Barco1(int x, int y, int indice){
        x = x -1;
        y = y -1;
    for(int l=0; l<matriz2.length; l++){
             for( int k=0; k<matriz2[indice].length; k++){
                 if(matriz2[l][k]!="1"){
                matriz2[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz2[l][k]= "1";
                     //System.out.println(matriz1[k][l]);
                 }
                 System.out.print(matriz2[l][k] + " ");
             
             }
              System.out.println(" ");   
         } 
    }
     public void posicionamento2Barco2(int x, int y, int indice, boolean vertical,int tamanho){
           x = x -1;
        y = y -1;
    for(int l=0; l<matriz2.length; l++){
             for( int k=0; k<matriz2[indice].length; k++){
                 if(matriz2[l][k]!="1" &&matriz2[l][k]!="2" ){
                matriz2[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz2[l][k]= "2";
                    if(vertical == true){
                        int i = l;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=l;cont<tamanho;i++){
                           matriz2[i][k]= "2";
                           cont++;
                       }
                    }
                    if(vertical != true){
                        int i = k;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=k;cont<tamanho;i++){
                           matriz2[l][i]= "2";
                           cont++;
                       }
                    }              
                 }
                 System.out.print(matriz2[l][k] + " ");
             
             }
              System.out.println(" ");
    
         }      
        //System.out.println(x+","+y);      
    }
     public void posicionamento2Barco3(int x, int y, int indice, boolean vertical,int tamanho){
         x = x -1;
        y = y -1;
    for(int l=0; l<matriz2.length; l++){
             for( int k=0; k<matriz2[indice].length; k++){
                 if(matriz2[l][k]!="1" &&matriz2[l][k]!="2"&&matriz2[l][k]!="3"){
                matriz2[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz2[l][k]= "3";
                    if(vertical == true){
                        int i = l;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=l;cont<tamanho;i++){
                           matriz2[i][k]= "3";
                           cont++;
                       }
                    }
                    if(vertical != true){
                        int i = k;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=k;cont<tamanho;i++){
                           matriz2[l][i]= "3";
                           cont++;
                       }
                    }                   
                 }
                 System.out.print(matriz2[l][k] + " ");             
             }
              System.out.println(" ");    
         }
      
    }
     public void posicionamento2Barco4(int x, int y, int indice, boolean vertical,int tamanho){
          x = x -1;
        y = y -1;
    for(int l=0; l<matriz2.length; l++){
             for( int k=0; k<matriz2[indice].length; k++){
                 if(matriz2[l][k]!="1" &&matriz2[l][k]!="2"&&matriz2[l][k]!="3" && matriz2[l][k]!="4"){
                matriz2[l][k]= "~";
                 }
                 if(k == x && l == y){
                  matriz2[l][k]= "4";
                    if(vertical == true){
                        int i = l;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=l;cont<tamanho;i++){
                           matriz2[i][k]= "4";
                           cont++;
                       }
                    }
                    if(vertical != true){
                        int i = k;
                       // System.out.println(i);
                       int cont = 0;
                       for(i=k;cont<tamanho;i++){
                           matriz2[l][i]= "4";
                           cont++;
                       }
                    }
                   
                   
                 }
                 System.out.print(matriz2[l][k] + " ");
             
             }
              System.out.println(" ");
    
         }
    
    }
      public void mostrar2jogo(){
      
      } 
      
      
}
