public class ParcelTrackerManager {
    private ParcelStageNode head=null;
    
    //add stage at end
    void addSTage(String stage)
    {
        ParcelStageNode pnode=new ParcelStageNode(stage);

        if(head==null)
        {
            head=pnode;
            return;
        }
        ParcelStageNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=pnode;
    }
    //add stage after a given stage or checkpoints
    void addStageAfter(String existingStage, String newStage)
    {
        ParcelStageNode temp=head;
        while(temp!=null)
        {
            if(temp.stage.equals(existingStage))
            {
                ParcelStageNode pnode=new ParcelStageNode(newStage);
                pnode.next=temp.next;
                temp.next=pnode;
                System.out.println("checkpoint added");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Stage not found");
    }
    //track parcel forward
    void trackParcel()
    {
        if(head==null)
        {
            System.out.println("parcel is missing or not found");
            return;
        }
        ParcelStageNode temp=head;
        System.out.println("Parcel tracking");
        while(temp!=null)
        {
            System.out.println("->"+temp.stage);
            temp=temp.next;
        }
    }
    //check if parcel is last
    void checkParcelStatus()
    {
        if(head==null)
        {
            System.out.println("parcel lost(null pointer");
        }
        else
        {
            System.out.println("parcel is being tracked");
        }
    }
}
