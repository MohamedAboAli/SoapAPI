package Service;

import javax.jws.WebService;

@WebService(endpointInterface = "Service.CalculatorInterface") // must to add to check all webserivce annotation from interface
public class CalculatorWithInterface implements CalculatorInterface {
	

	public int add( int x,int y) {
		return x+y;
	}
	
	
	public int multiple(int a,int b) {
		return a*b;
	}

}
