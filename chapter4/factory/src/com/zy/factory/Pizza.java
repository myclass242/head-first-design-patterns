package com.zy.factory;

public class Pizza {
    public void prepare() {
        System.out.println("prepare");
    }

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }
}

class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.print("cheese ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("cheese ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("cheese ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("cheese ");
        super.box();
    }
}

class NYStyleCheesePizza extends CheesePizza {
    @Override
    public void prepare() {
        System.out.print("NYStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("NYStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("NYStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("NYStyle ");
        super.box();
    }
}

class ChicagoStyleCheesePizza extends CheesePizza {
    @Override
    public void prepare() {
        System.out.print("ChicagoStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("ChicagoStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("ChicagoStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("ChicagoStyle ");
        super.box();
    }
}

class CaliforniaStyleCheesePizza extends CheesePizza {
    @Override
    public void prepare() {
        System.out.print("CaliforniaStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("CaliforniaStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("CaliforniaStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("CaliforniaStyle ");
        super.box();
    }
}

class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.print("PepperoniPizza ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("PepperoniPizza ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("PepperoniPizza ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("PepperoniPizza ");
        super.box();
    }
}

class NYStylePepperoniPizza extends PepperoniPizza {
    @Override
    public void prepare() {
        System.out.print("NYStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("NYStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("NYStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("NYStyle ");
        super.box();
    }
}

class ChicagoStylePepperoniPizza extends PepperoniPizza {
    @Override
    public void prepare() {
        System.out.print("ChicagoStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("ChicagoStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("ChicagoStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("ChicagoStyle ");
        super.box();
    }
}

class CaliforniaStylePepperoniPizza extends PepperoniPizza {
    @Override
    public void prepare() {
        System.out.print("CaliforniaStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("CaliforniaStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("CaliforniaStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("CaliforniaStyle ");
        super.box();
    }
}

class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.print("ClamPizza ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("ClamPizza ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("ClamPizza ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("ClamPizza ");
        super.box();
    }
}

class NYStyleClamPizza extends ClamPizza {
    @Override
    public void prepare() {
        System.out.print("NYStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("NYStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("NYStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("NYStyle ");
        super.box();
    }
}

class ChicagoStyleClamPizza extends ClamPizza {
    @Override
    public void prepare() {
        System.out.print("ChicagoStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("ChicagoStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("ChicagoStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("ChicagoStyle ");
        super.box();
    }
}

class CaliforniaStyleClamPizza extends ClamPizza {
    @Override
    public void prepare() {
        System.out.print("CaliforniaStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("CaliforniaStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("CaliforniaStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("CaliforniaStyle ");
        super.box();
    }
}

class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.print("VeggiePizza ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("VeggiePizza ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("VeggiePizza ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("VeggiePizza ");
        super.box();
    }
}

class NYStyleVeggiePizza extends VeggiePizza {
    @Override
    public void prepare() {
        System.out.print("NYStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("NYStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("NYStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("NYStyle ");
        super.box();
    }
}

class ChicagoStyleVeggiePizza extends VeggiePizza {
    @Override
    public void prepare() {
        System.out.print("ChicagoStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("ChicagoStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("ChicagoStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("ChicagoStyle ");
        super.box();
    }
}

class CaliforniaStyleVeggiePizza extends VeggiePizza {
    @Override
    public void prepare() {
        System.out.print("CaliforniaStyle ");
        super.prepare();
    }

    @Override
    public void bake() {
        System.out.print("CaliforniaStyle ");
        super.bake();
    }

    @Override
    public void cut() {
        System.out.print("CaliforniaStyle ");
        super.cut();
    }

    @Override
    public void box() {
        System.out.print("CaliforniaStyle ");
        super.box();
    }
}
