package SeleniumSessions;

public class Custom_Xpath_1 {

	public static void main(String[] args) {
		
		
		//xpath : adress of webElement
		
		//1.absolute Xpath  
		// to reach last element  using from top . 
		//which will start  top node. //html/body/div/div/[2]/div[3]/ul/li/a
		// it is not recommended absolute path can be change frequently . 
		
		// 2.Relative Xpath . Custom Xpath.Xpath Features and functions/Xpath Axes. 
		// powerful . we are not depended parent 
		// first rule is starting with Tag then attribute name and value
		// tag[@attr='value']  //Everybrowser has different Xpath. 	
		//input[@id='username'] 
		// CTrl +F 
		
		//Multiple attribute 
		//input[@type='email' and @id='username']
		//input[@type and @id] valid but not uniqie
		//input[@class='form-control private-form__control login-email']
		//input[@class='login-email'] - not valid with by class
		//form[@id='hs-login']/div/div/div/div/input[@id='username'] 
		//form[@id='hs-login']//input[@id='username'] 
		//ul[@class='footer-nav']/li/a interract with multiple elements Findelements 
		//select[@id='Form_submitForm_Industry']/option -21 child (direct)
		//select[@id='Form_submitForm_Industry']//option -21 child  ( direct +indirect elements)
		
		//contains: 
		
		//we use on dinamic values   contain we pay attention common . we make sure 
		// input id ="username_123"
		// input id ="username_234"
		
		//formula : //tag[contains(@id,'username')] also valid //input[contains(@id,'user')]
		
		//tag[contains(@id,'username') and @type='email'] 
		//input[contains(@id,'username') and @type]
		
		//text() . useful for span headings
		
		//p[@class='sub-text']
		
		//a[text()='Platform']
		
		//a[text()='Platform' @class='nav']
		
		//div[text()='No credit card required']
		
		//a[text()='No credit card required']
		
		//a[contains(text),'Platform']	useful for dynamic 
		
		
		//starts-with 
		
		//input[starts-with(@id,'user')] 
		// (//div[@class='private-form__control-wrapper'])[1] this is valid xpath and collection first element
		//div[@class='input-group']//input)[position()=1] will give you exact position. 
		//(div[@class='input-group']//input)[last()] - will give you last element from the group 
		
	
		
	} 

}
