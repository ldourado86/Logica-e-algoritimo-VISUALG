import java.util.Vector;

public class Vetor<T extends Number> {
	
	private T vetor1[];
	private T vetor2[];
	
	
	public Vetor(T[] vetor1, T[] vetor2) {
		super();
		this.vetor1 = vetor1;
		this.vetor2 = vetor2;
	}

	public T[] getVetor1() {
		return vetor1;
	}

	public void setVetor1(T[] vetor1) {
		this.vetor1 = vetor1;
	}

	public T[] getVetor2() {
		return vetor2;
	}

	public void setVetor2(T[] vetor2) {
		this.vetor2 = vetor2;
	}
	
	public T produtoEscalar() {
		Double produto = 0.0;
		for(int i = 0; i<vetor1.length ;i++) {
			produto+= vetor1[i].doubleValue()*vetor2[i].doubleValue();
			
		}
			return (T) produto;
	
		}	
	public <T extends Number, K extends Number> double inner_product(Vector<T> v1, Vector<K> v2) {
		double isum = 0;
		for(int i = 0; i<v1.size()&& i<v2.size();i++) {
			isum+= v1.elementAt(i).doubleValue()*v2.elementAt(i).doubleValue();
		}
		return isum;
	}
	
}
