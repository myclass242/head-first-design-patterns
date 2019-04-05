package iteratorcomposition;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    MenuComponent allMenus;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        Iterator pIte = pancakeHouseMenu.createIterator();
        Iterator dIte = dinerMenu.createIterator();
        printMenu(pIte);
        printMenu(dIte);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.getName() + ',' + item.getDescription() + ','
            + item.isVegetarian() + ',' + item.getPrice());
        }
    }
    public void pritMenus() {
        allMenus.print();
    }
}
