
/**
 * Write a description of class T here.
 *
 * @author Greg Johnson
 * @version 9/1/17
 */
public class T extends Tetrimino
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class T
     */
    public T(int x, int y)
    {
        super(new java.awt.Color(100,50,150));
        // initialise instance variables
        this.setLocation(x,y);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setLocation(int x, int y)
    {
        _x = x;
        _y = y;
        _block2.setLocation(x,y);
        _block1.setLocation(x+TetrisConstants.BLOCK_SIZE,y);
        _block3.setLocation(x+(2*TetrisConstants.BLOCK_SIZE),y);
        _block4.setLocation(x+TetrisConstants.BLOCK_SIZE,y+TetrisConstants.BLOCK_SIZE);
    }
}
