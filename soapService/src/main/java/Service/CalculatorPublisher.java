package Service;

import javax.xml.ws.Endpoint;

public class CalculatorPublisher {

	private static String URL = "http://localhost:8089/cal";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("service is published on URL :" + URL);
	//	Endpoint.publish(URL, new CalculatorWithInterface());
	}

}
