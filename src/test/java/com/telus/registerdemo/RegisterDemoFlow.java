package com.telus.registerdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterDemoFlow extends MultiBrowser{

	//All input values or variables

	String url = "https://nxtgenaiacademy.com/";
	//String urlDemoSite = "https://nxtgenaiacademy.com/demo-site/";
	String expectedFormTitleValue = "Register For Demo";
	String firstNameValue = "Vinoth";
	String lastNameValue = "R";
	String streetAddValue = "ABC";
	String apartmentValue = "XYZ";
	String cityValue = "Chennai";
	String stateValue = "Tamil Nadu";
	String zipValue = "600100";
	String countryValue = "India";
	String emailValue = "vinoth@gmail.com";
	String dateValue = "02/06/23";
	String timeHrsValue = "09";
	String timeMinValue = "05";
	String mobileValue = "6383544892";
	String queryValue = "What is overal cost of the training?";
	String formSubMsg = "Registration Form is Successfully Submitted.";



	@Test(priority = 2)
	public void navigateToRegisterDemoScreen() {
	
		//create instance of action class for mouse hover
		Actions action = new Actions(driver);

		WebElement demoSite = driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(demoSite).perform();

		//move to Practice automation option
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		//click on registration form option
		WebElement regiForm = driver.findElement(By.linkText("Demo Site – Registration Form"));
		regiForm.click();
		System.out.println("Register Demo page is displayed");
		

	}

	@Test(priority = 3)
	public void registerUser() throws InterruptedException {

		//Print the title of the registration page
		System.out.println("Title of the page is : "+driver.getTitle());

		//title of form "Register For Demo"

		WebElement formTitle = driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3"));

		//Validate form title
		if(formTitle.isDisplayed()) {
			System.out.println("Form title is displayed");
		}
		else {
			System.out.println("Registration form title is missing");
		}

		String actualFormTitle = formTitle.getText(); //store the text in another string variable for comparison

		if(actualFormTitle.equals(expectedFormTitleValue)) {
			System.out.println("Actual and expected registration form title are same");
			System.out.println("Actual and expected title is : "+actualFormTitle);
		}
		else {
			System.out.println("Actual and expected registration form title are same");
			System.out.println("Actual and expected title is : "+actualFormTitle);
		}

		//first name
		WebElement firstName = driver.findElement(By.id("vfb-5"));

		//verify first name is displayed or not

		if(firstName.isDisplayed()) {

			System.out.println("First Name is Displayed");
			//first name is entered
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name is :"+firstNameValue);
		}
		else {
			System.out.println("First Name is not displayed");
		}

		//last name
		WebElement lastName = driver.findElement(By.id("vfb-7"));

		//verify last name is displayed
		if(lastName.isDisplayed()) {
			System.out.println("Last name is Displayed");
			//last name is entered
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name is :"+lastNameValue);
		}
		else {
			System.out.println("Last name is not Displayed");
		}

		//Thread.sleep(3000);

		//radio button -- male
		WebElement maleRadioBtn = driver.findElement(By.id("vfb-31-1")); //-- xpath should have to take fron selectorshub

		//verify radio butoon is enabled
		if(maleRadioBtn.isSelected()) {

			System.out.println("Radio button is selected");

		}
		else {
			System.out.println("Radio button is not selected");
			maleRadioBtn.click(); 
			System.out.println("Radio button is selected");
		}

		//Street address
		WebElement streetAdd = driver.findElement(By.id("vfb-13-address"));

		//verify street address field is displayed
		if(streetAdd.isDisplayed()) {
			System.out.println("Street Address is Displayed");
			streetAdd.sendKeys(streetAddValue);
			System.out.println("Street address is :"+streetAddValue);
		}
		else {
			System.out.println("Street address is not displayed");
		}

		//apartment
		WebElement apartment = driver.findElement(By.id("vfb-13-address-2"));

		//verify apartment field is visible
		if(apartment.isDisplayed()) {
			System.out.println("Apartment is displayed");
			apartment.sendKeys(apartmentValue);
			System.out.println("Apartment number is : "+apartmentValue);

		}
		else {
			System.out.println("Apartment is not displayed");
		}

		//city
		WebElement city = driver.findElement(By.id("vfb-13-city"));

		//verify city field is visible
		if(city.isDisplayed()) {
			System.out.println("City is displayed");
			city.sendKeys(cityValue);
			System.out.println("City is : "+cityValue);

		}
		else {
			System.out.println("City is not displayed");
		}

		//state
		WebElement state = driver.findElement(By.id("vfb-13-state"));

		//verify state is displayed
		if(state.isDisplayed()) {
			System.out.println("State is displayed");
			state.sendKeys(stateValue);
			System.out.println("State is : "+stateValue);
		}
		else {
			System.out.println("State is not displayed");
		}

		//postal/zip code
		WebElement postalZip = driver.findElement(By.id("vfb-13-zip"));

		//verify postal/zip is displayed
		if(postalZip.isDisplayed()) {
			System.out.println("Postal/Zip is displayed");
			postalZip.sendKeys(zipValue);
			System.out.println("Postal/Zip value is :"+zipValue);
		}
		else
		{
			System.out.println("Postal/Zip is not displayed");
		}

		//country
		WebElement countryDropDn = driver.findElement(By.id("vfb-13-country"));

		//verify country is displayed
		if(countryDropDn.isDisplayed()) {
			System.out.println("Country is displayed");
		}
		else {
			System.out.println("Country is not displayed");

		}
		
		Thread.sleep(3000);
		
		//create Select object to select from drop down

		Select countryDropDown = new Select(countryDropDn); // -- passed the webelement of the dropdown

		//verify country dropdown in enabled
		if(countryDropDn.isEnabled()) {
			System.out.println("Country drop down is enabled");		
			
			countryDropDown.selectByVisibleText(countryValue);
			System.out.println("Selected country is : "+countryValue);
		}
		else {
			System.out.println("Country drop down is not enabled");
		}

		//email
		WebElement email = driver.findElement(By.id("vfb-14"));

		//verify email is displayed
		if(email.isDisplayed()) {
			System.out.println("Email is displayed");
			email.sendKeys(emailValue);
			System.out.println("Email address is : "+emailValue);
		}
		else {
			System.out.println("Email is not displayed");
		}

		//Date
		WebElement date = driver.findElement(By.id("vfb-18"));

		//verify date is displayed
		if(date.isDisplayed()) {
			System.out.println("Date is displayed");
			date.sendKeys(dateValue);
			System.out.println("Entered date is :"+dateValue);
		}
		else {
			System.out.println("Date is not displayed");
		}

		//time HRS
		WebElement timeDropDownHrs = driver.findElement(By.id("vfb-16-hour"));

		//verify time is displayed or not
		if(timeDropDownHrs.isDisplayed()) {
			System.out.println("Time in Hours is displayed");
		}
		else {
			System.out.println("Time in hours is not displayed");
		}
		//create Select object to select from drop down

		Select timeDrpDwnHrs = new Select(timeDropDownHrs);

		//Thread.sleep(3000);

		//verify time HRS is enabled
		if(timeDropDownHrs.isEnabled()) {
			System.out.println("Time in hours is enabled");
			timeDrpDwnHrs.selectByVisibleText(timeHrsValue);
			System.out.println("Select time in hours is :"+timeHrsValue);

		}
		else {
			System.out.println("Time in hours is not enabled");
		}

		//time min
		WebElement timeDropDownMin = driver.findElement(By.id("vfb-16-min"));

		//verify time min is displayed
		if(timeDropDownMin.isDisplayed()) {
			System.out.println("Time in minute dropdown is displayed");
		}
		else {
			System.out.println("Time in minute drop down is not displayed");
		}
		//create select object to select from time min drop down
		Select timeDrpDwnMin = new Select(timeDropDownMin);

		//verify time minute is enabled
		if(timeDropDownMin.isEnabled()) {
			System.out.println("Time in min drop down is enabled");
			timeDrpDwnMin.selectByVisibleText(timeMinValue);
			System.out.println("Time selected in min is : "+timeMinValue);
		}
		else {
			System.out.println("Timne in min drop down is not enabled");
		}

		//Thread.sleep(3000);


		//mobile number
		WebElement mobile = driver.findElement(By.id("vfb-19"));

		//verify mobile number is displayed
		if(mobile.isDisplayed()) {
			System.out.println("Mobile number is displayed");
			mobile.sendKeys(mobileValue);
			System.out.println("Mobile number is : "+mobileValue);
		}
		else {
			System.out.println("Mobile number is not displayed");
		}

		//Course intrested checkbox
		WebElement uftChkBox = driver.findElement(By.id("vfb-20-1"));
		WebElement testNgBox = driver.findElement(By.id("vfb-20-2"));

		//verify checkbox are selected
		//UFT
		if(uftChkBox.isSelected()) {
			System.out.println("Checkboxe UFT is selected");
		}
		else {
			System.out.println("UFT checkbox is not selected");
			uftChkBox.click();
		}
		//TestNG
		if(testNgBox.isSelected()) {
			System.out.println("Checkboxe TestNG is selected");
		}
		else {
			System.out.println("TestNG checkbox is not selected");
			testNgBox.click();
		}

		//enter your query
		WebElement query = driver.findElement(By.id("vfb-23"));

		//verify text box is displayed
		if(query.isDisplayed()) {
			System.out.println("Query text box is displayed");
			query.sendKeys(queryValue);
			System.out.println("Query is : " +queryValue);			
		}
		else
		{
			System.out.println("Query text box is not displayed");
		}

		//verification text 

		WebElement vText = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"));
		String vTextValue = vText.getText();
		//System.out.println(vTextValue);
		//System.out.println(vTextValue.indexOf(":"));
		//System.out.println(vTextValue.substring(8).trim());

		String verificationValue = vTextValue.substring(8).trim();
		//System.out.println(verificationValue);

		//verification
		WebElement verification = driver.findElement(By.id("vfb-3"));

		//verify verification is displayed
		if(verification.isDisplayed()) {
			System.out.println("Verification text box is displayed");
			verification.sendKeys(verificationValue);
			System.out.println("Verification value is : " +verificationValue);

		}
		else {
			System.out.println(" Verification box is not displayed");
		}

		//submit
		WebElement submit = driver.findElement(By.id("vfb-4"));

		//verify submit bustton is enabled
		if(submit.isEnabled()) {
			System.out.println("Submit button is enabled");
			submit.click();
		}
		else {
			System.out.println("Submit button is not enabled");
		}
		System.out.println("User is registered");
	}


	@Test(priority = 4)
	public void validateSuccessfulMessage() {
		WebElement successfulMsg = driver.findElement(By.xpath("//div[@class='elementor-widget-container']")); 

		//get Text
		String successMsg = successfulMsg.getText();
		System.out.println(successMsg);

		if(successMsg.contains(formSubMsg)) {
			System.out.println("Form is submitted successfully");
			System.out.println("Confirmation message is : " +formSubMsg);

			//get transaction ID
			//System.out.println(successMsg.indexOf("."));//---76
			String transID = successMsg.substring(77).trim();

			//display transaction Id
			System.out.println(transID);
		}
		else {
			System.out.println("Form was not submitted successfully");
		}	
		System.out.println("Message is validated");
	}


}
