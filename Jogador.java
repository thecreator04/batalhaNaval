/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

public class Jogador {
    public String nome;
    public int player;
    int i;
    public String jogador;
   public Boolean venceu = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVenceu() {
        return venceu;
    }

    public void setVenceu() {
        this.venceu = venceu;
    }
      public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
    
    public void lembrete(){
    
        System.out.println("lembre-se, você precisa adicionar no máximo 10 barcos, sendo eles:\n 1 barco de 4 espaços\n" +
"2 barcos de 3 espaços\n" +
"3 barcos de 2 espaços\n" +
"4 barcos de 1 espaço");
    }
    public void montarJogo(String jogador,int i){
   this.jogador = jogador;
   this.i = i;
     System.out.println("[player"+this.i+"]:"+this.jogador+"-> por favor, indique a localização de seus barcos no plano cartesiano");
    }
   
}
