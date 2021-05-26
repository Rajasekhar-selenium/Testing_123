package interfaceconcept;

public class Interf implements Inter
{

	@Override
	public void color() {
		System.out.println("black/grey/red");
		
	}

	@Override
	public void gears() {
		System.out.println("5/6/4/no");
		
	}

	@Override
	public void millage() {
		
		System.out.println("50/60/40");
	}
	
	public static void main(String[] args) 
	{
		Interf a = new Interf();
		
		a.color();
		
		a.gears();
		
		a.millage();
		
	}
   

}
