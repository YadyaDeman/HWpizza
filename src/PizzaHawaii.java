public class PizzaHawaii extends Pizza{
    private String topping = "chiken and pineapple";
    private String dough="tall";

    public PizzaHawaii(String name,String dough,String sauce,String chesse,String topping){
        super(name,dough,sauce,chesse);
        this.topping=topping;
    }

    public PizzaHawaii() {
        super();
    }

    public void prepare(){
        super.prepare();
        System.out.println("Tall dough with chiken and pineapple and chesse");
    }

    public void bake(){
        super.bake();
        System.out.println("Bake 20 minutes, " );
    }

    public void pack(){
        super.pack();
        System.out.println("packaged in yelow box.");
    }

    public String toString(){
        super.toString();
        return "Pizza Hawaii with topping "+topping+"and tall duogh"+dough;
    }


}
