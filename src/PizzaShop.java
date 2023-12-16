public class PizzaShop {

import java.util.Scanner;


import java.util.Scanner;

import static OnlinePizzaShop.ChoosePizza.choosePizza;


    public class PizzaShop {
        public static void main(String[] args) {


            Scanner shop = new Scanner(System.in);
            System.out.println("Select pizza number \n" +
                    " 1 : PizzaMargarita();\n" +
                    " 2 : PizzaHawaii()"+
                    " 3 :PizzaSalami();\n" );
            String name = shop.nextLine();

            switch (name) {
                case "1":
                    System.out.println(choosePizza("1"));

                    break;
                case "2":
                    System.out.println(choosePizza("2"));
                    break;
                case "3":
                    System.out.println(choosePizza("3"));
                    break;
                case "Yes":
                    System.out.println("Choose another pizza. Which one would you like to order?");
                case "now":
                    System.out.println("Thanks for your order");
                default:
                    System.out.println("We don't have this kind of pizza");
            }
            System.out.println("Select yes or now");

        }    }
}
