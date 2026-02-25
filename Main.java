/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    public static void main(String args[]) {
        
        int ano_nasciento= 1985;
        String nome = "El Pepe";
        double peso = 76.2;
        
        mostrar_dados(nome,ano_nasciento,peso);
        
        
         
    }
    
    public static void mostrar_dados (String n, int a , double p){//método mostrar dados
        System.out.println("nome = " +n);
        System.out.println("Nascimento = "  +a);
        System.out.println("Peso = "+  p);
        
    }
    
    //Objeto é um agrupamento de variaveis que fica dentro de uma classe;
    Aluno al = new Aluno();
    mostrar_dados(al);
    
	
}
/*public class Aluno{
    public void solicitar_VT(){
         diversos códigos para poder efetuar a solictação
        
    }
    public void fazer_login(int RA, int senha){
    
    
    } 
    public void pegar_livro(){
       
    }
    public void pagar_boleto(){
        
    } 
    ****/




