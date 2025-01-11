package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomepg {
	public  DwsHomepg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="ico-register")
	public WebElement register;
	@FindBy(linkText="Log in")
	public WebElement login;
	@FindBy(partialLinkText="shopping")
	public WebElement Shopping_cart;
	@FindBy(xpath="ico-register")
	public WebElement wishlist;
	@FindBy(css=".search-box-text-ui-autocomplete-input")
	public WebElement search_field;
}
