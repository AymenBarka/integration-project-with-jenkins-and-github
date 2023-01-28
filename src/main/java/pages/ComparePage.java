package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends PageBase
{

	public ComparePage(WebDriver driver) {
		super(driver);
	}

	/*
	 * @FindBy(css = "a.clear-list") private WebElement clearListLink;
	 * 
	 * @FindBy(css = "div.no-data") public WebElement noDataLbl;
	 * 
	 * @FindBy(css = "table.compare-products-table") private WebElement
	 * compareTable;
	 * 
	 * @FindBy(tagName = "tr") public List<WebElement> allRows;
	 * 
	 * @FindBy(tagName = "td") public List<WebElement> allCol;
	 * 
	 * @FindBy(linkText="Asus N551JK-XO076H Laptop") public WebElement
	 * firstProductName;
	 * 
	 * @FindBy(linkText="Apple MacBook Pro 13-inch") public WebElement
	 * secodProductName ;
	 * 
	 * public void clearCompareList() { clickButton(clearListLink); }
	 * 
	 * public void CompareProducts() { // Get all Rows
	 * System.out.println(allRows.size()); // Get data from each Row for(WebElement
	 * row : allRows) { System.out.println(row.getText() + "\t"); for(WebElement col
	 * : allCol) { System.out.println(col.getText()+"\t"); } } }
	 */
	@FindBy(css = "table.compare-products-table")
	private WebElement compareTable;

	@FindBy(css = "tr")
	private List<WebElement> rows;

	@FindBy(css = "td")
	private List<WebElement> cols;

	@FindBy(css = "a.clear-list") 
	private WebElement clearListLink;

	@FindBy(css = "div.no-data") 
	public WebElement noDataLbl;





	@FindBy(linkText="Asus N551JK-XO076H Laptop") public WebElement
	firstProductName;

	@FindBy(linkText="Apple MacBook Pro 13-inch") public WebElement
	secodProductName ;


	public void CompareProducts() 
	{
		if (!compareTable.findElements(By.cssSelector("tr")).isEmpty()) {

			List <WebElement> rows = compareTable.findElements(By.tagName("tr"));
			// Get all Rows
			for(WebElement row : rows) 
			{
				// System.out.println(row.getText() + "\t");
				List <WebElement> cols = row.findElements(By.tagName("td"));

				for(WebElement col : cols) 
				{
					System.out.println(col.getText()+"\t");
				}
			}
		} else {
			System.out.println("La table ne contient aucune donnée");
		}
	}
	public void clearCompareList() { clickButton(clearListLink); }

}
