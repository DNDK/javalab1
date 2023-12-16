public class Coffee extends Food{
    String size = null;

    public Coffee(String size){
        super("Кофе");
        this.size = size;
    }

    public String toString(){
        return this.name + " объемом " + this.size;
    }
    @Override
    public void consume(){
        System.out.println(this + " выпито");
    }
    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(!(arg0 instanceof Coffee)) return false;
            return this.size.equals(((Coffee)arg0).size);
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



}

