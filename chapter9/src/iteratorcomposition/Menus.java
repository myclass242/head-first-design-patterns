package iteratorcomposition;


import java.util.*;
import java.util.Iterator;

public class Menus extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menus(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.print("," + getDescription());

        Iterator<MenuComponent> ite = menuComponents.iterator();
        while (ite.hasNext()) {
            MenuComponent menuComponent = ite.next();
            menuComponent.print();
        }
        System.out.println("----------------------");
    }
}
