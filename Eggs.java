public class Eggs extends Food{
    int qty = 0;
    public Eggs(int qty){
        super("Яйца");
        this.qty = qty;
    }

    public String toString(){
        return super.toString() + " в количестве " + Integer.toString(qty) +  "шт.";
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public void consume(){
        System.out.println(this + " съедены");
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(!(arg0 instanceof Eggs)) return false;
            return this.qty == (((Eggs)arg0).qty);
        }
        else{
            return false;
        }
    }
}
