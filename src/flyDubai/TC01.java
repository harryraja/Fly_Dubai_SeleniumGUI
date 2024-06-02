package flyDubai;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC01 {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", "/Users/harry/Downloads/chromedriver-win64/chromedriver-win64.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qa1-flydubai.np.flydubai.com/en/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String acceptCookies="//button[contains(@class,'osano-cm-accept-all')]";
		if(driver.findElement(By.xpath(acceptCookies)).isDisplayed()==true){
			driver.findElement(By.xpath(acceptCookies)).click();
			
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		  String slectRoundTrip="div.radio-return-div";
		  driver.findElement(By.cssSelector(slectRoundTrip)).click();

		  String segment1Orig="input#airport-origin";
		  driver.findElement(By.cssSelector(segment1Orig)).click();
		  driver.findElement(By.cssSelector(segment1Orig)).sendKeys("DXB");
		  
		  String selectOriginLocation="(//a[contains(@class,'air-list-item')])[1]";
		  driver.findElement(By.xpath(selectOriginLocation)).click();
		  
		  String segment1Destination="input#airport-destination";
		  driver.findElement(By.cssSelector(segment1Destination)).click();
		  driver.findElement(By.cssSelector(segment1Destination)).sendKeys("MCT");
		  
		  String selectDestLocation="//div[contains(@class,'airlistActive')]//a[contains(@class,'air-list')]";
		  driver.findElement(By.xpath(selectDestLocation)).click();
		  
		  
		  Thread.sleep(2000);
		  String nextMonthArrow = "(//button[contains(@class,'lightpick__next-action')])[2]";
		  driver.findElement(By.xpath(nextMonthArrow)).click();
		  
		  Thread.sleep(2000);
		  String DepDate="(//div[contains(@class,'lightpick__day is-available')])[15]";
		  driver.findElement(By.xpath(DepDate)).click();
		  
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(nextMonthArrow)).click();
		  
		  Thread.sleep(2000);
		  String returnDate="(//div[contains(@class,'lightpick__day is-available')])[20]";
		  driver.findElement(By.xpath(returnDate)).click();
		  
		  Thread.sleep(2000);
		  String clkSearch="input[value='Search']";
		  driver.findElement(By.cssSelector(clkSearch)).click();
		  
		  Thread.sleep(3000);
		  String selectDepDate="(//div[contains(@class,'calRectangle-selected Caltext-selected')])[1]";
		  driver.findElement(By.xpath(selectDepDate)).click();
		  
		  Thread.sleep(2000);
		  String depImgdropdown="(//img[contains(@class,'selectDropDownImageFlight')])[1]";
		  driver.findElement(By.xpath(depImgdropdown)).click();
		  		  
		  Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  String selectFlexFare="//div[contains(@class,'Flex fare-faretype')]//button[contains(@type,'button')]";
		  driver.findElement(By.xpath(selectFlexFare)).click();
		  
		  	  
	      Thread.sleep(3000);
	      String selectedFltDetails="(//span[contains(text(),'Flight details')])[1]";
	      driver.findElement(By.xpath(selectedFltDetails)).click();
	      
	         Thread.sleep(5000);
	         String SelecteddepFlightNumber="//label[@id='flightNameLabel']";
	         WebElement SelectdepfltNum=driver.findElement(By.xpath(SelecteddepFlightNumber));
	         Thread.sleep(5000);
	         String SelectedPageGetDepfltNum=SelectdepfltNum.getText();
	   //      System.out.println(SelectedPageGetDepfltNum+ " selected book flight");
	         Thread.sleep(3000);
	     //    String popUpFltDetailsClose="//img[contains(@class,'flight-close')]";
	         
	         String Seg1fltdts ="//div[contains(@class,'flight-content-body')]";
	         WebElement flydates = driver.findElement(By.xpath(Seg1fltdts));
	         String Seg1fltdates=flydates.getText();
	    //     System.out.println(Seg1fltdates+" flt result page seg 1");
	         
	      
	         String popUpFltDetailsClose="//div[contains(@class,'close-btn')]";
	       //  String popUpFltDetailsClose="//fz-image[contains(@type,'button')]";	       
	         WebElement ClosePopUp = driver.findElement(By.xpath(popUpFltDetailsClose));
	         ClosePopUp.click();
		  
		  Thread.sleep(2000);
		  String slectReturnDate="(//div[contains(@class,'calRectangle-selected Caltext-selected')])[2]";
		  driver.findElement(By.xpath(slectReturnDate)).click();

		  Thread.sleep(2000);
		  String ReturnImgdropdown="(//img[contains(@class,'selectDropDownImageFlight')])[4]";
		  driver.findElement(By.xpath(ReturnImgdropdown)).click();
		  
		  Thread.sleep(2000);
		  String selectReturnFlexFare="//div[contains(@class,'Flex fare-faretype')]//button[contains(@type,'button')]";
		//  String selectReturnFlexFare="(//span[@id='span'])[4]";
		  driver.findElement(By.xpath(selectReturnFlexFare)).click();
		  
		 
		  Thread.sleep(8000);
		  String tripSummaryFltDetails="//span[@class='mat-content ng-tns-c95-17']";
		  Thread.sleep(8000);
		  driver.findElement(By.xpath(tripSummaryFltDetails)).click();
		  
		  Thread.sleep(8000);
	      String selectedRTFltDetails="(//span[contains(text(),'Flight details')])[2]";
	      driver.findElement(By.xpath(selectedRTFltDetails)).click();
	      Thread.sleep(4000);
	      String SelectedRTFlightNumber="//label[contains(@id,'flightNameLabel')]";
	      WebElement SelectRTfltNum=driver.findElement(By.xpath(SelectedRTFlightNumber));
	      Thread.sleep(4000);
	      String SelectedPageGetRTfltNum=SelectRTfltNum.getText();
	  //    System.out.println(SelectedPageGetRTfltNum+ " selected return flight");
	      
	      String Seg2fltdts ="//div[contains(@class,'flight-content-body')]";
	      WebElement seg2flydates = driver.findElement(By.xpath(Seg2fltdts));
	      String Seg2fltdates=seg2flydates.getText();
	  //    System.out.println(Seg2fltdates+" flt result page seg 2");
	      
	      
	      
	      
	      Thread.sleep(3000);
	      String rtFltDetlCls="//fz-image[contains(@type,'button')]";
	      driver.findElement(By.xpath(rtFltDetlCls)).click();
	     // ClosePopUp.click();
	     // js.executeScript("arguments[0].click();", ClosePopUp);
	     /* System.out.println(SelectedPageGetRTfltNum+ " selected return flight");
	         String popUpRTFltDetailsClose="//img[contains(@class,'flight-close')]";
	         WebElement CloseRTPopUp = driver.findElement(By.xpath(popUpRTFltDetailsClose));
	         CloseRTPopUp.click(); */
	      
	      
		  Thread.sleep(5000);
		  
		  js.executeScript("window.scrollBy(0,250)", "");
		  String selectextraBaggage="//div[contains(@class,'baggageDiv')]";
		//  driver.findElement(By.cssSelector(selectextraBaggage)).isEnabled();
          WebElement xtrabagageSelect = driver.findElement(By.xpath(selectextraBaggage));
		  js.executeScript("arguments[0].click();", xtrabagageSelect);
		  
		  		  
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,250)", "");
		  String selectextraBaggageRT="//div[@class='imageClass']";
		  WebElement xtrabagageSelectRT = driver.findElement(By.xpath(selectextraBaggageRT));
		  js.executeScript("arguments[0].click();", xtrabagageSelectRT);
		  
	//	  driver.findElement(By.xpath(selectextraBaggage)).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  String clkcontinuePasPage="(//span[contains(text(),'Continue to passenger details')])[1]";
		  driver.findElement(By.xpath(clkcontinuePasPage)).click();
		  
		  String inputFirstName="//input[@id='First_Name']";
		  String inputLastName="//input[@id='Last_Name']";
		  String inputEmail="//input[@id='Email_Address']";
		  String selectMaleRadio="(//div[@class='mat-radio-inner-circle'])[1]";
		  String clkCountryCodeDropDown="(//div[contains(@class,'mat-form-field-infix')])[5]";
		  String selectCountryCode="(//div[@id='countryValueCode'])[1]";
		  String inputMobileNum="//input[@id='Mobile_Number']";
		  String clkReviewBooking="(//span[@id='span'])[1]";
		  
		  
		  driver.findElement(By.xpath(inputFirstName)).sendKeys("Qatest");
		  driver.findElement(By.xpath(inputLastName)).sendKeys("qualitie");
		  driver.findElement(By.xpath(inputEmail)).sendKeys("dummy34@stra.com");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(selectMaleRadio)).click();
		  Thread.sleep(4000);
	      driver.findElement(By.xpath(clkCountryCodeDropDown)).click();
	      Thread.sleep(3000);
          driver.findElement(By.xpath(selectCountryCode)).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath(inputMobileNum)).sendKeys("7788767896");
          driver.findElement(By.xpath(clkReviewBooking)).click();
          
          Thread.sleep(5000);
          js.executeScript("window.scrollBy(0,350)", "");
          driver.findElement(By.xpath(clkReviewBooking)).click(); 
          
          
       //   Thread.sleep(5000);
     //     js.executeScript("window.scrollBy(0,350)", "");
     //     driver.findElement(By.xpath(clkReviewBooking)).click(); 
          
          Thread.sleep(9000);
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          String btnPayLater="//div[contains(@class,'payLaterTitle')]";
          driver.findElement(By.xpath(btnPayLater)).click();
     //     WebElement buttonPayLater=driver.findElement(By.xpath(btnPayLater));
      //    js.executeScript("arguments[0].click();", buttonPayLater);
          
          Thread.sleep(5000);
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          String btnPayNow="//button[contains(@class,'primary pay-now')]";
          driver.findElement(By.xpath(btnPayNow)).click();
          
         Thread.sleep(3000); 
         String btnAgreeContinue="(//button[contains(@type,'submit') and contains(@class,'btnOrange')])[7]";
         driver.findElement(By.xpath(btnAgreeContinue)).click();
         
         //Verifying the confirmation page if PNR is created
         Thread.sleep(7000);
         String bookingRefText="//label[@id='flightBookingReferenceText']";
         WebElement bookingRefrText=driver.findElement(By.xpath(bookingRefText));
         Thread.sleep(3000);
         String bktext=bookingRefrText.getText();
         try {
             if(bookingRefrText.isEnabled()) {
            	 System.out.println(bktext+" Is the created PNR"); 
             }
             else {
            	 throw new RuntimeException("PNR not created");
             }
         }catch(Exception e) {
        	 throw new RuntimeException(e.getMessage());
         }

         Thread.sleep(5000);
         String depFlightDetails="(//div[contains(@fxlayout,'row wrap') and contains(@fxlayoutalign,'center center')])[1]";
         driver.findElement(By.xpath(depFlightDetails)).click();
         
         
         //Validating selected and confirmed booking Departure flight number
         Thread.sleep(5000);
         String depFlightNumber="//label[@id='flightNameLabel']";
         WebElement depfltNum=driver.findElement(By.xpath(depFlightNumber));
         String confirmPageGetDepfltNum=depfltNum.getText();
 //        System.out.println(confirmPageGetDepfltNum+ " Confirmation page flight number");
         try {
        	 if(SelectedPageGetDepfltNum.equalsIgnoreCase(confirmPageGetDepfltNum)) {
        		 System.out.println("Selected flight number "+SelectedPageGetDepfltNum+ " Equals confirmed flightnumber "+confirmPageGetDepfltNum );
        	 }
        	 else {
        		 throw new RuntimeException("Flight number are not same");
        	 }
        		 
         }catch(Exception e) {
        	 throw new RuntimeException(e.getMessage());
         }
         String confSeg1fltdts ="//div[contains(@class,'flight-content-body')]";
         WebElement conflydates = driver.findElement(By.xpath(confSeg1fltdts));
         String confseg1fltdates=conflydates.getText();
    //     System.out.println(confseg1fltdates+ " seg1 confirmation page");
         
         
         try {
        	 if(Seg1fltdates.equalsIgnoreCase(confseg1fltdates)) {
        		 System.out.println("Selected Segment1 dates "+Seg1fltdates+ " Equals segment 1 confirmed flight dates "+confseg1fltdates );
         }
         else {
        	 throw new RuntimeException("Flight dates selected are not matching with confirm booking flight dates");
         }
         }catch(Exception e) {
        	 throw new RuntimeException(e.getMessage());
         }
         
         Thread.sleep(7000);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.findElement(By.xpath("(//fz-image[contains(@type,'button')])[1]")).click();
        		 
         //Validating select return flight number  with confirmed return flight number
         Thread.sleep(5000);
         String RTflightDetails="(//div[contains(@fxlayout,'row wrap') and contains(@fxlayoutalign,'center center')])[2]";
         driver.findElement(By.xpath(RTflightDetails)).click();
         
         Thread.sleep(7000);
         
         String confirmPageGetRTfltNum="//label[contains(@id,'flightNameLabel') and contains(@class,'flight-name-fare-brand')]";
         WebElement returnFltNum=driver.findElement(By.xpath(confirmPageGetRTfltNum));
         String rtrnfltNum = returnFltNum.getText();
     //    System.out.println(rtrnfltNum);
         
         Thread.sleep(5000);
         try {
        	 if(SelectedPageGetRTfltNum.equalsIgnoreCase(rtrnfltNum)) {
        		 System.out.println("Selected flight number "+SelectedPageGetRTfltNum+ " Equals confirmed flightnumber "+rtrnfltNum );
        	 }
        	 else {
        		 throw new RuntimeException("Flight number are not same");
        	 }
        		 
         }catch(Exception e) {
        	 throw new RuntimeException(e.getMessage());
         }
         
         String RTfltdts="//div[contains(@class,'flight-content-body')]";
         WebElement RTflydates = driver.findElement(By.xpath(RTfltdts));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         String RTfltdates=RTflydates.getText();
     //    System.out.println(RTfltdates);
         
         try {
        	 if(Seg2fltdates.equalsIgnoreCase(RTfltdates)) {
        		 System.out.println("Selected Segment2 dates "+Seg2fltdates+ " Equals segment 2 confirmed flight dates "+RTfltdates );
        	 }
        	 else {
        		 throw new RuntimeException("Segment 2 Flight dates selected are not matching with confirmed Segment 2 flight dates");
        	 }
         }catch(Exception e) {
        	 throw new RuntimeException(e.getMessage());
         }
         
        // String conJurSum ="//div[contains(@class,'journey-summary-left')]";
       //  WebElement confirmPgJourneySum=driver.findElement(By.xpath(conJurSum));
       //  String conPageJurSum = confirmPgJourneySum.getText();
       //  System.out.println(conPageJurSum);
         
         
         
         
         
         
         
         
         
         
         
		  	
	}

}
