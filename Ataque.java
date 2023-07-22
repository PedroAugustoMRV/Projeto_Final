package sp.senai.br.projetofinal;

import java.util.Scanner;

public class Ataque {
    
    private String nome;
    private Double danoMagico;
    private Double danoFisico;
    private Double requisitoMana;
    private Double requisitoStamina;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(Double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public Double getDanoFisico() {
        return danoFisico;
    }

    public void setDanoFisico(Double danoFisico) {
        this.danoFisico = danoFisico;
    }

    public Double getRequisitoMana() {
        return requisitoMana;
    }

    public void setRequisitoMana(Double requisitoMana) {
        this.requisitoMana = requisitoMana;
    }

    public Double getRequisitoStamina() {
        return requisitoStamina;
    }

    public void setRequisitoStamina(Double requisitoStamina) {
        this.requisitoStamina = requisitoStamina;
    }
    
    public Scanner teclado = new Scanner(System.in);
    
    public void setataqueUm( Double requisitoMana, Double requisitoStamina,Double danoMagico, Double danoFisico){
        
        System.out.println("Por favor indique o requisito de mana do ataque 1");
        System.out.println("OBS: Voce tem 100 pra distripuir entre os ataques");
        
        this.requisitoMana = requisitoMana;
        requisitoMana      =  teclado.nextDouble();
        
        System.out.println("Por favor indique o requisito de Stamina do ataque 1");
        
        this.requisitoStamina = requisitoStamina;
        requisitoStamina      =  teclado.nextDouble();
        
        System.out.println("Por favor indique o requisito de Stamina do ataque 1");
        
        this.danoMagico = danoMagico;
        danoMagico      =  teclado.nextDouble();
        
        System.out.println("Por favor indique o requisito de Stamina do ataque 1");
        
        this.danoFisico = danoFisico;
        danoFisico      =  teclado.nextDouble();
        
        if(requisitoMana + requisitoStamina + danoFisico + danoMagico > 100){
            System.out.println("A SOMA DE PONTOS E MAIOR QUE 100!!");
        }
    }
    
    public void setataqueDois( Double requisitoMana, Double requisitoStamina,Double danoMagico, Double danoFisico){
        
        System.out.println("Por favor indique o requisito de mana do ataque 2");
        System.out.println("OBS: Voce tem 100 pra distripuir entre os ataques");
        
        this.requisitoMana = requisitoMana;
        requisitoMana      =  teclado.nextDouble();
        
        System.out.println("Por favor indique o requisito de Stamina do ataque 2");
        
        this.requisitoStamina = requisitoStamina;
        requisitoStamina      =  teclado.nextDouble();
        
        System.out.println("Por favor indique o requisito de Stamina do ataque 2");
        
        this.danoMagico = danoMagico;
        danoMagico      =  teclado.nextDouble();
        
        System.out.println("Por favor indique o requisito de Stamina do ataque 2");
        
        this.danoFisico = danoFisico;
        danoFisico      =  teclado.nextDouble();
        
        if(requisitoMana + requisitoStamina + danoFisico + danoMagico > 100){
            System.out.println("A SOMA DE PONTOS E MAIOR QUE 100!!");
        }
    }
    
    
}
