public class Persona{
	//propiedades o atributos
	String name, sexo;
	int    edad;

//metodo1
public void caminar() 
{
System.out.println(name+" Esta caminando");
}
//metodo2
public void estudiar()
{
System.out.println(name+" Esta estudiando");
}
//metodo3
public void comer(String comida)
{
System.out.println(name+" Esta comiendo"+ comida);
}
//metodo4
public void pedirCerveza(){
	if(edad >=18)
	{
		System.out.println("Dar cerveza");
	}
	else 
	{
		System.out.println("no tienes edad para tomar");
	}
}
}
//clase2
class Curso{
	public static void main(String[] args)
	{
		Persona p1 = new Persona();
		p1.name = "Juan Perez";
		p1.sexo = "M";
		p1.edad = 12;
		p1.caminar();
		p1.estudiar();
		p1.comer("Torta cubana + guacamole");
		p1.pedirCerveza();

		Persona p2 = new Persona();
		p2.name = "Beatriz";
		p2.sexo = "F";
		p2.edad = 18;
		p2.caminar();
		p2.estudiar();
		p2.comer("Tacos de pastor");
		p2.pedirCerveza();
	}
}