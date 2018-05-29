package weiyu.pojo;

import java.util.ArrayList;
import java.util.List;
/**
 * 图的节点
 * @author wushijia
 *成员变量说明：
 *		value：节点的值
 *		nexts：从该节点出发，能够到达的节点
 *				
 */
public class Node {
	public int value;
	public List<Node> nexts;
	public Node(int value){
		this.value = value;
		nexts = new ArrayList<Node>();
	}
}
