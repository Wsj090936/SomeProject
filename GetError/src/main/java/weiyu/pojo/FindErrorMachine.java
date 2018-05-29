package weiyu.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindErrorMachine {
	private Map<Integer,List<Node>> noWarning;//�豸����
	private Set<Integer> warning;//�澯�豸����
	private Map<String,List<Integer>> mergeMap;//�ϲ����ϣ�����keyΪ�澯�豸���ϣ�valueΪ�����豸����
	private Graph graph;//ͼ
	private String[][] colors = new String[14][14];//·����ɫ���ڽӾ���
	private int[] red = new int[]{1,2,3,12,6,7,13};
	private int[] green = new int[]{4,5,3,10,6};
	private int[] blue = new int[]{8,9,13,11};
	private List<Node_x_y> nodes;
	public FindErrorMachine(){
		noWarning = new HashMap<>();
		warning = new HashSet<>();
		graph = new Graph();
		mergeMap = new HashMap<>();
		for(int i = 10; i < 14;i++){//��ʼ���澯����E1 E2 E3 E4
			warning.add(i);
		}
	}
	/**
	 * ��Ҫʹ�ò��ҹ��ܣ������ȵ��ô˷������г�ʼ��
	 */
	public void intitMap(){
		nodesInsert();
		GraphInsert();
		mapInsert();
		mergeMapInsert();
		
	}
	public void nodesInsert(){//��ʼ�����꼯�ϣ�jspҳ��Ҫ��
		nodes = new ArrayList<>();
		nodes.add(new Node_x_y(1, 60, 300));
		nodes.add(new Node_x_y(2, 120, 300));
		nodes.add(new Node_x_y(3, 180, 300));
		nodes.add(new Node_x_y(4, 60, 370));
		nodes.add(new Node_x_y(5, 120, 370));
		nodes.add(new Node_x_y(6, 300, 300));
		nodes.add(new Node_x_y(7, 360, 300));
		nodes.add(new Node_x_y(8, 300, 450));
		nodes.add(new Node_x_y(9, 360, 370));
	}
	
	/**
	 * E1:10
	 * E2:11
	 * E3:12
	 * E4:13
	 */
	private Node GraphInsert(){
		Map<Integer, Node> nodes = graph.getNodes();
		Node head = new Node(Integer.MAX_VALUE);//ָ������ͼ��ͷ�ڵ�
		nodes.put(Integer.MAX_VALUE,head);
		
		Node n1 = new Node(red[0]);
		nodes.put(red[0],n1);
		head.nexts.add(n1);//����һ���ڵ����ͷ�ڵ��nexts
		
		
		Node n2 = new Node(green[0]);
		nodes.put(green[0],n2);
		head.nexts.add(n2);

		
		Node n3 = new Node(blue[0]);
		nodes.put(blue[0],n3);
		head.nexts.add(n3);

		//�Ƚ����е���뵽Map��
		Node newNode = null;
		for(int i = 1;i < red.length;i++){//��ʼ����ɫ
			newNode = new Node(red[i]);
			nodes.put(red[i], newNode);
			n1.nexts.add(newNode);
			colors[red[i-1]][red[i]] = "red";
			n1 = newNode;
		}
		pathInsert(n2,green,nodes,colors,"green");//��ʼ����ɫ��·
		pathInsert(n3,blue,nodes,colors,"blue");//��ʼ����ɫ��·

		return head;//��󷵻�ͷ�ڵ�
		
	}
	/**
	 * ��ʼ��һ��·
	 * @return
	 */
	private void pathInsert(Node head,int[] arr,Map<Integer,Node> nodes,String[][] colors,String color){
		Node newNode = null;
		for(int i = 1;i < arr.length;i++){
			newNode = nodes.get(arr[i]);
			if(newNode != null){//֮ǰ�Ѿ���ӹ��ýڵ�
				head.nexts.add(newNode);
				colors[arr[i-1]][arr[i]] = color;
			}else{
				newNode = new Node(arr[i]);
				nodes.put(arr[i], newNode);
				head.nexts.add(newNode);
				colors[arr[i-1]][arr[i]] = color;
			}
			head = newNode;
		}
		
	}
	/**
	 * ��ʼ���澯����
	 * @return
	 */
	private Map<Integer,List<Node>> mapInsert(){
		int[] machines = new int[]{1,2,3,4,5,6,7,8,9};
		for(int each : machines){
			noWarning.put(each, new ArrayList<>());//��ʼ��List
		}
		Map<Integer, Node> nodes = graph.getNodes();
		findPath(machines,nodes,"red");
		findPath(machines,nodes,"green");
		findPath(machines,nodes,"blue");
		return noWarning;
		
	}
	private void findPath(int[] arr,Map<Integer,Node> nodes,String color){//����ÿһ��·��
		Node cur = null;
		for(int i = 0;i < arr.length;i++){
			cur = nodes.get(arr[i]);
			dfs(cur,color);//��ʼ����noWaring����
		}
	}
	/**
	 * ����ͼ���ҵ�ÿ��·�϶�Ӧ�ĸ澯�豸�ڵ�,��������Ӿ�noWarning
	 * @return
	 */
	private void dfs(Node node,String color){
		if(node == null){
			return;
		}
		Stack<Node> stack = new Stack<>();
		HashSet<Node> set = new HashSet<>();//��֤��������Ԫ�ز��ظ�
		stack.add(node);
		set.add(node);
		while(!stack.isEmpty()){
			Node cur = stack.pop();
			for(Node each : cur.nexts){
				if(!set.contains(each)){
					if(colors[cur.value][each.value] == color){//����Ƕ�Ӧ��ɫ��·��
						stack.push(cur);
						stack.push(each);
						set.add(each);
						if(warning.contains(each.value)){//��������˸澯�豸
							noWarning.get(node.value).add(each);//������ӽ�Map
						}
							break;
					}
				}
			}
		}
	}
	/**
	 * ���ɺϲ�����
	 */
	private Map<String,List<Integer>> mergeMapInsert(){
		int temp;
		String key = "";
		for(Entry<Integer,List<Node>> each : noWarning.entrySet()){
			char[] keys = new char[]{'0','0','0','0'};
			for(Node e : each.getValue()){
				temp = e.value - 10;
				keys[temp] = '1';
			}
			for(int i = 0;i < keys.length;i++){
				key += keys[i];
			}
			if(mergeMap.get(key) == null){//���֮ǰ��ͬ�ĸ澯����û��ӹ�
				mergeMap.put(key, new ArrayList<>());
			}
			mergeMap.get(key).add(each.getKey());//��ʼ�ϲ��豸��
			key = "";
		}
		return mergeMap;
	}
	/**
	 * ��ѯ���Ͻڵ�ķ���
	 */
	public List<Node_x_y> getErrorNode(List<Integer> nums){
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���뷢���澯�źŵĽڵ�,ע�⣺����10~13�ֱ��ʾE1��E2��E3��E4�������������ֲ�ѯ�������,����0��������");
		char[] keys = new char[]{'0','0','0','0'};
		String key = "";
		int temp;
		for(Integer each : nums){
			temp = each;
			if(!warning.contains(temp)){//�в��Ǹ澯�ڵ�
				return null;
			}
			temp = temp - 10;
			keys[temp] = '1';
		}
		for(int i = 0;i < keys.length;i++){
			key += keys[i];
		}
		List<Integer> list = mergeMap.get(key);
		if(list == null){
			return null;
		}
		//���ܲ������ϵĽڵ�
		List<Node_x_y> xynodes = new ArrayList<>();
		for(Integer each : list){
			xynodes.add(nodes.get(each-1));//ȡ���ڵ��������
		}
		return xynodes;
	} 
	public Map<Integer, List<Node>> getNoWarning() {
		return noWarning;
	}
	public void setNoWarning(Map<Integer, List<Node>> noWarning) {
		this.noWarning = noWarning;
	}
	public Set<Integer> getWarning() {
		return warning;
	}
	public void setWarning(Set<Integer> warning) {
		this.warning = warning;
	}
	
}


