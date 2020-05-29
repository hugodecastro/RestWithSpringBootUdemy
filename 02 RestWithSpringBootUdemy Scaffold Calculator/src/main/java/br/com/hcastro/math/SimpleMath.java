package br.com.hcastro.math;

public class SimpleMath {
	
	public Double sum(Double firstNumer, Double secondNumer) {
		return firstNumer + secondNumer;
	}
	
	public Double sub(Double firstNumer, Double secondNumer) {
		return firstNumer - secondNumer;
	}
	
	public Double multi(Double firstNumer, Double secondNumer) {
		return firstNumer * secondNumer;
	}
	
	public Double div(Double firstNumer, Double secondNumer) {
		return firstNumer / secondNumer;
	}

	public Double med(Double firstNumer, Double secondNumer) {
		return (firstNumer + secondNumer) / 2;
	}

	public Double pow(Double firstNumer, Double secondNumer) {
		return Math.pow(firstNumer, secondNumer);
	}

	public Double sqrt(Double firstNumer) {
		return Math.sqrt(firstNumer);
	}

}
