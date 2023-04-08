package Service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
	
	@WebMethod
	public int add(int x,int y) {
		return x+y;
	}
	
	@WebMethod
	public int multiple(int a,int b) {
		return a*b;
	}

}
