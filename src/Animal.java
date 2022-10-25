public class Animal {
    public Animal(float h, float w) {
        this(h);
        this.weight=w;
    }
    public Animal(float h) {
        this();
        this.height=h;
    }
    public Animal() {
    }

    private float height, weight;
    @Override
    public String toString(){
        return this.getClass().getName();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
