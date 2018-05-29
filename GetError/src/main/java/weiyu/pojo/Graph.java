package weiyu.pojo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
	private Map<Integer,Node> nodes;
	public Graph(){
		nodes = new HashMap<>();
	}
	public Map<Integer, Node> getNodes() {
		return nodes;
	}
	public void setNodes(Map<Integer, Node> nodes) {
		this.nodes = nodes;
	}
	
}
