package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains elements and respective business
 * Libraries of contact us page  
 * @author SATURN
 *
 */

public class ContactUspage {
	
private static final CharSequence fullname = null;

private static final CharSequence email = null;

private static final CharSequence subject = null;

private static final CharSequence message = null;

//Duration
@FindBy(xpath = "//img[contains(@src,'contacts')]")
private WebElement contactUsIcon;
 
@FindBy(name = "name")
private WebElement fullNameTf;

@FindBy(name ="sender")
private WebElement emailTf;

@FindBy (name ="subject")
private WebElement subjectTf;

@FindBy(name ="message")
private WebElement messageTextArea;

@FindBy(xpath = "//button[text()='send us mail']")
private WebElement sendUsMailButton;

//Initialization
public ContactUspage(WebDriver driver) {
 PageFactory.initElements(driver,this);
 
}
//Utilization
/**
 * This method return contact us page icon
 * @return
 */
public WebElement getContactIcon() {
	return contactUsIcon;
}
/**
 * This method is used to send contact de
 * @paramfullname
 * @parm subject
 * @param message
 */
public void sendContactInfo() {
	fullNameTf.sendKeys(fullname);
	emailTf.sendKeys(email);
	subjectTf.sendKeys(subject);
	messageTextArea.sendKeys(message);
	sendUsMailButton.click();
	
 
}
	

}
