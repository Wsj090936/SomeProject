package weiyu.pojo;
/**
 * 保存着X Y坐标得对象
 * @author wushijia
 *
 */
public class Node_x_y {
	private int index;
	private int x;
	private int y;
	
	public Node_x_y(int index,int x,int y){
		this.index = index;
		this.x = x;
		this.y = y;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
