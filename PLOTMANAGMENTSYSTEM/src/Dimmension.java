public class Dimmension {
    private float front;
    private float back;
    private float left;
    private float right;

    Dimmension(float front, float back, float left, float right) {
        this.front = front;
        this.back = back;
        this.left = left;
        this.right = right;
    }

    public float getFront() {
        return front;
    }

    public float getBack() {
        return back;
    }

    public float getLeft() {
        return left;
    }

    public float getRight() {
        return right;
    }

    public void setFront(float front) {
        this.front = front;
    }

    public void setBack(float back) {
        this.back = back;
    }

    public void setLeft(float left) {
        this.left = left;
    }

    public void setRight(float right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("Front: %.2f m, Back: %.2f m, Left: %.2f m, Right: %.2f m", front, back, left, right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Dimmension dimmension = (Dimmension) o;
        return dimmension.getLeft() == left && dimmension.getRight() == right && dimmension.getFront() == front && dimmension.getBack() == back;}
}


