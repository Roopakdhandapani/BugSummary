package Summary;

import java.util.ArrayList;
import java.util.List;

import static Common.getData.count;
import static Common.getData.getCount;
import static Common.viewClick.changeView;
import static Driver.urlMapper.url;
import static Summary.Constants.*;
import static Driver.driverName.driver;
import static Summary.getTableDataBS.getContentsBS;

public class urlSetter {
    public static String urlBS;
    public static List<String> urlList=new ArrayList<String>();
    public static void urlSet() {
        for (int j = 1; j <= 12; j++) {
            setConstants(j);
            if((j==3)||(j==6)||(j==9)||(j==12)) {
                urlBS = "priority%3A("+Priority+")&sort=extensions.backlog.priority+desc&selectedDocument=f7dfcc1d-f3a5-4387-b427-10a325e47392\")";
            } else {
                urlBS = "+priority%3A(" + Priority + ")+status%3A(" + Status + ")&sort=extensions.backlog.priority+desc&selectedDocument=f7dfcc1d-f3a5-4387-b427-10a325e47392";
            }
            driver.get(url+urlBS);
            changeView();
            getCount();
            urlList.add(url+urlBS);
            getContentsBS(count);
        }
    }
}
