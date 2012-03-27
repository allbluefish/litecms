package com.allbluefish.cms.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.allbluefish.cms.model.Block;
import com.allbluefish.cms.model.node.Entry;
import com.allbluefish.cms.service.index.IndexService;
import com.allbluefish.cms.service.node.EntryService;

@Controller
public class IndexController {


	private List<Block> blocks;
	
    private Map<Integer, List<Entry>> entrysMap;
	
    @Autowired
	private IndexService indexService;

    @Autowired
	private EntryService entryService;
	
	public Map<Integer, List<Entry>> getEntrysMap() {
		return entrysMap;
	}

	public void setEntrysMap(Map<Integer, List<Entry>> entrysMap) {
		this.entrysMap = entrysMap;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	/**
	 * 首页展示
	 */
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index() {
		this.blocks = this.indexService.listBlocks();
		Map<Integer, List<Entry>> map = new HashMap<Integer, List<Entry>>();
    	for (Block b : blocks) {
    		List<Entry> entries = this.entryService.listEntryByBlockSize(b.getSize(), b.getNode());
    		map.put(b.getId(), entries);
    	}
    	setEntrysMap(map);
		return "index";
	}

	@RequestMapping(value = "/login/{user}", method = RequestMethod.GET)
	public ModelAndView myMethod(@PathVariable("user") String user,
			ModelMap modelMap) throws Exception {
		modelMap.put("loginUser", user);
		return new ModelAndView("/login/hello", modelMap);
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String registPost() {
		return "/welcome";
	}
	
	@RequestMapping("/noPara")
	public void noParameter(){
		System.out.println("show some word!");
	}
	
}
