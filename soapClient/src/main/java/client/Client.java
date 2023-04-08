package client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import Service.Calculator;
import Service.CalculatorService;
import Service.CalculatorServiceLocator;

public class Client {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		CalculatorService calculatorService=new CalculatorServiceLocator();
		Calculator cal=calculatorService.getCalculatorPort();
		System.out.println(cal.add(5, 10));
	}

}
