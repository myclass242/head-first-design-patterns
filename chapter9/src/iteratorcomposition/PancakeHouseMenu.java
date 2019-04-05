package iteratorcomposition;


import java.util.*;

public class PancakeHouseMenu implements Menu{
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("KB", "eggs and toast", true, 2.99);
        addItem("Regular", "eggs and sausage", false, 2.99);
        addItem("BlueBerry", "fresh", false, 3.59);
        addItem("Waffles", "blue", true, 3.59);
    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price)
    {
        MenuItem item = new MenuItem(name,description, vegetarian, price);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new Iterator() {
            int position = 0;
            @Override
            public boolean hasNext() {
                return position < menuItems.size();
            }
            @Override
            public Object next() {
                return menuItems.get(position++);
            }
        };
    }
}
