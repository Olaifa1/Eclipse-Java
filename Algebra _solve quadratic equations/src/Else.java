
public class Else {
 private int p;
 private int q;
 
 public Else(int firstNumber, int secondNumber) {
	 this.p = firstNumber;
	 this.q = secondNumber;
	 
	 
 }

public int getP() {
	return p;
}

public void setP(int p) {
	this.p = p;
}

public int getQ() {
	return q;
}

public void setQ(int q) {
	this.q = q;
}

public int Else(int p, int q) {
	int max = 0;
	if(p > q) {
		max = p;
	}
	if(q > p) {
		max = q;
	}
	else {
		max = max;
	}
		return max;
	}

}
