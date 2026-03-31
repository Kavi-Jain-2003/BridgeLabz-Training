//inventorynode class
class InventoryNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryNode next;

    InventoryNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventorymanagementSystem {
    InventoryNode head = null;

    // adding item from end
    void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        InventoryNode inode = new InventoryNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = inode;
            return;
        }
        InventoryNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = inode;
    }

    // adding item at specific position
    void addItemAtSpecificPosition(String itemName, int itemId, int quantity, double price, int position) {
        InventoryNode inode = new InventoryNode(itemName, itemId, quantity, price);
        if (position == 1)// adding at start
        {
            inode.next = head;
            head = inode;
            return;
        }
        InventoryNode temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("invalid position");
            return;
        }
        inode.next = temp.next;
        temp.next = inode;

    }

    // inserting at beginning
    void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        InventoryNode inode = new InventoryNode(itemName, itemId, quantity, price);
        inode.next = head;
        head = inode;

    }

    // removing an item
    void removeItem(int itemId) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("item having " + itemId + " is removed");
            return;
        }
        InventoryNode temp = head;
        while (temp.next != null) {
            if (temp.next.itemId == itemId) {
                temp.next = temp.next.next;
                System.out.println("item having " + itemId + " is removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("item not found");
    }

    // updating item
    void updateItem(int itemId, int newQuantity) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("qunatity for item:" + itemId + " is updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("iem not found to update");

    }

    // search item by name
    void searchItemByName(String itemName) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemName.equals(itemName)) {
                System.out.println("item " + itemName + " found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("item not found");
    }
    // Search by Item ID
    void searchById(int itemId) {
        InventoryNode temp = head;

        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Item Found: " + temp.itemName);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }


    // total inventory value
    void totalValue() {
        double sum = 0;
        InventoryNode temp = head;
        while (temp != null) {
            sum = sum + (temp.price * temp.quantity);
            temp = temp.next;
        }
        System.out.println("total Amount:" + sum);
    }

    // display
    void display() {
        InventoryNode temp = head;
        while (temp != null) {
            System.out.println(
                    temp.itemName + " | " + temp.itemId + " | " +
                            temp.quantity + " | " + temp.price);
            temp = temp.next;

        }
    }

    // sort by price
    void sortByPrice() {
        if (head == null) {
            return;
        }
        InventoryNode i, j;
        for (i = head; i.next != null; i = i.next) {
            for (j = head; j.next != null; j = j.next) {
                if (j.price < i.price) {
                    swap(j, j.next);
                }
            }
        }

    }

    // swap
    void swap(InventoryNode a, InventoryNode b) {
        String name = a.itemName;
        int id = a.itemId;
        int qty = a.quantity;
        double pr = a.price;
        a.itemName = b.itemName;
        a.itemId = b.itemId;
        a.quantity = b.quantity;
        a.price = b.price;
        b.itemName = name;
        b.itemId = id;
        b.quantity = qty;
        b.price = pr;

    }

    public static void main(String[] args) {
        InventorymanagementSystem i = new InventorymanagementSystem();
        i.addItemAtEnd("Tea", 101, 2, 20);
        i.addItemAtEnd("Sugar", 102, 3, 40);
        i.addItemAtBeginning("Salt", 103, 1, 10);

        i.display();
        i.updateItem(101, 5);
        i.searchItemByName("Sugar");
        i.totalValue();

        i.sortByPrice();
        System.out.println("After Sorting:");
        i.display();
    }

}
