import java.util.Stack;
public class ClosedTabSTack {
    private Stack<String> closedTabs=new Stack<>();
    void pushTab(String url)
    {
        closedTabs.push(url);
        SYstem.out.println("tab saved for restore");
    }
    String popTab()
    {
        if(closedTabs.isEmpty())
        {
            System.out.println("no closed tab for restore");
            return null;
        }
        return closedTabs.pop();
    }
    
}
