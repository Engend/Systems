public class Main {
    static Rectangle getRect() {
        return new Rectangle();
    }
    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(10);
        rectangle.setWith(5);
        System.out.println(rectangle.getSquare());
    }
}

interface Shape {
    int getSquare();
}

class Rectangle implements Shape {
    int with;
    int height;

    public int getWith () {
        return with;
    }

    public void setWith (int with) {
        this.with = with;
    }

    public int getHeight () {
        return height;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    @Override
    public int getSquare () {
        return with * height;
    }
}

class Square implements Shape {

    int with;

    public int getWith () {
        return with;
    }

    public void setWith (int with) {
        this.with = with;
    }

    public int getSquare () {
        return with * with;
    }
}