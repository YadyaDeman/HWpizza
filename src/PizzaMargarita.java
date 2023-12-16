public class PizzaMargarita extends Pizza{

    private final String sauce= " tomato and basil";
    private final String chesse=" mozzarella and cheddar";


    public PizzaMargarita(String name,String dough,String sauce,String chesse){
        super(name,dough,sauce,chesse);
    }

    public PizzaMargarita() {
        super();
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Thin dough with fresh tomatoes and chesse");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.print("Bake 20 minutes, " );
    }

    @Override
    public void pack() {
        super.pack();
        System.out.print("packaged in red box.");
    }


    @Override
    public String toString() {
        super.toString();
        return "Pizza Margarita with sauce '"+sauce+"'and chesse "+chesse;
    }
}
