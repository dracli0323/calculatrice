package calculatrice;
import java.util.Stack;
public class CalculatorModel implements CalculatorModelInterface{
	Pile Maliste;
	public Double resultat(Double a) {
		return(a);
	}
	
	public void add() {
		Double a= Maliste.pop();
		Double b=Maliste.pop();
		if (Maliste.estVide()==true){
			this.resultat(a+b);
		} else {
				Maliste.push(a+b);
			}
	}

	public void substract() {
		Double a= Maliste.pop();
		Double b=Maliste.pop();
		if (Maliste.estVide()==true){
			this.resultat(a-b);
		} else {
				Maliste.push(a-b);
			}
	}
	
	public void multiply() {
		Double a= Maliste.pop();
		Double b=Maliste.pop();
		if (Maliste.estVide()==true){
			this.resultat(a*b);
		} else {
				Maliste.push(a*b);
			}
	}
	
	public void divide() {
		Double a= Maliste.pop();
		Double b=Maliste.pop();
		if (Maliste.estVide()==true){
			this.resultat(a/b);
		} else {
				Maliste.push(a/b);
			}
	}
	
	public void opposite() {
		Double a= Maliste.pop();
		if (Maliste.estVide()==true){
			this.resultat(-1*a);
		} else {
				Maliste.push(-1*a);
			}
	}
	
	public void push(Double a) {
		Maliste.push(a);
	}
	
	public void pop() {
		Maliste.pop();
	}
	
	public void drop() {
		Maliste.peek();
	}
	
	public void swap() {
		Maliste.swap();
	}
	
	public void clear() {
		Maliste.clear();
	}
	
	
	
}