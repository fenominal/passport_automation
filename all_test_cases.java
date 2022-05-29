package passport_bhavesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class all_test_cases extends base {

	// file number filed test case

	@Test(priority = 1)
	public static void TC_FN_001() throws InterruptedException {
		System.out.println("TC_FN_001");
		filenumber.sendKeys("123ABCDEFGHIJKLMN");
		Thread.sleep(500);
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_filename")).getText();
		String exp_error_mess = "1.0 Please Enter Valid File Numbefile";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 2)
	public static void TC_FN_002() throws InterruptedException {
		System.out.println("TC_FN_002");
		filenumber.clear();
		filenumber.sendKeys("123ABCD");
		Thread.sleep(500);
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_filename")).getText();
		String exp_error_mess = "1.0 Please Enter Valid File Numbefile";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 3)
	public static void TC_FN_003() throws InterruptedException {
		System.out.println("TC_FN_003");
		filenumber.clear();
		filenumber.sendKeys("#@!&$");
		Thread.sleep(500);
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_filename")).getText();
		String exp_error_mess = "1.0 Please Enter Valid File Numbefile";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 4)
	public static void TC_FN_004() throws InterruptedException {
		System.out.println("TC_FN_004");
		filenumber.clear();
		filenumber.sendKeys("AHMD12345622");
		Thread.sleep(500);
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_filename")).getText();
		String exp_error_mess = "1.0 Please Enter Valid File Numbefile";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);

	}

	@Test(priority = 5)
	public static void TC_FN_005() throws InterruptedException {
		System.out.println("TC_FN_005");
		filenumber.clear();
		filenumber.sendKeys("123ABCDEFG456");
		Thread.sleep(500);
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_filename")).getText();
		String exp_error_mess = "1.0 Please Enter Valid File Numbefile";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 6)
	public static void TC_FN_006() throws InterruptedException {
		System.out.println("TC_FN_006");
		filenumber.clear();
		filenumber.sendKeys("AHMD12345622");
		Thread.sleep(500);
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_filename")).getText();
		String exp_error_mess = "1.0 Please Enter Valid File Numbefile";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 7)
	public static void TC_FN_007() throws InterruptedException {
		System.out.println("TC_FN_007");
		filenumber.clear();
		filenumber.sendKeys("AHMD12345622");
		Thread.sleep(500);
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_filename")).getText();
		String exp_error_mess = "1.0 Please Enter Valid File Numbefile";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}// end of file number test cases

	// section 1 Test cases

	@Test(priority = 8)
	public static void TC_SR_001() throws InterruptedException {
		System.out.println("TC_SR_001");
		WebElement radio1_1 = driver.findElement(By.id("Fcheck"));
		radio1_1.click();
		WebElement radio1_2 = driver.findElement(By.id("Rcheck"));
		radio1_2.click();
		Thread.sleep(500);
		Assert.assertFalse(radio1_1.isSelected());
		System.out.println("multiple selection not allowed");
//		softAssert.assertAll();
	}

	@Test(priority = 9)
	public static void TC_SR_002() throws InterruptedException {
		System.out.println("TC_SR_002");
		WebElement radio1_1 = driver.findElement(By.id("Fcheck"));
		radio1_1.click();
		driver.findElement(By.id("disable6")).click();
		driver.findElement(By.id("disable3")).click();
		driver.findElement(By.id("disable4")).click();
		driver.findElement(By.id("disable2")).click();
		driver.findElement(By.id("1")).click();
		Thread.sleep(500);

		Assert.assertFalse(driver.findElement(By.id("1")).isSelected());
		Thread.sleep(500);
		System.out.println("multiple selection not allowed");
//		softAssert.assertAll();
	}

	@Test(priority = 10)
	public static void TC_SR_003() throws InterruptedException {
		System.out.println("TC_SR_003");
		WebElement radio1_1 = driver.findElement(By.id("Fcheck"));
		radio1_1.click();
		driver.findElement(By.id("disable2")).click();
		Thread.sleep(500);

		Assert.assertFalse(driver.findElement(By.id("disable7")).isSelected());
		Thread.sleep(500);
		System.out.println("section 2 was not enable");
//		softAssert.assertAll();
	}

	@Test(priority = 11)
	public static void TC_SR_004() throws InterruptedException {
		System.out.println("TC_SR_004");
		WebElement radio1_2 = driver.findElement(By.id("Rcheck"));
		radio1_2.click();
		driver.findElement(By.id("disable2")).click();
		Thread.sleep(500);

		Assert.assertTrue(driver.findElement(By.id("disable2")).isSelected());
		Thread.sleep(500);
		System.out.println("section 2 was enable");
//		softAssert.assertAll();
	}

	@Test(priority = 12)
	public static void TC_SR_005() throws InterruptedException {
		System.out.println("TC_SR_005");
		WebElement radio1_2 = driver.findElement(By.id("Rcheck"));
		radio1_2.click();
		Thread.sleep(500);
		driver.findElement(By.id("1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("disable7")).click();
		Thread.sleep(500);

		Assert.assertFalse(driver.findElement(By.id("disable7")).isSelected());
		Thread.sleep(500);
		System.out.println("section 3 was not enable");
//		softAssert.assertAll();
	}

	@Test(priority = 13)
	public static void TC_SR_006() throws InterruptedException {
		System.out.println("TC_SR_006");
		WebElement radio1_2 = driver.findElement(By.id("Rcheck"));
		radio1_2.click();
		Thread.sleep(500);
		driver.findElement(By.id("disable5")).click();
		Thread.sleep(500);
		driver.findElement(By.id("disable7")).click();
		Thread.sleep(500);

		Assert.assertTrue(driver.findElement(By.id("disable5")).isSelected());
		Thread.sleep(500);
		System.out.println("section 3 was enable");
//		softAssert.assertAll();
	}

	@Test(priority = 14)
	public static void TC_SR_007() throws InterruptedException {
		System.out.println("TC_SR_007");
		WebElement radio1_4_1 = driver.findElement(By.xpath("//*[@id=\"3\"]"));
		radio1_4_1.click();
		WebElement radio1_4_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[4]/div[12]/div[3]/input"));
		radio1_4_2.click();

		Assert.assertFalse(radio1_4_1.isSelected());
		System.out.println("1.4 not allow multiple selection not allow");
		WebElement radio1_5_1 = driver.findElement(By.xpath("//*[@id=\"4\"]"));
		radio1_5_1.click();
		WebElement radio1_5_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[4]/div[13]/div[3]/input"));
		radio1_5_2.click();
		Assert.assertFalse(radio1_5_1.isSelected());
		System.out.println("1.5 not allow multiple selection not allow");

		WebElement radio1_6_1 = driver.findElement(By.xpath("//*[@id=\"5\"]"));
		radio1_6_1.click();
		WebElement radio1_6_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[4]/div[14]/div[3]/input"));
		radio1_6_2.click();
		Assert.assertFalse(radio1_6_1.isSelected());
		System.out.println("1.6 not allow multiple selection not allow");
//		softAssert.assertAll();
	}// end of section 1 test cases

	// section 2 test case

	@Test(priority = 15)
	public static void TC_SR_008() throws InterruptedException {
		System.out.println("TC_SR_008");
		WebElement applicant_name = driver.findElement(By.id("givenname"));
		applicant_name.sendKeys("#$%!");
		submitbutton.click();
		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[10]/a")).getText();
		String exp_error_mess = "2.1.1Please Enter Valid Applicant Name";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//			softAssert.assertAll();
	}

	@Test(priority = 16)
	public static void TC_SR_009() throws InterruptedException {
		System.out.println("TC_SR_009");
		WebElement applicant_name = driver.findElement(By.id("givenname"));
		applicant_name.sendKeys("ABC123");
		submitbutton.click();
		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[10]/a")).getText();
		String exp_error_mess = "2.1.1Please Enter Valid Applicant Name";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//			softAssert.assertAll();
	}

	@Test(priority = 17)
	public static void TC_SR_010() throws InterruptedException {
		System.out.println("TC_SR_009");

		WebElement applicant_name = driver.findElement(By.id("givenname"));
		applicant_name.sendKeys("#$%!");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_givenname")).getText();
		String exp_error_mess = "2.1.1Please Enter Valid Applicant Name";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//			softAssert.assertAll();
	}

	@Test(priority = 18)
	public static void TC_SR_011() throws InterruptedException {
		System.out.println("TC_SR_011");

		WebElement applicant_name = driver.findElement(By.id("givenname"));
		applicant_name.clear();
		applicant_name.sendKeys("abc");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_givenname")).getText();
		String exp_error_mess = "";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//			softAssert.assertAll();
	}

	@Test(priority = 16)
	public static void TC_SR_012() throws InterruptedException {
		System.out.println("TC_SR_013");

		WebElement applicant_name = driver.findElement(By.id("surname"));
		applicant_name.sendKeys("ABC123");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[11]/a")).getText();
		String exp_error_mess = "2.1.2Please Enter Valid Applicant surname";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//			softAssert.assertAll();
	}

	@Test(priority = 20)
	public static void TC_SR_013() throws InterruptedException {
		System.out.println("TC_SR_013");

		WebElement applicant_name = driver.findElement(By.id("surname"));
		applicant_name.sendKeys("#$%!");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[11]/a")).getText();
		String exp_error_mess = "2.1.2Please Enter Valid Applicant surname";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//			softAssert.assertAll();
	}

	@Test(priority = 21)
	public static void TC_SR_014() throws InterruptedException {
		System.out.println("TC_SR_014");

		WebElement applicant_name = driver.findElement(By.id("surname"));
		applicant_name.clear();
		applicant_name.sendKeys("abc");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_surname")).getText();
		String exp_error_mess = "";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//			softAssert.assertAll();
	}

	@Test(priority = 22)
	public static void TC_SR_015() throws InterruptedException {
		System.out.println("TC_SR_015");

		WebElement radio2_2_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[7]/div[2]/input"));
		WebElement radio2_2_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[7]/div[3]/input"));

		WebElement radio2_3_1 = driver.findElement(By.xpath("//*[@id=\"8\"]"));
		WebElement radio2_3_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[9]/div[3]/input"));

		WebElement radio2_6_1 = driver.findElement(By.xpath("//*[@id=\"9\"]"));
		WebElement radio2_6_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[22]/div[3]/input"));
		WebElement radio2_6_3 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[22]/div[4]/input"));

		WebElement radio2_7_1 = driver.findElement(By.xpath("//*[@id=\"10\"]"));
		WebElement radio2_7_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[23]/div[3]/input"));
		WebElement radio2_7_3 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[23]/div[4]/input"));
		WebElement radio2_7_4 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[23]/div[5]/input"));
		WebElement radio2_7_5 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[23]/div[6]/input"));

		WebElement radio2_8_1 = driver.findElement(By.xpath("//*[@id=\"11\"]"));
		WebElement radio2_8_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[24]/div[3]/input"));

		radio2_2_1.click();
		radio2_2_2.click();

		radio2_3_1.click();
		radio2_3_2.click();

		radio2_6_1.click();
		radio2_6_2.click();
		radio2_6_3.click();

		radio2_7_1.click();
		radio2_7_2.click();
		radio2_7_3.click();
		radio2_7_4.click();
		radio2_7_5.click();

		radio2_8_1.click();
		radio2_8_2.click();

		Assert.assertFalse(radio2_2_1.isSelected());
		Assert.assertFalse(radio2_3_1.isSelected());
		Assert.assertFalse(radio2_6_1.isSelected());
		Assert.assertFalse(radio2_7_1.isSelected());
		Assert.assertFalse(radio2_8_1.isSelected());

//			softAssert.assertAll();
		System.out.println("section 2 ,3 ,6,7,8 multiple selection are not avaliable");

	}

	@Test(priority = 23)
	public static void TC_AD_2_5_1() throws InterruptedException {
		System.out.println("TC_AD_2_5_1");

		WebElement distric_filed = driver.findElement(By.id("District"));
		distric_filed.clear();
		WebElement state_filed = driver.findElement(By.id("State"));
		state_filed.clear();
		WebElement region_filed = driver.findElement(By.id("Country"));
		region_filed.clear();

		distric_filed.sendKeys("NVS");
		state_filed.sendKeys("NVS");
		region_filed.sendKeys("NVS");
		submitbutton.click();

		String actul_error_mess2_5_1 = driver.findElement(By.id("e_District")).getText();
		String exp_error_mess2_5_1 = "2.5.2 District State and Country do not have same value !!";
		Assert.assertEquals(actul_error_mess2_5_1, exp_error_mess2_5_1, "error message is mismatched");
		System.out.println("This error show:- " + exp_error_mess2_5_1);

	}

	@Test(priority = 24)
	public static void TC_AD_2_5_2() throws InterruptedException {
		System.out.println("TC_AD_2_5_2");

		WebElement distric_filed = driver.findElement(By.id("District"));
		distric_filed.clear();
		WebElement state_filed = driver.findElement(By.id("State"));
		state_filed.clear();
		WebElement region_filed = driver.findElement(By.id("Country"));
		region_filed.clear();

		distric_filed.click();
		state_filed.click();
		region_filed.click();

		distric_filed.sendKeys("Mee$%rut");
		state_filed.sendKeys("Meerut123");
		region_filed.sendKeys("12@Meerut");
		submitbutton.click();

		String actul_error_mess17 = driver.findElement(By.id("e_District")).getText();
		String exp_error_mess17 = "2.5.2 District State and Country do not have same value !!";
		Assert.assertEquals(actul_error_mess17, exp_error_mess17, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess17);

	}

	@Test(priority = 25)
	public static void TC_AD_2_5_3() throws InterruptedException {
		System.out.println("TC_AD_2_5_3");

		WebElement distric_filed = driver.findElement(By.id("District"));
		distric_filed.clear();
		WebElement state_filed = driver.findElement(By.id("State"));
		state_filed.clear();
		WebElement region_filed = driver.findElement(By.id("Country"));
		region_filed.clear();

		distric_filed.click();
		state_filed.click();
		region_filed.click();

		distric_filed.sendKeys("Phoenix");
		state_filed.sendKeys("Arizona");
		region_filed.sendKeys("United States");
		submitbutton.click();

		String actul_error_mess17 = driver.findElement(By.id("e_District")).getText();
		String exp_error_mess17 = "2.5.2 Out Of India Address not allowed";
		Assert.assertEquals(actul_error_mess17, exp_error_mess17, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess17);

	}

	@Test(priority = 26)
	public static void TC_VO_01() throws InterruptedException {
		System.out.println("TC_VO_001");

		WebElement voterid = driver.findElement(By.id("voter"));
		voterid.clear();
		voterid.sendKeys("Phoenix");

		String actul_error_mess17 = driver.findElement(By.xpath("/html/body/small[2]/a")).getText();
		String exp_error_mess17 = "";
		Assert.assertEquals(actul_error_mess17, exp_error_mess17, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess17);

	}

	@Test(priority = 27)
	public static void TC_VO_02() throws InterruptedException {
		System.out.println("TC_VO_002");

		WebElement voterid = driver.findElement(By.id("voter"));
		voterid.clear();
		voterid.sendKeys("guj10056798");
		submitbutton.click();

		String actul_error_mess17 = driver.findElement(By.xpath("/html/body/small[2]/a")).getText();
		String exp_error_mess17 = "";
		Assert.assertEquals(actul_error_mess17, exp_error_mess17, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess17);

	}

	@Test(priority = 28)
	public static void TC_VO_03() throws InterruptedException {
		System.out.println("TC_VO_003");

		WebElement voterid = driver.findElement(By.id("voter"));
		voterid.clear();
		voterid.sendKeys("GUJ10052238");
		submitbutton.click();

		String actul_error_mess17 = driver.findElement(By.xpath("/html/body/small[2]/a")).getText();
		String exp_error_mess17 = "";
		Assert.assertEquals(actul_error_mess17, exp_error_mess17, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess17);

	}

	@Test(priority = 29)
	public void TC_AD_2_11_1() throws InterruptedException {

		System.out.println("TC_AD_2_11_1");

		WebElement radio2_11_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[1]/input"));
		WebElement radio2_11_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[2]/input"));
		WebElement radio2_11_3 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[3]/input"));
		WebElement radio2_11_4 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[4]/input"));
		WebElement radio2_11_5 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[5]/input"));

		WebElement radio2_11_6 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[1]/input"));
		WebElement radio2_11_7 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[2]/input"));
		WebElement radio2_11_8 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[3]/input"));
		WebElement radio2_11_9 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[4]/input"));
		WebElement radio2_11_10 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[5]/input"));

		WebElement radio2_11_11 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[30]/div[1]/input"));
		WebElement radio2_11_12 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[30]/div[2]/input"));

		radio2_11_1.click();
		radio2_11_2.click();
		radio2_11_3.click();
		radio2_11_4.click();
		radio2_11_5.click();
		radio2_11_6.click();
		radio2_11_7.click();
		radio2_11_8.click();
		radio2_11_9.click();
		radio2_11_10.click();
		radio2_11_11.click();
		radio2_11_12.click();

		Assert.assertFalse(radio2_11_1.isSelected());
		Assert.assertFalse(radio2_11_2.isSelected());

		System.out.println("only single selection");

	}

	@Test(priority = 30)
	public void TC_AD_2_11_2() throws InterruptedException {

		System.out.println("TC_AD_2_11_2");

		WebElement radio2_11_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[1]/input"));
		WebElement radio2_11_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[2]/input"));
		WebElement radio2_11_3 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[3]/input"));
		WebElement radio2_11_4 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[4]/input"));
		WebElement radio2_11_5 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[5]/input"));

		WebElement radio2_11_6 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[1]/input"));
		WebElement radio2_11_7 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[2]/input"));
		WebElement radio2_11_8 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[3]/input"));
		WebElement radio2_11_9 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[4]/input"));
		WebElement radio2_11_10 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[29]/div[5]/input"));

		WebElement radio2_11_11 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[30]/div[1]/input"));
		WebElement radio2_11_12 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[30]/div[2]/input"));

		radio2_11_1.click();
		radio2_11_2.click();
		radio2_11_3.click();
		radio2_11_4.click();
		radio2_11_5.click();
		radio2_11_6.click();
		radio2_11_7.click();
		radio2_11_8.click();
		radio2_11_9.click();
		radio2_11_10.click();
		radio2_11_11.click();
		radio2_11_12.click();

		Assert.assertFalse(radio2_11_1.isSelected());
		Assert.assertFalse(radio2_11_2.isSelected());

		System.out.println("single selection only");

	}

	@Test(priority = 31)
	public void TC_AD_2_12_1() throws InterruptedException {

		System.out.println("TC_AD_2_12_1");

		WebElement radio2_11_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[1]/input"));
		radio2_11_1.click();

		WebElement orgnization = driver.findElement(By.id("employed"));
		orgnization.sendKeys("sgl123");
		submitbutton.click();
		System.out.println("organzation text box error are not show");

		Assert.fail();

	}

	@Test(priority = 32)
	public void TC_AD_2_12_2() throws InterruptedException {

		System.out.println("TC_AD_2_12_2");

		WebElement radio2_11_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[1]/input"));

		radio2_11_1.click();

		WebElement orgnization = driver.findElement(By.id("employed"));
		orgnization.clear();

		orgnization.sendKeys(
				"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		submitbutton.click();

		System.out.println("organzation text box error are not show");
		Assert.fail();

	}

	@Test(priority = 33)
	public void TC_AD_2_12_3() throws InterruptedException {

		System.out.println("TC_AD_2_12_3");

		WebElement radio2_11_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[28]/div[1]/input"));

		radio2_11_1.click();

		WebElement orgnization = driver.findElement(By.id("employed"));
		orgnization.clear();

		orgnization.sendKeys("NATIONAL TROOP");
		submitbutton.click();

		System.out.println("organzation text box error are not show");
		Assert.fail();

	}

	@Test(priority = 34)
	public void TC_AD_2_13() throws InterruptedException {

		System.out.println("TC_AD_2_13");

		WebElement radio2_13_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[33]/div[2]/input"));
		WebElement radio2_13_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[33]/div[3]/input"));

		radio2_13_1.click();
		radio2_13_2.click();

		Assert.assertFalse(radio2_13_1.isSelected());
		System.out.println("only single selection");
	}

	@Test(priority = 35)
	public void TC_AD_2_14() throws InterruptedException {

		System.out.println("TC_AD_2_14");

		WebElement radio2_14_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[35]/div[1]/input"));
		WebElement radio2_14_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[35]/div[2]/input"));
		WebElement radio2_14_3 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[36]/div[1]/input"));
		WebElement radio2_14_4 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[36]/div[2]/input"));

		radio2_14_1.click();
		radio2_14_2.click();
		radio2_14_3.click();
		radio2_14_4.click();

		Assert.assertFalse(radio2_14_1.isSelected());
		System.out.println("only single selection");
	}

	@Test(priority = 36)
	public void TC_AD_2_15() throws InterruptedException {

		System.out.println("TC_AD_2_15");

		WebElement radio2_15_1 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[37]/div[2]/input"));
		WebElement radio2_15_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div[37]/div[3]/input"));

		radio2_15_1.click();
		radio2_15_2.click();

		Assert.assertFalse(radio2_15_1.isSelected());
		System.out.println("only single selection");
	}

	@Test(priority = 37)
	public void TC_AD_2_16() throws InterruptedException {

		System.out.println("TC_AD_2_16");

		WebElement Visible_Distinguishing_Mark = driver
				.findElement(By.xpath("/html/body/div/div/form/div[5]/div[39]/div/input"));
		Visible_Distinguishing_Mark.sendKeys("Harsh");
		submitbutton.click();
		System.out.println("Visible Distinguishing Mark Error Are not show");

		Assert.fail();

	}

	@Test(priority = 38)
	public void TC_AD_2_17_1() throws InterruptedException {

		System.out.println("TC_AD_2_17_1");
		WebElement Aadhaar_Number_input = driver.findElement(By.id("adhar"));
		Aadhaar_Number_input.sendKeys("76539984467235");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[26]/a")).getText();
		String exp_error_mess = "2.17 Please Enter Valid Aadhar Card Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);

	}

	@Test(priority = 39)
	public void TC_AD_2_17_2() throws InterruptedException {

		System.out.println("TC_AD_2_17_2");
		WebElement Aadhaar_Number_input = driver.findElement(By.id("adhar"));
		Aadhaar_Number_input.sendKeys("7653998");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[26]/a")).getText();
		String exp_error_mess = "2.17 Please Enter Valid Aadhar Card Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 40)
	public void TC_AD_2_17_3() throws InterruptedException {

		System.out.println("TC_AD_2_17_3");
		WebElement Aadhaar_Number_input = driver.findElement(By.id("adhar"));
		Aadhaar_Number_input.sendKeys("7ABC653998$%");
		submitbutton.click();
		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[26]/a")).getText();
		String exp_error_mess = "2.17 Please Enter Valid Aadhar Card Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);

	}// end of section2 test case

	// section 3 test case
	@Test(priority = 41)
	public static void TC_FD_3_1_1() throws InterruptedException {
		System.out.println("TC_FD_3_1_1");
		WebElement father_name = driver.findElement(By.id("fathername"));
		father_name.sendKeys("J98ohN");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[27]/a")).getText();
		String exp_error_mess = "3.1 Please Enter Valid Father Name";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 42)
	public static void TC_FD_3_1_2() throws InterruptedException {
		System.out.println("TC_FD_3_1_2");
		WebElement father_name = driver.findElement(By.id("fathername"));
		father_name.sendKeys(
				"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[27]/a")).getText();
		String exp_error_mess = "3.1 Please Enter Valid Father Name";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 43)
	public static void TC_FD_3_1_3() throws InterruptedException {
		System.out.println("TC_FD_3_1_3");
		WebElement surename = driver.findElement(By.id("fathersurname"));
		surename.sendKeys("J98ohN");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[28]/a")).getText();
		String exp_error_mess = "3.1.1 Please Enter Valid Father Surname";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 44)
	public static void TC_FD_3_1_4() throws InterruptedException {
		System.out.println("TC_FD_3_1_4");
		WebElement surename = driver.findElement(By.id("fathersurname"));
		surename.sendKeys(
				"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[28]/a")).getText();
		String exp_error_mess = "3.1.1 Please Enter Valid Father Surname";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 45)
	public static void TC_FD_3_5_1() throws InterruptedException {
		System.out.println("TC_FD_3_5_1");
		WebElement fpassportnumber = driver.findElement(By.id("fpassportnumber"));
		fpassportnumber.sendKeys(
				"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		submitbutton.click();

		System.out.println("Radio button not thier");

		Assert.fail();
	}

	// section 4 test case

	@Test(priority = 46)
	public static void TC_PR_4_1_1_2() throws InterruptedException {
		System.out.println("TC_PR_4_1_1_2");
		WebElement applicant_name = driver.findElement(By.id("street"));
		applicant_name.sendKeys("<-10$, New York Center");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_street")).getText();
		String exp_error_mess = "4.1.0 Please Enter Valid House NO. and Street";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 47)
	public static void TC_PR_4_1_1_3() throws InterruptedException {
		System.out.println("TC_PR_4_1_1_3");
		WebElement applicant_name = driver.findElement(By.id("street"));
		applicant_name.clear();
		applicant_name.sendKeys("ABC");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_street")).getText();
		String exp_error_mess = "4.1.0 Please Enter Valid House NO. and Street";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 48)
	public static void TC_PR_4_1_1_1() throws InterruptedException {
		System.out.println("TC_PR_4_1_1_1");
		WebElement applicant_name = driver.findElement(By.id("street"));
		applicant_name.clear();
		applicant_name.sendKeys("Liliya Mota, Amreli");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_street")).getText();
		String exp_error_mess = "";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 49)
	public static void TC_PR_4_1_2_1() throws InterruptedException {
		System.out.println("TC_PR_4_1_2_1");

		WebElement city_filed = driver.findElement(By.id("city"));
		city_filed.clear();
		WebElement district_filed = driver.findElement(By.id("district"));
		district_filed.clear();
		WebElement police_filed = driver.findElement(By.id("police"));
		// police_filed.clear();

		city_filed.sendKeys("Kalo90$#l");
		district_filed.sendKeys("ManjiPur901$%");
		police_filed.sendKeys("ManjiPur901$% Police Chowki");
		submitbutton.click();

		String actul_error_mess4_1_2_1 = driver.findElement(By.id("e_police")).getText();
		String exp_error_mess4_1_2_1 = "4.1.3 Please Enter Valid Nearest Police Station";
		Assert.assertEquals(actul_error_mess4_1_2_1, exp_error_mess4_1_2_1, "error message is mismatched");
		System.out.println("This error show:- " + exp_error_mess4_1_2_1);
	}

	@Test(priority = 50)
	public static void TC_PR_4_1_6_1() throws InterruptedException {
		System.out.println("TC_PR_4_1_6_1");
		WebElement applicant_name = driver.findElement(By.id("mnumber"));
		applicant_name.clear();
		applicant_name.sendKeys("123@#$%");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_mnumber")).getText();
		String exp_error_mess = "4.1.6 Please Enter Valid Mobile Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 51)
	public static void TC_PR_4_1_6_2() throws InterruptedException {
		System.out.println("TC_PR_4_1_6_2");
		WebElement applicant_name = driver.findElement(By.id("mnumber"));
		applicant_name.clear();
		applicant_name.sendKeys("123456789098");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_mnumber")).getText();
		String exp_error_mess = "4.1.6 Please Enter Valid Mobile Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 52)
	public static void TC_PR_4_1_6_3() throws InterruptedException {
		System.out.println("TC_PR_4_1_6_3");
		WebElement applicant_name = driver.findElement(By.id("mnumber"));
		applicant_name.clear();
		applicant_name.sendKeys("12345");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_mnumber")).getText();
		String exp_error_mess = "4.1.6 Please Enter Valid Mobile Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 53)
	public static void TC_PR_4_1_7_1() throws InterruptedException {
		System.out.println("TC_PR_4_1_7_1");
		WebElement applicant_name = driver.findElement(By.id("mail"));
		applicant_name.clear();
		applicant_name.sendKeys("abcd.com");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_mail")).getText();
		String exp_error_mess = "4.1.7 Please Enter Valid E-mail";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
	}

	@Test(priority = 54)
	public static void TC_PR_4_2_1() throws InterruptedException {
		System.out.println("TC_PR_4_2_1");

		WebElement radio1_4_1 = driver.findElement(By.id("16"));
		Thread.sleep(1000);
		radio1_4_1.click();
		WebElement radio1_4_2 = driver.findElement(By.id("no"));
		Thread.sleep(1000);
		radio1_4_2.click();
		Assert.assertFalse(radio1_4_1.isSelected());
		System.out.println("4.2.1 not allow multiple selection not allow");

	}// end of section 4 test cases

	// section 5 test case
	@Test(priority = 55)
	public static void TC_EC_5_1() throws InterruptedException {
		System.out.println("TC_EC_5_1");

		WebElement radio1_4_1 = driver.findElement(By.id("16"));
		Thread.sleep(1000);
		radio1_4_1.click();

		WebElement Emergency_5_1 = driver.findElement(By.id("Ename"));
		Assert.assertFalse(Emergency_5_1.isEnabled());
		System.out.println("4.2.1 not allow multiple selection not allow");

	}

	@Test(priority = 56)
	public static void TC_EC_5_2() throws InterruptedException {
		System.out.println("TC_EC_5_2");

		WebElement radio1_4_2 = driver.findElement(By.id("no"));
		Thread.sleep(1000);
		radio1_4_2.click();

		WebElement Emergency_5_1 = driver.findElement(By.id("Ename"));
		Emergency_5_1.sendKeys("Mohit");
		Assert.assertTrue(Emergency_5_1.isEnabled());
		System.out.println("4.2.1 not allow multiple selection not allow");
		submitbutton.click();
	}

	@Test(priority = 57)
	public static void TC_EC_5_3() throws InterruptedException {
		System.out.println("TC_EC_5_3");

		WebElement name_filed = driver.findElement(By.id("city"));
		name_filed.clear();
		WebElement district_filed = driver.findElement(By.id("district"));
		district_filed.clear();
		WebElement police_filed = driver.findElement(By.id("police"));
		// police_filed.clear();

		name_filed.sendKeys("Kalo90$#l");
		district_filed.sendKeys("ManjiPur901$%");
		police_filed.sendKeys("ManjiPur901$% Police Chowki");
		submitbutton.click();

		String actul_error_mess4_1_2_1 = driver.findElement(By.id("e_police")).getText();
		String exp_error_mess4_1_2_1 = "4.1.3 Please Enter Valid Nearest Police Station";
		Assert.assertEquals(actul_error_mess4_1_2_1, exp_error_mess4_1_2_1, "error message is mismatched");
		System.out.println("This error show:- " + exp_error_mess4_1_2_1);
	}// end of section 5 test cases

	// section 6 test case
	@Test(priority = 58)
	public void TC_PP_6_1_1_1() throws InterruptedException {

		System.out.println("TC_PP_6_1_1_1");
		driver.findElement(By.id("Fcheck")).click();

		WebElement Certificate_Number = driver.findElement(By.id("pnumber"));

		Assert.assertFalse(Certificate_Number.isEnabled(), "section is enable");
//		softAssert.assertAll();
	}

	@Test(priority = 59)
	public void TC_PP_6_1_1_2() throws InterruptedException {

		System.out.println("TC_PP_6_1_1_2");
		driver.findElement(By.id("Rcheck")).click();

		WebElement Certificate_Number = driver.findElement(By.id("pnumber"));
		Certificate_Number.sendKeys("ABC987654321");
		submitbutton.click();
		Thread.sleep(5000);

		String actul_error_mess = driver.findElement(By.xpath("/html/body/small[51]/a")).getText();
		String exp_error_mess = "6.1.1 Please Enter Valid Privious Passport Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//		softAssert.assertAll();
	}

	@Test(priority = 60)
	public void TC_PP_6_1_1_3() throws InterruptedException {

		System.out.println("TC_PP_6_1_1_3");
		driver.findElement(By.id("Rcheck")).click();

		WebElement Certificate_Number = driver.findElement(By.id("pnumber"));
		Certificate_Number.sendKeys("ABC98");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_pnumber")).getText();
		String exp_error_mess = "6.1.1 Please Enter Valid Privious Passport Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//		softAssert.assertAll();
	}

	@Test(priority = 61)
	public void TC_PP_6_1_1_4() throws InterruptedException {

		System.out.println("TC_PP_6_1_1_4");
		driver.findElement(By.id("Rcheck")).click();

		WebElement Certificate_Number = driver.findElement(By.id("pnumber"));
		Certificate_Number.sendKeys("ABC98$% PQ10");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_pnumber")).getText();
		String exp_error_mess = "6.1.1 Please Enter Valid Privious Passport Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//		softAssert.assertAll();
	}

// test case 62 and 63	

	@Test(priority = 62)
	public void TC_PP_6_1_2_1() throws InterruptedException {

		System.out.println("TC_PP_6_1_2_1");

		WebElement dateBox = driver.findElement(By.id("ddissue"));
		dateBox.sendKeys("31122025");
		submitbutton.click();

		Thread.sleep(5000);

		String actul_error_mess = driver.findElement(By.id("e_ddissue")).getText();
		String exp_error_mess = "8.2.2 Please Enter Valid DD Issue date";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//		softAssert.assertAll();

	}

	@Test(priority = 63)
	public void TC_PP_6_1_2_2() throws InterruptedException {

		System.out.println("TC_PP_6_1_2_2");

		WebElement dateBox2 = driver.findElement(By.id("ddexpiry"));
		dateBox2.sendKeys("3162008");
		submitbutton.click();

		Thread.sleep(5000);

		String actul_error_mess = driver.findElement(By.id("e_ddexpiry")).getText();
		String exp_error_mess = "8.2.3 Please Enter DD Expiry";
//		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);

	}

	@Test(priority = 64)
	public void TC_PP_6_1_3_1() throws InterruptedException {

		System.out.println("TC_PP_6_1_3_1");
		driver.findElement(By.id("Rcheck")).click();

		WebElement Certificate_place = driver.findElement(By.id("pissue"));
		Certificate_place.sendKeys("AHD87$@");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_pissue")).getText();
		String exp_error_mess = "6.1.4 Please Enter Valid Passport Place of Issue";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//		softAssert.assertAll();
	}

	@Test(priority = 65)
	public void TC_PP_6_2_1() throws InterruptedException {

		System.out.println("TC_PP_6_2_1");
		System.out.println("Section 6.2 not avaliable");
		Assert.fail();

	}

	@Test(priority = 66)
	public void TC_PP_6_2_2() throws InterruptedException {

		System.out.println("TC_PP_6_2_2");

		System.out.println("Section 6.2 not avaliable");

		Assert.fail();

	}// end of section 6 test case

	// section 7 test case

	@Test(priority = 67)
	public static void TC_OD_7() throws InterruptedException {
		System.out.println("TC_OD_7");

		WebElement radio7_1 = driver.findElement(By.id("18"));
		WebElement radio7_2 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[3]/div[4]/input"));

		WebElement radio7_3 = driver.findElement(By.id("19"));
		WebElement radio7_4 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[4]/div[4]/input"));

		WebElement radio7_5 = driver.findElement(By.id("20"));
		WebElement radio7_6 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[5]/div[4]/input"));

		WebElement radio7_7 = driver.findElement(By.id("21"));
		WebElement radio7_8 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[6]/div[4]/input"));

		WebElement radio7_9 = driver.findElement(By.id("22"));
		WebElement radio7_10 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[8]/div[4]/input"));

		WebElement radio7_11 = driver.findElement(By.id("23"));
		WebElement radio7_12 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[10]/div[4]/input"));

		WebElement radio7_13 = driver.findElement(By.id("24"));
		WebElement radio7_14 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[11]/div[4]/input"));

		WebElement radio7_15 = driver.findElement(By.id("25"));
		WebElement radio7_16 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[12]/div[4]/input"));

		WebElement radio7_17 = driver.findElement(By.id("26"));
		WebElement radio7_18 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[14]/div[4]/input"));

		WebElement radio7_19 = driver.findElement(By.id("27"));
		WebElement radio7_20 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[15]/div[4]/input"));

		WebElement radio7_21 = driver.findElement(By.id("28"));
		WebElement radio7_22 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[16]/div[4]/input"));

		WebElement radio7_23 = driver.findElement(By.id("29"));
		WebElement radio7_24 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[17]/div[4]/input"));

		WebElement radio7_25 = driver.findElement(By.id("30"));
		WebElement radio7_26 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[19]/div[4]/input"));

		WebElement radio7_27 = driver.findElement(By.id("31"));
		WebElement radio7_28 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[20]/div[4]/input"));

		WebElement radio7_29 = driver.findElement(By.id("32"));
		WebElement radio7_30 = driver.findElement(By.xpath("/html/body/div/div/form/div[10]/div[21]/div[4]/input"));

		radio7_1.click();
		radio7_2.click();

		radio7_3.click();
		radio7_4.click();

		radio7_5.click();
		radio7_6.click();

		radio7_7.click();
		radio7_8.click();

		radio7_9.click();
		radio7_10.click();

		radio7_11.click();
		radio7_12.click();

		radio7_13.click();
		radio7_14.click();

		radio7_15.click();
		radio7_16.click();

		radio7_17.click();
		radio7_18.click();

		radio7_19.click();
		radio7_20.click();

		radio7_21.click();
		radio7_22.click();

		radio7_23.click();
		radio7_24.click();

		radio7_25.click();
		radio7_26.click();

		radio7_27.click();
		radio7_28.click();

		radio7_29.click();
		radio7_30.click();

		Assert.assertFalse(radio7_1.isSelected());
		Assert.assertFalse(radio7_3.isSelected());
		Assert.assertFalse(radio7_5.isSelected());
		Assert.assertFalse(radio7_7.isSelected());
		Assert.assertFalse(radio7_9.isSelected());
		Assert.assertFalse(radio7_11.isSelected());
		Assert.assertFalse(radio7_13.isSelected());
		Assert.assertFalse(radio7_15.isSelected());
		Assert.assertFalse(radio7_17.isSelected());
		Assert.assertFalse(radio7_19.isSelected());
		Assert.assertFalse(radio7_21.isSelected());
		Assert.assertFalse(radio7_23.isSelected());
		Assert.assertFalse(radio7_25.isSelected());
		Assert.assertFalse(radio7_27.isSelected());
		Assert.assertFalse(radio7_29.isSelected());

		System.out.println("section 7 multiple selection are not avaliable");

	}// end of section 7 test case

	// section 8 test case

	@Test(priority = 68)
	public void TC_FD_8_1() throws InterruptedException {

		System.out.println("TC_FD_8_1");

		driver.findElement(By.id("fee")).sendKeys("87AB$%!@");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_fee")).getText();
		String exp_error_mess = "8.1 Please Enter Fee Amount";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//		softAssert.assertAll();

	}

	@Test(priority = 69)
	public void TC_FD_8_2() throws InterruptedException {

		System.out.println("TC_FD_8_1");

		driver.findElement(By.id("ddnumber")).sendKeys("1204561ABV%$!");
		submitbutton.click();

		String actul_error_mess = driver.findElement(By.id("e_ddnumber")).getText();
		String exp_error_mess = "8.2.1 Please Enter Valid DD Number";
		Assert.assertEquals(actul_error_mess, exp_error_mess, "error message is mismatched");
		System.out.println("This error show:- " + actul_error_mess);
//		softAssert.assertAll();

	}

}