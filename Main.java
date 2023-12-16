public class Main {
    public static void main(String[] args) {
        int items_qty = 0;
        Food[] breakfast = new Food[20];
        for(String arg: args){
            String[] parts = arg.split("/");
            if(parts[0].equals("Cheese")){
                breakfast[items_qty] = new Cheese();
            }
            else if(parts[0].equals("Apple")){
                breakfast[items_qty] = new Apple(parts[1]);
            }
            else if(parts[0].equals("Eggs")){
                breakfast[items_qty] = new Eggs(Integer.parseInt(parts[1]));
            }
            else if(parts[0].equals("Coffee")){
                breakfast[items_qty] = new Coffee(parts[1]);
            }
            items_qty ++;
        }

        for(Food item: breakfast){
            if(item != null){
                item.consume();
            }
            else{
                break;
            }
        }

        System.out.println("au revoir");

    }
}