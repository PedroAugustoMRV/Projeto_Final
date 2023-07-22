
package sp.senai.br.projetofinal;


public class classePersonagem {
    
    public String nomeClass;
    public Double pontosVida;
    public Double pontosMana;
    public Double pontosStamina;
    public Double forca;
    public Double energia;
    public Double agilidade;
    public Double vitalidade;
    
    public static classePersonagem Mago(){
        
        classePersonagem personagemClasse = new classePersonagem();
        
        personagemClasse.nomeClass     = "MagoPika";
        personagemClasse.pontosVida    = 100.00;
        personagemClasse.pontosMana    = 350.00;
        personagemClasse.pontosStamina = 50.00;
        personagemClasse.forca         = 10.00;
        personagemClasse.energia       = 250.00; 
        personagemClasse.agilidade     = 30.00; 
        personagemClasse.vitalidade    = 20.00;
            
            
            
        
        return personagemClasse;
    }
    
    public static classePersonagem Duelista(){
        
        classePersonagem personagemClasse = new classePersonagem();
        
        personagemClasse.nomeClass     = "DuelistaPika";
        personagemClasse.pontosVida    = 100.00;
        personagemClasse.pontosMana    = 100.00;
        personagemClasse.pontosStamina = 50.00;
        personagemClasse.forca         = 350.00;
        personagemClasse.energia       = 350.00; 
        personagemClasse.agilidade     = 30.00; 
        personagemClasse.vitalidade    = 20.00;
            
            
            
        
        return personagemClasse;
    }
    
    public static classePersonagem Iron(){
        
        classePersonagem personagemClasse = new classePersonagem();
        
        personagemClasse.nomeClass     = "IronPika";
        personagemClasse.pontosVida    = 100.00;
        personagemClasse.pontosMana    = 100.00;
        personagemClasse.pontosStamina = 50.00;
        personagemClasse.forca         = 10.00;
        personagemClasse.energia       = 250.00; 
        personagemClasse.agilidade     = 30.00; 
        personagemClasse.vitalidade    = 350.00;
            
            
            
        
        return personagemClasse;
    }
    
    public static classePersonagem Faker(){
        
        classePersonagem personagemClasse = new classePersonagem();
        
        personagemClasse.nomeClass     = "FakePika";
        personagemClasse.pontosVida    = 100.00;
        personagemClasse.pontosMana    = 100.00;
        personagemClasse.pontosStamina = 50.00;
        personagemClasse.forca         = 10.00;
        personagemClasse.energia       = 250.00; 
        personagemClasse.agilidade     = 350.00; 
        personagemClasse.vitalidade    = 20.00;
            
            
            
        
        return personagemClasse;
    }
}
