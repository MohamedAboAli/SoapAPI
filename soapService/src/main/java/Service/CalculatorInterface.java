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
public interface CalculatorInterface {

	@WebMethod
	@WebResult(partName = "response Name")
	int add(@WebParam(partName = "first element") int x, int y);

	
	@WebMethod(exclude = true) // to make this API disappear from wsdl
	int multiple(int a, int b);

}