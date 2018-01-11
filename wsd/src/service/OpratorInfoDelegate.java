package service;

import javax.jws.WebParam;

@javax.jws.WebService(targetNamespace = "http://service/", serviceName = "OpratorInfoService", portName = "OpratorInfoPort")

public class OpratorInfoDelegate {

	service.OpratorInfo opratorInfo = new service.OpratorInfo();

	public String getName(@WebParam(name = "name") String name) {
		return opratorInfo.getName(name);
	}

}