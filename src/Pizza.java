public class Pizza {
    /* prepare()
       bake()
       pack()
       */

    public Pizza() {
        super();
    }

    private String name;
    public String getName(){
        return name;
    }

    private String dough= "thin";
    public String getdough() {
        return dough;
    }

    private String sauce= "tomato";
    public String getSause(){
        return sauce;
    }

    private String chesse="mozzarella";
    public String getChesse(){
        return chesse;
    }

    public Pizza (String name,String dough,String sauce,String chesse){
        this.name=name;
        this.dough=dough;
        this.sauce=sauce;
        this.chesse=chesse;
    }


    public void prepare(){
        System.out.println("Pizza preparation");
    }
    public void bake(){
        System.out.println("Baking pizza");
    }
    public void pack(){
        System.out.println("Pizza packaging");
    }


    public String toString(){
        return "Pizza '"+ name +"' on "+ dough+" dough with "+sauce+" and "+chesse+" chesse";
    }


}
