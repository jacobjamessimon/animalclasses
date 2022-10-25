public class Mammal extends Animal {

    Mammal(float h, float w){
        super(h,w);
    }
    Mammal(float h, float w, int numLegs){
       this(h,w);
        this.numLegs=numLegs;
    }
    private int numLegs;
}
