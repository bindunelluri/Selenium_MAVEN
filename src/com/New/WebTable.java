package com.New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class WebTable {
	
	public static int[] VerifyGridOnSelectingSelectCompany(WebElement element)
	{

		
		//isElementLoaded(element);
	//test.log(LogStatus.INFO, "Web Table Loaded");


		java.util.List<WebElement> rows_table=element.findElements(By.tagName("tr"));
		//System.out.println(rows_table.size());
		int row_count=rows_table.size();
		
		java.util.List<WebElement> cols_table=element.findElements(By.tagName("td"));
		//System.out.println(cols_table.size());
		int cols_count=cols_table.size();
		//return PageFactory.initElements(row_count, cols_count);
		return new int[] {row_count,cols_count};
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/GLO/Design-11_Blue-Main-styles-Two//Design-11_Blue-Main-styles-Two//GLO-site//ReportingHistory.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='page-wrapper']/div/div/div/div/ul/li[2]/a/span[2]")).click();
				
		WebElement ele=driver.findElement(By.xpath("//*[@id='myTable2']"));
		//WebTable tab=new WebTable();
int[] row_count=WebTable.VerifyGridOnSelectingSelectCompany(ele);
System.out.println(row_count[0]);
System.out.println(row_count[1]);

int rows_count=row_count[0];
int cols_count=row_count[1];
String part1="//*[@id='myTable2']/tbody/tr[";
String part2="]/td[";
String part3="]";
int reqcol=3;
for(int rownum=1;rownum<=rows_count-1;rownum++)
{
	String final_txt=part1+rownum+part2+reqcol+part3;
	String txt=driver.findElement(By.xpath(final_txt)).getText();
	System.out.println(txt);
	String[] splt=txt.split("\\.");
	//System.out.println(splt.length);
	System.out.println(splt[0]);
			
}



	}

}
