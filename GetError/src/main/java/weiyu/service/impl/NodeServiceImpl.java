package weiyu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weiyu.pojo.FindErrorMachine;
import weiyu.pojo.Node_x_y;
import weiyu.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService{
	@Autowired
	FindErrorMachine fe;


	@Override
	public List<Node_x_y> getErrorList(List<Integer> nums) {
		List<Node_x_y> errorNode = fe.getErrorNode(nums);
		return errorNode;
	}

}
