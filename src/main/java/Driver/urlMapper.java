package Driver;


import java.util.Scanner;

import static Driver.driverName.driver;
import static Driver.initializeDriver.driverCall;


public class urlMapper {
    public static String folderName;
    public static String url;
    public static void getUrl() {
       // Scanner getFolderName= new Scanner(System.in);
        //System.out.println("Please provide Folder name:");
        //folderName = getFolderName.nextLine();
        //url = "https://sim.amazon.com/issues/search?q=containingFolder%3A(" + folderName + ")";
        String urlOI = "https://issues.amazon.com/issues/search?q=containingFolder%3A(89caeb30-4e1e-4bee-9967-c4ac79ff15b6+OR+0436fe28-bffc-42fa-8f78-04a3036ecb37)+createDate%3A(%5B2022-02-28T18%3A30%3A00.000Z..2022-03-16T18%3A30%3A00.000Z%5D)&sort=lastUpdatedConversationDate+desc&selectedDocument=ebbdd166-18f9-4d4d-b793-1a20404ff306";
        String url0II= "+nextStepAction%3A(%22Comment+by+PM%22)&sort=extensions.backlog.priority+desc&selectedDocument=f7dfcc1d-f3a5-4387-b427-10a325e47392";
        String url0III= "+status%3A(Resolved)&sort=lastUpdatedDate+desc&selectedDocument=a52c4bfd-c1f8-4e75-b423-815fdb232653";
        driverCall();
        driver.get(urlOI);


        switch(flag){
            case 1:
                String loadSimPagePm = (simPageUrl2+Constants.SIM_PAGE_URL_WITH_STATUS_OPEN +
                        Constants.SIM_PAGE_URL_WITH_NEXT_STEP_ACTION_PM);
                driver.navigate().to(loadSimPagePm);
                break;
            case 2:
                String UrlOpenStatusSde = loadSimPageSde();
                driver.navigate().to(loadSimPageSde());
                break;
            case 3:
                String UrlResolvedStatus = loadSimPageResolved();
                driver.navigate().to(loadSimPageResolved());
                break;
        }
    }
}
