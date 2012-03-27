package com.allbluefish.cms.service.index;

import java.util.List;

import com.allbluefish.cms.model.Block;

public interface IndexService {
	
	/**
	 * 新建块区
	 * @param node 节点类型
	 * @param size  节点总数
	 * @return
	 */
	Block newBlock(Integer nodeId, int size);

	/**
	 * 加载出首页显示的块
	 * @return
	 */
	List<Block> listBlocks();
}
