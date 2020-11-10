/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.Scanner;
public class BatalhaNaval {

    
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
       Jogador Jogador1 = new Jogador();
        Jogador Jogador2 = new Jogador();
       char [][]matrizJOGO = new char[10][9];
       char [][]matrizJOGO2 = new char[10][9];
       int tamanho;
     
        int ataqX;
        int ataqY;
       
        int ataqV = 0;
        int ataqV2 = 0;
       String nome;
        System.out.println("insira o  nome do jogador 1");
       nome = Leitor.next();
        Jogador1.setNome(nome);
        Jogador1.setPlayer(1);
        
        System.out.println("ok, agora insira o nome do jogado2");
          nome = Leitor.next();
        Jogador2.setNome(nome);
        Jogador2.setPlayer(2);
        
          Tabuleiro matriz = new Tabuleiro();
          
       for (int i = 1; i <= 2; i++) {
            //matriz.mostrar(i);
        if(i == 1){
           Jogador1.montarJogo(Jogador1.nome, i);
           Jogador1.lembrete();
             Barco barco1pos[] = new Barco[4];
             Barco barco2pos[] = new Barco[3];
               Barco barco3pos[] = new Barco[2];
                 Barco barco4pos[] = new Barco[1];
             // matriz.mostrar(i); 
              
            for (int j = 0; j < 4; j++) {
                
              
            barco1pos[j] = new Barco();
                System.out.println("ok, vamos começar adicionando os barcos menores(de uma posição apenas) \n Lembrando(!) \n Você precisa adicionar:\n  4 barcos de 1 espaços\n"
                        + "--> você adicionou "+j+" barcos de uma posiçao ao total" );

                 System.out.println("insira a localização referente ao eixo X da onde você deseja alocar o barco");
                 barco1pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco1pos[j].localY = Leitor.nextInt();
              matriz.posicionamentoBarco1( barco1pos[j].localX, barco1pos[j].localY, j);    
            }
               
            
            for (int j = 0; j < 3; j++) {
                barco2pos[j] = new Barco();
                barco2pos[j].tamanho = 2;
               
            System.out.println("ok, agora vamos adicionar os barcos de dois espaços... \n Lembrando(!) \n Você precisa adicionar: \n  3 barcos de 2 espaços \n "
                    + "Você adicionou " + j + " barcos de dois espaços ao total.");
            
                System.out.println("Insira a localização referente ao eixo X da onde você deseja alocar o barco");
                barco2pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco2pos[j].localY = Leitor.nextInt();
                 System.out.println("ok, agora informe se você deseja com que o barco esteja na vertical(1) ou na horizontal(0)");
                 barco2pos[j].eixo = Leitor.nextInt();
                 
                 if(barco2pos[j].eixo == 1){
                 barco2pos[j].vertical = true;
                 }
                 if(barco2pos[j].eixo != 1)
                 {
                 barco2pos[j].vertical = false;
                 }
                 
                 matriz.posicionamentoBarco2( barco2pos[j].localX, barco2pos[j].localY, j, barco2pos[j].vertical, barco2pos[j].tamanho); 
            }
            for (int j = 0; j < 2; j++) {
                barco3pos[j] = new Barco();
                barco3pos[j].tamanho = 3;
            System.out.println("ok, agora vamos adicionar os barcos de três espaços... \n Lembrando(!) \n Você precisa adicionar: \n  2 barcos de 3 espaços \n "
                    + "Você adicionou " + j + " barcos ao de três espaços total.");
            
                System.out.println("Insira a localização referente ao eixo X da onde você deseja alocar o barco");
                barco3pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco3pos[j].localY = Leitor.nextInt();
                 System.out.println("ok, agora informe se você deseja com que o barco esteja na vertical(1) ou na horizontal(0)");
                 barco3pos[j].eixo = Leitor.nextInt();
                 
                 if(barco3pos[j].eixo == 1){
                 barco3pos[j].vertical = true;
                 }
                 if(barco3pos[j].eixo != 1)
                 {
                 barco3pos[j].vertical = false;
                 }
                 
                 matriz.posicionamentoBarco3( barco3pos[j].localX, barco3pos[j].localY, j, barco3pos[j].vertical, barco3pos[j].tamanho); 
            }
             for (int j = 0; j < 1; j++) {
                barco4pos[j] = new Barco();
                barco4pos[j].tamanho = 4;
            System.out.println("ok, agora vamos adicionar o barco de quatro espaços... \n Lembrando(!) \n Você precisa adicionar: \n  2 barcos de 3 espaços \n "
                    + "Você adicionou " + j + " barcos de quatro espaços ao total.");
            
                System.out.println("Insira a localização referente ao eixo X da onde você deseja alocar o barco");
                barco4pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco4pos[j].localY = Leitor.nextInt();
                 System.out.println("ok, agora informe se você deseja com que o barco esteja na vertical(1) ou na horizontal(0)");
                 barco4pos[j].eixo = Leitor.nextInt();
                 
                 if(barco4pos[j].eixo == 1){
                 barco4pos[j].vertical = true;
                 }
                 if(barco4pos[j].eixo != 1)
                 {
                 barco4pos[j].vertical = false;
                 }
                 
                 matriz.posicionamentoBarco4( barco4pos[j].localX, barco4pos[j].localY, j, barco4pos[j].vertical, barco4pos[j].tamanho); 
            }   
            //System.out.println(matriz);     
          }
        if(i == 2){
            System.out.println("vez do jogador 2");
             //Jogador2.montarJogo(Jogador2.nome, i);
           Jogador2.lembrete();
             Barco barco1pos[] = new Barco[4];
             Barco barco2pos[] = new Barco[3];
               Barco barco3pos[] = new Barco[2];
                 Barco barco4pos[] = new Barco[1];
        
              
            for (int j = 0; j < 4; j++) {  
            barco1pos[j] = new Barco();
                System.out.println("ok, vamos começar adicionando os barcos menores(de uma posição apenas) \n Lembrando(!) \n Você precisa adicionar:\n  4 barcos de 1 espaços\n"
                        + "--> você adicionou "+j+" barcos ao total" );
                 System.out.println("insira a localização referente ao eixo X da onde você deseja alocar o barco");
                 barco1pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco1pos[j].localY = Leitor.nextInt();
              matriz.posicionamento2Barco1( barco1pos[j].localX, barco1pos[j].localY, j);    
            }
            for (int j = 0; j < 3; j++) {
                barco2pos[j] = new Barco();
                barco2pos[j].tamanho = 2;
                tamanho = 2;
               
            System.out.println("ok, agora vamos adicionar os barcos de dois espaços... \n Lembrando(!) \n Você precisa adicionar: \n  3 barcos de 2 espaços \n "
                    + "Você adicionou " + j + " barcos de dois espaços ao total.");
            
                System.out.println("Insira a localização referente ao eixo X da onde você deseja alocar o barco");
                barco2pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco2pos[j].localY = Leitor.nextInt();
                 System.out.println("ok, agora informe se você deseja com que o barco esteja na vertical(1) ou na horizontal(0)");
                 barco2pos[j].eixo = Leitor.nextInt();
                 
                 if(barco2pos[j].eixo == 1){
                 barco2pos[j].vertical = true;
                 }
                 if(barco2pos[j].eixo != 1)
                 {
                 barco2pos[j].vertical = false;
                 }
                 
                 matriz.posicionamento2Barco2( barco2pos[j].localX, barco2pos[j].localY, j, barco2pos[j].vertical, barco2pos[j].tamanho); 
            }
            for (int j = 0; j < 2; j++) {
                barco3pos[j] = new Barco();
                barco3pos[j].tamanho = 3;
            System.out.println("ok, agora vamos adicionar os barcos de três espaços... \n Lembrando(!) \n Você precisa adicionar: \n  2 barcos de 3 espaços \n "
                    + "Você adicionou " + j + " barcos de três espaços ao total.");
            
                System.out.println("Insira a localização referente ao eixo X da onde você deseja alocar o barco");
                barco3pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco3pos[j].localY = Leitor.nextInt();
                 System.out.println("ok, agora informe se você deseja com que o barco esteja na vertical(1) ou na horizontal(0)");
                 barco3pos[j].eixo = Leitor.nextInt();
                 
                 if(barco3pos[j].eixo == 1){
                 barco3pos[j].vertical = true;
                 }
                 if(barco3pos[j].eixo != 1)
                 {
                 barco3pos[j].vertical = false;
                 }
                 
                 matriz.posicionamento2Barco3( barco3pos[j].localX, barco3pos[j].localY, j, barco3pos[j].vertical, barco3pos[j].tamanho); 
            }
             for (int j = 0; j < 1; j++) {
                barco4pos[j] = new Barco();
                barco4pos[j].tamanho = 4;
            System.out.println("ok, agora vamos adicionar o barco de quatro espaços... \n Lembrando(!) \n Você precisa adicionar: \n  2 barcos de 3 espaços \n "
                    + "Você adicionou " + j + " barcos de 4 espaços ao total.");
            
                System.out.println("Insira a localização referente ao eixo X da onde você deseja alocar o barco");
                barco4pos[j].localX = Leitor.nextInt();
                 System.out.println("ok, agora insira a localização referente ao eixo Y da onde você deseja alocar o barco");
                 barco4pos[j].localY = Leitor.nextInt();
                 System.out.println("ok, agora informe se você deseja com que o barco esteja na vertical(1) ou na horizontal(0)");
                 barco4pos[j].eixo = Leitor.nextInt();
                 
                 if(barco4pos[j].eixo == 1){
                 barco4pos[j].vertical = true;
                 }
                 if(barco4pos[j].eixo != 1)
                 {
                 barco4pos[j].vertical = false;
                 }
                 
                 matriz.posicionamento2Barco4( barco4pos[j].localX, barco4pos[j].localY, j, barco4pos[j].vertical, barco4pos[j].tamanho); 
            }
        }
       }
              System.out.println("------------------------------------------------------------");
                System.out.println(" este é o jogo do jogador 1");
               for (int l = 0; l < matriz.matriz1.length; l++)  {  
                    for (int c = 0; c < matriz.matriz1[0].length; c++)     { 
                        System.out.print(matriz.matriz1[l][c] + " "); //imprime caracter a caracter
                    }  
                    System.out.println(" "); //muda de linha
                  }
              System.out.println("------------------------------------------------------------");
                System.out.println(" este é o jogo do jogador 2");
               for (int l = 0; l < matriz.matriz2.length; l++)  {  
                    for (int c = 0; c < matriz.matriz2[0].length; c++)     { 
                        System.out.print(matriz.matriz2[l][c] + " "); //imprime caracter a caracter
                    }  
                    System.out.println(" "); //muda de linha
                  } 
            //System.out.println(matriz);          
        System.out.println("EEEEEEE... COMEÇA O JOGO \n BOA SORTE AOS DOIS JOGADORES");
         //System.out.println("ataqV = " + ataqV + " ataqV2 = " + ataqV2);
       for(int j = 1; j <= 3; j++ ){
           
           if( j == 1){
           System.out.print("vez do [player1] jogar \n --> "  + Jogador1.nome + ", ");
               System.out.println("insira um valor para o eixo x para efetuar o ataque");
               ataqX = Leitor.nextInt();
               System.out.println("insira um valor para o eixo y para efetuar o ataque");
               ataqY = Leitor.nextInt();
               
               ataqX= ataqX-1;
               ataqY= ataqY-1;
               
for (int l = 0; l < matriz.matriz2.length; l++)  {  
       for (int c = 0; c < matriz.matriz2[0].length; c++)     { 
           
           if(matrizJOGO[l][c]!='1' && matrizJOGO[l][c]!='2' && matrizJOGO[l][c]!='3' && matrizJOGO[l][c]!='4' && matrizJOGO[l][c]!='~'){
           matrizJOGO[l][c] = '*';
           }
          if( l == ataqY && c == ataqX ){
              if(matriz.matriz2[l][c]=="~"){
              matrizJOGO[l][c] = '~';
              
              }
              if(matriz.matriz2[l][c]=="1"){
              matrizJOGO[l][c] = '1';
              
                j = j-1;
                ataqV++;
              
              }
              if(matriz.matriz2[l][c]=="2"){
              matrizJOGO[l][c] = '2';
              
                j = j-1;
                ataqV++;
              
              }
              if(matriz.matriz2[l][c]=="3"){
              matrizJOGO[l][c] = '3';
               
                j = j-1;
                ataqV++;              
              }
              if(matriz.matriz2[l][c]=="4"){
              matrizJOGO[l][c] = '4';               
                j = j-1;
                ataqV++;              
              }                                        
          }
           System.out.print(matrizJOGO[l][c] + "  ");                             
       }  
       System.out.println(" "); //muda de linha
     }          
           }                     
           if(j ==2){
               System.out.print("vez do [player2] jogar \n --> " + Jogador2.nome + ", ");
               System.out.println("insira um valor para o eixo x para efetuar o ataque");
               ataqX = Leitor.nextInt();
               System.out.println("insira um valor para o eixo y para efetuar o ataque");
               ataqY = Leitor.nextInt();               
               ataqX= ataqX-1;
               ataqY= ataqY-1;               
for (int l = 0; l < matriz.matriz1.length; l++)  {  
       for (int c = 0; c < matriz.matriz1[0].length; c++)     { 
           
           if(matrizJOGO2[l][c]!='1' && matrizJOGO2[l][c]!='2' && matrizJOGO2[l][c]!='3' && matrizJOGO2[l][c]!='4' && matrizJOGO2[l][c]!='~'){
           matrizJOGO2[l][c] = '*';
           }
          if( l == ataqY && c == ataqX ){
              if(matriz.matriz1[l][c]=="~"){
              matrizJOGO2[l][c] = '~';
              j = j -2;
              
              }
              if(matriz.matriz1[l][c]=="1"){
              matrizJOGO2[l][c] = '1';                
                j = j-1;
                ataqV2++;             
              }
              if(matriz.matriz1[l][c]=="2"){
              matrizJOGO2[l][c] = '2';
               
                j = j-1;
                ataqV2++;              
              }
              if(matriz.matriz1[l][c]=="3"){
              matrizJOGO2[l][c] = '3';              
                j = j-1;
                ataqV2++;                                   
              }
              if(matriz.matriz1[l][c]=="4"){
              matrizJOGO2[l][c] = '4';
              
                j = j-1;
                ataqV2++;             
              }                   
          }
           System.out.print(matrizJOGO2[l][c] + "  ");  
       }  
       System.out.println(" "); //muda de linha
     } 
 
           } 
       
       System.out.println("ataqV = " + ataqV + " ataqV2 = " + ataqV2);
       if(ataqV > 19 || ataqV2 >19){
           j = 3;
       }
       }
        System.out.println("acabou o jogo");
        if(ataqV2>19){
             System.out.println("O JOGADOR 2 VENCEU!!!");
            System.out.println("parabéns " + Jogador2.getNome() + " pela bela partida");
        }
        if(ataqV > 19){
            System.out.println("O JOGADOR 1 VENCEU!!!");
            System.out.println("parabéns " + Jogador1.getNome() + " pela bela partida");
        }
    }
}
    


