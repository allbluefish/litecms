package com.allbluefish.cms.service.node.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.allbluefish.cms.dao.node.EntryDao;
import com.allbluefish.cms.model.node.Entry;
import com.allbluefish.cms.model.node.Node;
import com.allbluefish.cms.service.node.EntryService;
import com.allbluefish.cms.util.PageIndex;

@Service
@Transactional
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryDao entryDao;
	
	public void save(Entry t) {
		this.entryDao.save(t);
	}

	public void delete(Entry t) {
		// TODO Auto-generated method stub

	}

	public void update(Entry t) {
		// TODO Auto-generated method stub

	}

	public Entry findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entry> listEntryByBlockSize(int size, Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entry> listAll(PageIndex pageIndex) {
		return this.entryDao.list(pageIndex);
	}

}
