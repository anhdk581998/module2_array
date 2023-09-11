public class Rectangle {
    public int height;
    public int width;
    public Rectangle(int heightInput, int widthInput){
        this.height = heightInput;
        this.width = widthInput;
    }
    public int Area(){
        return this.width*this.height;
    }
    public int Circumference(){
        return (this.height+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
