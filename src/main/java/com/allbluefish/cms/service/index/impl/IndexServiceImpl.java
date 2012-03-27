package com.allbluefish.cms.service.index.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.allbluefish.cms.model.Block;
import com.allbluefish.cms.service.index.IndexService;

@Service
public class IndexServiceImpl implements IndexService {

	public List<Block> listBlocks() {
		System.out.println("show some blocks!!");
		return null;
	}

	public Block newBlock(Integer nodeId, int size) {
		return null;
	}

	
}
