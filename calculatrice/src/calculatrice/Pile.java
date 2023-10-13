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
    
}
