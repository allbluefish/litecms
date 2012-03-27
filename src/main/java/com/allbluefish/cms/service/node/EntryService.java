package com.allbluefish.cms.service.node;

import java.util.List;

import com.allbluefish.cms.model.node.Entry;
import com.allbluefish.cms.model.node.Node;
import com.allbluefish.cms.service.BasicService;
import com.allbluefish.cms.util.PageIndex;

public interface EntryService extends BasicService<Entry> {
	
	/**
	 * 根据每个块所放节点的个数取出节点里的详细
	 * @param size
	 * @param node
	 * @return
	 */
	List<Entry> listEntryByBlockSize(int size, Node node);
	
	List<Entry> listAll(PageIndex pageIndex);
}
