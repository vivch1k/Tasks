package ru.mirea.lab7.ex2;


import ru.mirea.lab6.ex2.Movable;
import ru.mirea.lab6.ex2.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "x1 " + this.topLeft.x + ", y1 " + this.topLeft.y + ", x2 " + this.bottomRight.x + ", y2 " + this.bottomRight.y + ", x1Speed " + this.topLeft.xSpeed + ", x2Speed " + this.bottomRight.xSpeed + ", y1Speed " + this.topLeft.ySpeed + ", y2Speed " + this.bottomRight.ySpeed;
    }

    public boolean isSpeed() {
        return ((this.topLeft.xSpeed == this.bottomRight.xSpeed) && (this.topLeft.ySpeed == this.bottomRight.ySpeed));
    }

    @Override
    public void moveUp() {
        if (isSpeed()) {
            this.topLeft.x += this.topLeft.xSpeed;
            this.bottomRight.x += this.bottomRight.xSpeed;
        }
    }

    @Override
    public void moveDown() {
        if (isSpeed()) {
            this.topLeft.x -= this.topLeft.xSpeed;
            this.bottomRight.x -= this.bottomRight.xSpeed;
        }
    }

    @Override
    public void moveLeft() {
        if (isSpeed()) {
            this.topLeft.y -= this.topLeft.ySpeed;
            this.bottomRight.y -= this.bottomRight.ySpeed;
        }
    }

    @Override
    public void moveRight() {
        if (isSpeed()) {
            this.topLeft.y += this.topLeft.ySpeed;
            this.bottomRight.y += this.bottomRight.ySpeed;
        }
    }
}
