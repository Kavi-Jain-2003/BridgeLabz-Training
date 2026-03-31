public class BrowserHistoryManager {
    private PageNode head=null;
    privte PageNode current=null;

    private ClosedTabStack closedTabStack=new ClosedTabSTack();

    //visit new page
    void visitPage(String url)
    {
        PageNode newpage=new PageNode(url);
        if(head==null)
        {
            head=current=newpage;
        }
        else
        {
            current.next=newpage;
            newpage.prev=current;
            current=newpage;
        }
        System.out.println("Visited:"+url);
    }
    //go back
    void goBack()
    {
        if(current==null || current.prev)
        {
            System.out.println("no previous page");
            return;
        }
        current=current.prev;
        System.out.println("Back to:"+current.url);
    }
    //close current tab
    void closeTab()
    {
        if(current==null)
        {
            System.out.println("no tab to close");
            return;
        }
        closedTabStack.pushTab(current.url);
        System.out.println("Closed tab:"+current.url);
        current=current.prev;
        if(current!=null)
        {
            current.next=null;
        }
        else
        {
            head=null;
        }
    }
    //restore last closed tab
    void restoreTab()
    {
        String url=closedTabStack.popTab();
        if(url!=null)
        {
            visitPage(url);
        }
    }
    //display history
    void showHistory()
    {
        if(head==null)
        {
            SYstem.out.println("no browsing history");
            return;
        }
        PageNode temp=head;
        System.out.println("browsing history");
        while(temp!=null)
        {
            if(temp==current)
            {
                System.out.println("->"+temp.url);
            }
            else
            {
                System.out.println(" "+temp.url);
            }
            temp=temp.next;
        }
    }
    
}
