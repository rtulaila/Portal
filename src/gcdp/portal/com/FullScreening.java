package gcdp.portal.com;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class FullScreening extends Base {

	public FullScreening() {
	login();
	}

	public void chooseProgram(String sprogram, String sorganization) 
	{
		sleep();
		selectFromDropdown("//*[@id=\"guideContainer-rootPanel-home-programId___widget\"]", sprogram);
		selectFromDropdown("//*[@id=\"guideContainer-rootPanel-home-organizationId___widget\"]", sorganization);
		click("//*[@id=\"guideContainer-rootPanel-home-button_continue___widget\"]/span[2]");

		sleep();
		click("/html/body/main/div[1]/div/a");

		fillFullScreen();
	}

	public void fillFullScreen() {

		driver.findElement(By.id("guideContainer-rootPanel-project-name___widget")).sendKeys("RT-June10-ScreeningAutomation02");
		driver.findElement(By.id("guideContainer-rootPanel-project-projectDescription___widget")).sendKeys("Project Description");
		driver.findElement(By.id("guideContainer-rootPanel-project-projectObjective___widget")).sendKeys("Project objective");
		driver.findElement(By.xpath("//button[@id='guideContainer-rootPanel-project-useOrgAddress___widget']/span[2]")).click();
		driver.findElement(By.name("guideContainer-rootPanel-project-plannedStartDate___jqName")).sendKeys("01/09/2020");
		driver.findElement(By.name("guideContainer-rootPanel-project-plannedEndDate___jqName")).sendKeys("12/09/2020");
		driver.findElement(By.id("guideContainer-rootPanel-project-isOnFederalLand__-1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-ruralLandDescription___widget")).sendKeys("Yes");
		driver.findElement(By.id("guideContainer-rootPanel-project-environmentalAuthorization__-1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-environmentalRisks__-1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-naicsCodeFullParentId___widget")).sendKeys("Agricultural Production");
		driver.findElement(By.id("guideContainer-rootPanel-project-naicsCodeFullId___widget")).sendKeys("111334: Berry Farming");
		driver.findElement(By.id("guideContainer-rootPanel-project-project_mandate-priorityGroupId___2_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-officialLanguageProjectActivitiesBool__-1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-officialLanguageOutsideQuebecBool__-1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-sectionProjectActivities-projectContainsOtherGovernmentFunding__-1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-sectionProjectActivities-projectContainsIndustryOrPartnerFunding__-1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-project-sectionProjectActivities-projectHasInkindContibutions__-1_widget")).click();
		driver.findElement(By.xpath("//button[@id='guideContainer-rootPanel-project-continue___widget']/span[2]")).click();		    
			sleep();
		driver.findElement(By.id("guideContainer-rootPanel-prjdocument-submit___widget")).click();
			sleep();
		driver.findElement(By.id("guideContainer-rootPanel-guidecheckbox___1_widget")).click();
		driver.findElement(By.id("guideContainer-rootPanel-submit___widget")).click();
			sleep();
		driver.findElement(By.xpath("//input[@value='Submit Application']")).click();
		
		System.out.println("Thank you for your submission !");
		//driver.findElement(By.xpath("//nav[@id='wb-auto-2']/div/button/span[2]")).click();
		//driver.findElement(By.linkText("Applications")).click();
	}

}
