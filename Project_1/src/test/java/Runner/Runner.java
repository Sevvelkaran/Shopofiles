package Runner;

//	import org.testng.annotations.DataProvider;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
		import io.cucumber.testng.CucumberOptions;

		@CucumberOptions(
		    plugin = {
		        "pretty",
		        "json:target/cucumber-reports/Cucumber.json",
		        
		    },
		    		
		    features = {
//		    	   "src/test/java/com.Resources/Login.feature",
		    	   "src/test/java/com.Resources/Home.feature",
		  	      
		    },
		    glue = "Definations",
		    monochrome = false,
		    dryRun = false
		)
		public class Runner extends AbstractTestNGCucumberTests {
//			@Override
//		    @DataProvider(parallel=true)
//		    public Object[][] scenarios() {
//		        return super.scenarios();
//		    }
		}

