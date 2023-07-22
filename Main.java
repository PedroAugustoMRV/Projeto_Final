package sp.senai.br.projetofinal;

import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Main {   
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args){      
        
        Personagem personagemUm     = new Personagem();
        Personagem personagemDois   = new Personagem();
        
        Batalha    ultimateBattle   = new Batalha();  
        
        Ataque ataqueUm   = new Ataque();
        Ataque ataqueDois = new Ataque();
        
        int opcao = 0;
        
        System.out.println("Selecione [1] - Editar Personagem | [2] - Atribuir Atques - [3] - Inicia o combate");
        opcao = teclado.nextInt();
       
        switch (opcao) {
            case 1:
                ultimateBattle.setNomes();
                ultimateBattle.setClassePersonagem();
                break;

            case 2:
                 ataqueUm.setataqueUm(Double.MIN_NORMAL, Double.MIN_NORMAL, Double.NaN, Double.NaN);
                 ataqueDois.setataqueDois(Double.MIN_NORMAL, Double.MIN_NORMAL, Double.NaN, Double.NaN);
                break;

            case 3:
                ultimateBattle.setAtaqueUm(ataqueUm);
                ultimateBattle.setAtaqueDois(ataqueDois);

                while(ultimateBattle.emAndamento == true){

                    ultimateBattle.ataquePersonagemUm();

                    if(ultimateBattle.getPersonagemDois().getPontosVida() == 0.00 || ultimateBattle.getPersonagemUm().getPontosVida() == 0.00){  
                        ultimateBattle.emAndamento = false;
                    }

                    ultimateBattle.ataquePersonagemDois();

                    if(ultimateBattle.getPersonagemDois().getPontosVida() == 0.00 || ultimateBattle.getPersonagemUm().getPontosVida() == 0.00){  
                        ultimateBattle.emAndamento = false;
                    }

                }
                System.out.printf("Vida P1: %.0f \n", ultimateBattle.getPersonagemUm().getPontosVida());
                System.out.printf("Vida P2: %.0f", ultimateBattle.getPersonagemDois().getPontosVida());
                break;

            default:
                System.out.println("opcao invalida. Por favor, insira uma opcao valida.");
                break;
        }
        

       
        
        ultimateBattle.setPersonagemUm(personagemUm);
        ultimateBattle.setPersonagemDois(personagemDois); 
        
        
        
        
    }
    
}
