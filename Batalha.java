/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projetofinal;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Batalha {
    
    private int qtdTurnoLimite;
    private int qtdTurnoAtual;
    
    private Personagem personagemUm;
    private Personagem personagemDois;
    
    private Ataque ataqueUm;
    private Ataque ataqueDois;
    
    private int personagemUmVitorias;
    private int personagemDoisVitorias;
    
    public boolean emAndamento = true;

    public int getQtdTurnoLimite() {
        return qtdTurnoLimite;
    }

    public void setQtdTurnoLimite(int qtdTurnoLimite) {
        this.qtdTurnoLimite = qtdTurnoLimite;
    }

    public int getQtdTurnoAtual() {
        return qtdTurnoAtual;
    }

    public void setQtdTurnoAtual(int qtdTurnoAtual) {
        this.qtdTurnoAtual = qtdTurnoAtual;
    }

    public Personagem getPersonagemUm() {
        return personagemUm;
    }

    public void setPersonagemUm(Personagem personagemUm) {
        this.personagemUm = personagemUm;
    }

    public Personagem getPersonagemDois() {
        return personagemDois;
    }

    public void setPersonagemDois(Personagem personagemDois) {
        this.personagemDois = personagemDois;
    }

    public int getPersonagemUmVitorias() {
        return personagemUmVitorias;
    }

    public void setPersonagemUmVitorias(int personagemUmVitorias) {
        this.personagemUmVitorias = personagemUmVitorias;
    }

    public int getPersonagemDoisVitorias() {
        return personagemDoisVitorias;
    }

    public void setPersonagemDoisVitorias(int personagemDoisVitorias) {
        this.personagemDoisVitorias = personagemDoisVitorias;
    }
    
    public void ataquePersonagemUm()
    {
        this.personagemUm.consumirMana(this.ataqueUm.getRequisitoMana());
        this.personagemUm.consumirStamina(this.ataqueUm.getRequisitoStamina());

        this.personagemDois.sofrerDanoFisico(this.ataqueUm.getDanoFisico());
        this.personagemDois.sofrerDanoMagico(this.ataqueUm.getDanoMagico());
        
        System.out.printf(" %s atacou > %s \n",this.personagemUm.getNome(),this.personagemDois.getNome());
    }
    
    public void ataquePersonagemDois()
    {
        this.personagemDois.consumirMana(this.ataqueDois.getRequisitoMana());
        this.personagemDois.consumirStamina(this.ataqueDois.getRequisitoStamina());

        this.personagemUm.sofrerDanoFisico(this.ataqueDois.getDanoFisico());
        this.personagemUm.sofrerDanoMagico(this.ataqueDois.getDanoMagico());
        
       System.out.printf(" %s atacou > %s \n",this.personagemDois.getNome(),this.personagemUm.getNome());
    }

    public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
    public Scanner teclado = new Scanner(System.in);
    
    public void setNomes(){
       
        System.out.println("Qual o nome do primeiro personagem");
        String Nome1 = teclado.next();
        
        this.personagemUm.setNome(Nome1);
        
        teclado.nextLine();
        
        System.out.println("Qual o nome do segunda personagem");
        String Nome2 = teclado.nextLine();
        
         this.personagemDois.setNome(Nome2);
    }
    
    public void setClassePersonagem(){
        System.out.println("Por favor qual seria a sua class para o persornagem 1");
        System.out.println("[1] - Mago | [2] Duelista | [3] Iron | [4] Fake");
        
        int Class = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Por favor qual seria a sua class para o persornagem 2");
        System.out.println("[1] - Mago | [2] Duelista | [3] Iron | [4] Fake");
        
        int Class_2 = teclado.nextInt();
        
        if(Class == 1){
            this.personagemUm.setClassePersonagem(classePersonagem.Mago());
        }
        else if(Class == 2){
            this.personagemUm.setClassePersonagem(classePersonagem.Duelista());
        }
        else if(Class == 3){
            this.personagemUm.setClassePersonagem(classePersonagem.Iron());
        }
        else if(Class == 4){
            this.personagemUm.setClassePersonagem(classePersonagem.Faker());
        }
        else {
            System.out.println("Classe selecionada incorreta!!!");
        }
        
        if(Class_2 == 1){
            this.personagemDois.setClassePersonagem(classePersonagem.Mago());
        }
        else if(Class_2 == 2){
            this.personagemDois.setClassePersonagem(classePersonagem.Duelista());
        }
        else if(Class_2 == 3){
            this.personagemDois.setClassePersonagem(classePersonagem.Iron());
        }
        else if(Class_2 == 4){
            this.personagemDois.setClassePersonagem(classePersonagem.Faker());
        }
        else {
            System.out.println("Classe selecionada incorreta!!!");
        }
    }
    
}
