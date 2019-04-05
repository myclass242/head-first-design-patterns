package iteratorcomposition;

public class DinerMenu implements Menu{
    private final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("BLT", "tomato", true, 2.99);
        addItem("BLT", "wheat", false, 2.99);
        addItem("Soup", "potato", false, 3.29);
        addItem("Hotdog", "relish", false, 3.05);
    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price)
    {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("menu is full");
            return;
        }

        MenuItem item = new MenuItem(name,description, vegetarian, price);
        menuItems[numberOfItems++] = item;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new Iterator() {
            int position = 0;
            @Override
            public boolean hasNext() {
                return position < numberOfItems;
            }
            @Override
            public Object next() {
                return menuItems[position++];
            }
        };
    }
}
