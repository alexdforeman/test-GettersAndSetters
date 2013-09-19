/**
 * 
 */
package com.alexdforeman.gastest;

/**
 * Pointless Classes for the purposes of a test.
 * @author https://github.com/alexdforeman
 *
 */
class A {

    public int _x;
    public int _y;

    A(int x_, int y_) { _x = x_; _y = y_; }
}

class B {

    private int _x;
    private int _y;

    B(int x_, int y_) { setX(x_); setY(y_); }

    /**
     * Getter.
     * @return the _x
     */
    public int getX() {
        return _x;
    }
    /**
     * Setter.
     * @param _x the x_ to set
     */
    public void setX(int x_) {
        _x = x_;
    }
    /**
     * Getter.
     * @return the _y
     */
    public int getY() {
        return _y;
    }
    /**
     * Setter.
     * @param _y the y_ to set
     */
    public void setY(int y_) {
        _y = y_;
    }
}
