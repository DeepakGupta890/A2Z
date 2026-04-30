package Selenium;

public class LocatorShadowRoot {
	
	
	/*Shadow DOM (Advanced)
	Note: Selenium needs JavaScriptExecutor for this. Shadow DOM elements are not directly accessible with normal findElement.

	HTML:

	html
	Copy
	Edit
	<custom-component>
	  #shadow-root
	  <input id="secretInput" type="text">
	</custom-component>
	Challenge:
	Access the hidden input inside Shadow DOM.

	Solution:

	java
	Copy
	Edit
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement shadowHost = driver.findElement(By.cssSelector("custom-component"));
	SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
	WebElement shadowInput = shadowRoot.findElement(By.cssSelector("#secretInput"));
	*/

}
