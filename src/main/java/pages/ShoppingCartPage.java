package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase
{
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button.remove-btn")
	WebElement removeCheck;

	@FindBy(css = "button.button-2.update-cart-button")
	WebElement updateCartBtn;

	@FindBy(css = "input.qty-input")
	public WebElement quantityTxt;

	@FindBy(css = "span.product-subtotal")
	public WebElement totalLbl;

	
	@FindBy(id="checkout")
	WebElement checkoutBtn ; 
	
	@FindBy(id="termsofservice")
	WebElement agreeCheckbox; 
	
	@FindBy(css="button.button-1.checkout-as-guest-button")
	WebElement guestCheckoutBtn ; 

	public void RemoveProductFromCart() {
		clickButton(removeCheck);
		//clickButton(updateCartBtn);
	}

	public void UpdateProductQuantityInCart(String quantity) {
		//clear quantity textbox
		clearText(quantityTxt);
		setTextElementText(quantityTxt, quantity);
		clickButton(updateCartBtn);
	}

	public void openCheckoutPage() 
	{
		clickButton(agreeCheckbox);
		clickButton(checkoutBtn);
	}
	
	public void openCheckoutPageAsGuest() 
	{
		clickButton(agreeCheckbox);
		clickButton(checkoutBtn);
		clickButton(guestCheckoutBtn);
	}
}

