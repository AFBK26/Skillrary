package skillRaryapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Testingpage {
	//Duration
	@FindBY(xpath ="//h1[@class='page-header']"){
		private WebElement pageHeader;
		@FindBy(xpath ="//img[@id='selenium Training']")
		private WebElement seleniumTrainingImage;
		@FindBy(id ="cartArea")
		private WebElement cartArea;
		@FindBy(xpath ="//Ul[@class='list-socialicons']"
		+"/descendant::i[@class='fa fa-facebook]")
		private WebElement facebookIcon;
		
		//Initialization
		public Testingpage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		//Utilization
		/** 
		 * This method return page header text
		 * 
		 * @return
		 */
		public String getPageHeader() {
		return pageHeader.getText();
		}
		/**
		 * This method return selenium training image
		 * @return
		 */
		public WebElement getSeleniumTrainiingImage() {
			return seleniumTrainingImage;
		}
		/**
		 * This method return cart area web element
		 * @return
		 */
		public WebElement getcartArea() {
			return cartArea;
		}
		/**
		 * This method return facebook icon
		 * @return
		 */
		public WebElement getFacebookIcon() {
	      return facebookIcon;
		}
		/**
		 * This method is used to click facebook icon
		 */
		public void clicFacebookIcon() {
		facebookIcon.click();
		
		
		}
		
		
		
	
		
	}

}
