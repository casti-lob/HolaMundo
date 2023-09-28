package utility;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class Calculadora {
	
	private double num2;
	private double num1;
	private int oper;
	
	public double calculo() {
		double resultado =0;
		if(this.oper==1) {
			resultado = this.num1+this.num2;
		}else if(this.oper==2) {
			resultado = this.num1-this.num2;
		}
		return resultado;
	}
	
	
	
}
