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
	private Map<Integer,List<Node>> noWarning;//设备集合
	private Set<Integer> warning;//告警设备集合
	private Map<String,List<Integer>> mergeMap;//合并集合，其中key为告警设备集合，value为故障设备名称
	private Graph graph;//图
	private String[][] colors = new String[14][14];//路径颜色的邻接矩阵
	private int[] red = new int[]{1,2,3,12,6,7,13};
	private int[] green = new int[]{4,5,3,10,6};
	private int[] blue = new int[]{8,9,13,11};
	private List<Node_x_y> nodes;
	public FindErrorMachine(){
		noWarning = new HashMap<>();
		warning = new HashSet<>();
		graph = new Graph();
		mergeMap = new HashMap<>();
		for(int i = 10; i < 14;i++){//初始化告警集合E1 E2 E3 E4
			warning.add(i);
		}
	}
	/**
	 * 想要使用查找功能，必须先调用此方法进行初始化
	 */
	public void intitMap(){
		nodesInsert();
		GraphInsert();
		mapInsert();
		mergeMapInsert();
		
	}
	public void nodesInsert(){//初始化坐标集合，jsp页面要用
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
		Node head = new Node(Integer.MAX_VALUE);//指定整个图的头节点
		nodes.put(Integer.MAX_VALUE,head);
		
		Node n1 = new Node(red[0]);
		nodes.put(red[0],n1);
		head.nexts.add(n1);//将第一个节点存入头节点的nexts
		
		
		Node n2 = new Node(green[0]);
		nodes.put(green[0],n2);
		head.nexts.add(n2);

		
		Node n3 = new Node(blue[0]);
		nodes.put(blue[0],n3);
		head.nexts.add(n3);

		//先将所有点加入到Map中
		Node newNode = null;
		for(int i = 1;i < red.length;i++){//初始化红色
			newNode = new Node(red[i]);
			nodes.put(red[i], newNode);
			n1.nexts.add(newNode);
			colors[red[i-1]][red[i]] = "red";
			n1 = newNode;
		}
		pathInsert(n2,green,nodes,colors,"green");//初始化绿色的路
		pathInsert(n3,blue,nodes,colors,"blue");//初始化蓝色的路

		return head;//最后返回头节点
		
	}
	/**
	 * 初始化一条路
	 * @return
	 */
	private void pathInsert(Node head,int[] arr,Map<Integer,Node> nodes,String[][] colors,String color){
		Node newNode = null;
		for(int i = 1;i < arr.length;i++){
			newNode = nodes.get(arr[i]);
			if(newNode != null){//之前已经添加过该节点
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
	 * 初始化告警集合
	 * @return
	 */
	private Map<Integer,List<Node>> mapInsert(){
		int[] machines = new int[]{1,2,3,4,5,6,7,8,9};
		for(int each : machines){
			noWarning.put(each, new ArrayList<>());//初始化List
		}
		Map<Integer, Node> nodes = graph.getNodes();
		findPath(machines,nodes,"red");
		findPath(machines,nodes,"green");
		findPath(machines,nodes,"blue");
		return noWarning;
		
	}
	private void findPath(int[] arr,Map<Integer,Node> nodes,String color){//遍历每一条路径
		Node cur = null;
		for(int i = 0;i < arr.length;i++){
			cur = nodes.get(arr[i]);
			dfs(cur,color);//开始生成noWaring集合
		}
	}
	/**
	 * 遍历图，找到每条路上对应的告警设备节点,并将其添加经noWarning
	 * @return
	 */
	private void dfs(Node node,String color){
		if(node == null){
			return;
		}
		Stack<Node> stack = new Stack<>();
		HashSet<Node> set = new HashSet<>();//保证遍历到的元素不重复
		stack.add(node);
		set.add(node);
		while(!stack.isEmpty()){
			Node cur = stack.pop();
			for(Node each : cur.nexts){
				if(!set.contains(each)){
					if(colors[cur.value][each.value] == color){//如果是对应颜色的路径
						stack.push(cur);
						stack.push(each);
						set.add(each);
						if(warning.contains(each.value)){//如果遇到了告警设备
							noWarning.get(node.value).add(each);//将其添加进Map
						}
							break;
					}
				}
			}
		}
	}
	/**
	 * 生成合并集合
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
			if(mergeMap.get(key) == null){//如果之前相同的告警集合没添加过
				mergeMap.put(key, new ArrayList<>());
			}
			mergeMap.get(key).add(each.getKey());//开始合并设备集
			key = "";
		}
		return mergeMap;
	}
	/**
	 * 查询故障节点的方法
	 */
	public List<Node_x_y> getErrorNode(List<Integer> nums){
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("输入发出告警信号的节点,注意：数字10~13分别表示E1、E2、E3、E4，输入其他数字查询不到结果,输入0结束输入");
		char[] keys = new char[]{'0','0','0','0'};
		String key = "";
		int temp;
		for(Integer each : nums){
			temp = each;
			if(!warning.contains(temp)){//有不是告警节点
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
		//可能产生故障的节点
		List<Node_x_y> xynodes = new ArrayList<>();
		for(Integer each : list){
			xynodes.add(nodes.get(each-1));//取到节点坐标对象
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


