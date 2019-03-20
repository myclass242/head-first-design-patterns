package com.zy.factory;

public abstract class PizzaStore {
    SimplePizzaFactory factory;

//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

class NYPPizzaStore extends PizzaStore {
//    NYPPizzaStore()
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if(type.equals("Veggie")) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}

class ChicagoPizzaStore extends PizzaStore {
    //    NYPPizzaStore()
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if(type.equals("Veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}

class CaliforniaPizzaStore extends PizzaStore {
    //    NYPPizzaStore()
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if(type.equals("Veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }

        return pizza;
    }
}