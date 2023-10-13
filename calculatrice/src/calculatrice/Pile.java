package calculatrice;
import java.util.Stack;


public class Pile {
    Stack<Integer> num;

    // Constructeur
    public Pile() {
        this.num = new Stack<>();
    }

    public void push(Integer a) {
        this.num.push(a);
    }
    
    public Integer pop() {
    	return this.num.pop();
    }
    
    public Integer peek(){
    	return this.num.peek();
    }
    
    public boolean estVide() {
    	return this.num.empty();
    }
    
    public Integer rechercher(Integer a) {
    	return this.num.search(a);
    }
    
}
