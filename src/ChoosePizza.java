public class ChoosePizza {


    public static void getchoosePizza(){
    }

    public static Pizza choosePizza(String name){

        switch (name){
            case "3" : return new PizzaSalami();
            case "1" : return new PizzaMargarita();
            case "2" : return  new PizzaHawaii();

            default: return null;

        }
    }
}
