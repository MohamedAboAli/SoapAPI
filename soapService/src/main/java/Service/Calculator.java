package Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name="calculatorProject",portName = "calculatorPort",serviceName = "calculatorService"
,targetNamespace = "changeFromPackageNameToAnyThing")
@SOAPBinding(style = Style.RPC) // here to change style fro document to RPC
public class Calculator {
	
	@WebMethod
	@WebResult(partName = "response Name")
	public int add(@WebParam(partName = "first element") int x,int y) {
		return x+y;
	}
	
	@WebMethod(exclude = true) // to make this API disappear from wsdl
	public int multiple(int a,int b) {
		return a*b;
	}

}
