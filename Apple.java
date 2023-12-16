public class Apple extends Food{
    String size = null;
    public Apple(String size){
        super("Яблоко");
        this.size = size;
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(!(arg0 instanceof Apple)) return false;
            return this.size.equals(((Apple)arg0).size);
        }
        else{
            return false;
        }
    }

    public String getSize(){
        return this.size;
    }

    public void setSize(String size){
        this.size = size;
    }

    @Override
    public void consume(){
        System.out.println(this + " съедено");
    }

    public String toString() {
        return super.toString() + " размера " + this.size;
    }
}
