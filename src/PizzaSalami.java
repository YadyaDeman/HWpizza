public class PizzaSalami extends Pizza {
    private String topping = "salami";

    public PizzaSalami() {
        super();
    }


    public String getTopping(){
        return topping;
    }

    public PizzaSalami(String name,String dough,String sauce,String chesse,String topping){
        super(name,dough,sauce,chesse);
        this.topping=topping;
    }

    public void prepare(){
        super.prepare();
        System.out.println("Thin dough with salami and chesse");
    }

    public void bake(){
        super.bake();
        System.out.println("Bake 20 minutes, " );
    }

    public void pack(){
        super.pack();
        System.out.println("packaged in white box.");
    }

    public String toString(){
        super.toString();
        return "Pizza Hawaii with topping "+topping;
    }


}
