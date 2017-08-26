public class SayHello 
{
	public static void main(String[] args)
	{
		//System.out.println("hola "+ args[0]+" "+ args[1]+" "+ args[2]);
		
		try{
			System.out.println("hola "+ args[0]);
		}
		catch(Exception e){
			System.out.println("la ejecucion correcta es:");
			System.out.println("java SayHello [escribe tu nombre]");
		}
	}
}