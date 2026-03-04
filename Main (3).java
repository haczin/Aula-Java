
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Aluno al = new Aluno();// ele reserva memoria na memoria ram os objetos dela 
		al.fazerLogin( 123,"Rafael",456);
		
		al.podeTirarCNH(13);
		
		
		
		
		Aluno al1=new Aluno();
		Aluno al2 = new Aluno();
		Aluno al3 = new Aluno ();
		
		
		al1.ra =123;
		al1.name ="Maria";
		
		al2.ra=456;
		al2.name="pedro";
		
		al3.ra=789;
		al3.name="Paulo";
		
		
		System.out.println("ra =" +al1.ra +"Nome =" +al1.name);
			System.out.println("ra =" +al2.ra +"Nome =" +al2.name);
				System.out.println("ra =" +al3.ra +"Nome =" +al3.name);
		
	}
}
//static é algo que nn pode ser mudado ou alterado ,nn muda de objeto para outro