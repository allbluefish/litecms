package com.allbluefish.cms.web.action.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.allbluefish.cms.model.node.Entry;
import com.allbluefish.cms.service.node.EntryService;

@Controller
@RequestMapping("/entry")
public class EntryController {

	@Autowired
	private EntryService entryService;

	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String addEntry(Entry entry){
		this.entryService.save(entry);
		return "";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String toAddEntry(){
		return "/node/entry-add";
	}
}
