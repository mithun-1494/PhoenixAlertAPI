package steps;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Feature;

import Base.BaseUtil;
//import cucumber.api.PickleStepTestStep;
//import cucumber.api.TestCase;
//import gherkin.pickles.PickleStep;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;



public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }
    
    @Before
    public String InitializeTest(Scenario scenario) {
      
//    	BaseUtil.scenarioDef = base.features.createNode(scenario.getId());
    	ExtentTest features = base.extent.createTest(Feature.class, "incident_details");
//    	System.out.println("Initialize ...... " + scenario.getName()+".....");
  
    	    String featureName = "Feature ";
    	    String rawFeatureName = scenario.getId().split(";")[0].replace("-"," ");
    	    featureName = featureName + rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
    	    System.out.println("Test Header"+featureName);
    	    
    	    return featureName;
    	}


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName()+"......");
        }
        System.out.println("End of the Scenario......");

		
    }

    @BeforeStep
    public void BeforeEveryStep(Scenario scenario) {
        System.out.println("Before every step...... " + scenario.getName()+".....");
    }

    @AfterStep
    public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("After every step...... " + scenario.getId()+".....");
    }

}
