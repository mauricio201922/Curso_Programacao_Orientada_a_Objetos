package calculoNotas;

public class CalculoNotasAluno {
	
	public String aluno;
	public double n1, n2, n3;
	
	public double notaTotal() {
		
		return n1 + n2 + n3;
		
	}
	
	public double notaPrecisava() {
		
		return 60-notaTotal();
		
	}

}
