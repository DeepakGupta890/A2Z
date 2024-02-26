package POJO_API;

import java.util.List;

public class Courses {
	
	private List<WebAutomation> webAutomation; 
	// in this json have multiple set of values so we create a list for them
	private List<API> api;
	private List<Mobile> mobile;
	
	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) 
	//though this parameter is list type so we have to provide list here
	{
		this.webAutomation = webAutomation;
	}
	public List<API> getApi() {
		return api;
	}
	public void setApi(List<API> api) {
		this.api = api;
	}
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}


}
