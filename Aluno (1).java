public class Aluno{
    int ra;
    String name ;
    int senha;
    
    int idade ;
    
    
    
    
    public void fazerLogin(int r,String n,int s ){
        
        
        if(r==123 && s==456){
            System.out.println("Autorizado!!!" +n);
                
            }else{
                System.out.println("Negado vadia !"+n);
            }
        }
        public void podeTirarCNH(int i){
            if(i<18 ){
                System.out.println("Não pode tirar CNH FI");
            }else{
                System.out.println("Tá podendo em...");
            }
            
        }
        
      
    }
//void nn retorna nada    
//int Senha = Integer.parseInt(senha);-> passar de string para número
