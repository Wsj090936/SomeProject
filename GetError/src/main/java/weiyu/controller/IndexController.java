package weiyu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import weiyu.pojo.Node1;
import weiyu.pojo.Node_x_y;
import weiyu.service.NodeService;

@Controller
public class IndexController {
	@Autowired
	private NodeService nsi;
	
	@RequestMapping("index")
	public String getIndexpage(){
		return "index";
	}
	@RequestMapping("getNode")
	public String getErroeNode(String voice,Model model){
		long startTime = System.nanoTime();
		model.addAttribute("nodeString", voice);
		try {
			if (voice == "") {
				model.addAttribute("list", null);
			} else {
				String[] strings = voice.split(",");
				List<Integer> nums = new ArrayList<>();
				for (int i = 0; i < strings.length; i++) {
					nums.add(Integer.parseInt(strings[i]));
				}
				List<Node_x_y> errorList = nsi.getErrorList(nums);//传入告警节点id  返回可能故障的节点
				model.addAttribute("list", errorList);
			} 
		} catch (Exception e) {
			return "index";
		}finally{
			long endTime = System.nanoTime();
			model.addAttribute("time",endTime-startTime);
		}
		return "index";
	}
	@RequestMapping("getString")
	@ResponseBody
	public  List<Node_x_y> getNode(String nodeString){
		String[] strings = nodeString.split(",");
		List<Node_x_y> errorList = null;//传入告警节点id  返回可能故障的节点
		try {
			List<Integer> nums = new ArrayList<>();
			for (int i = 0; i < strings.length; i++) {
				nums.add(Integer.parseInt(strings[i]));
			}
			errorList = nsi.getErrorList(nums);
		} catch (Exception e) {
			return null;
		}

		return errorList;//返回坐标节点
	}
}
