package initiator;
import frameworklibrary.BatchFileConfig;
import frameworklibrary.Config;
import frameworklibrary.ExecutionController;
import frameworklibrary.Report;
import frameworklibrary.StaticDataManager;


public class Initiator {

	public static void main(String args[]){

		
		System.out.println("Initiator has been trigerred successfully");

		Config.readConfigFile();
		
		

		if(args.length>0){
			for(String param:args)
				BatchFileConfig.setConfigValue(param);
		}
		
		
		ExecutionController.readExecutionControllerExcel();
		Report.createResultDirectory();
		StaticDataManager.readConfigFile();	
		ExecutionController.doTestExecution();
		Report.openTestSummaryReport();
		System.out.println("Execution has come to End successfully");

	}
	
}


