package weiyu.pojo;

import java.util.ArrayList;
import java.util.List;
/**
 * ͼ�Ľڵ�
 * @author wushijia
 *��Ա����˵����
 *		value���ڵ��ֵ
 *		nexts���Ӹýڵ�������ܹ�����Ľڵ�
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
