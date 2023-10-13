package calculatrice;
import java.util.Stack;


public class Pile {
    Stack<Double> num;

    // Constructeur
    public Pile() {
        this.num = new Stack<>();
    }

    public void push(Double a) {
        this.num.push(a);
    }
    
    public Double pop() {
    	return this.num.pop();
    }
    
    public Double peek(){
    	return this.num.peek();
    }
    
    public boolean estVide() {
    	return this.num.empty();
    }
    
    public void swap() {
    	Double a=this.pop();
    	Double b=this.pop();
    	this.push(b);
    	this.push(a);
    }
    public void clear() {
    	while (this.estVide()==false){
    		this.pop();
    	}
    }
}
