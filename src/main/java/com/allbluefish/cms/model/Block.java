package com.allbluefish.cms.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.allbluefish.cms.model.node.Node;

@Entity
@Table(name="T_BLOCK")
public class Block implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	private Node node;
	
	@Column(name = "b_size")
	private int size;
	
	@Column(name = "b_index", unique = true)
	private int index;
	
	Block() {
		// for hibernate
	}

	public Block(Node node, int size, int index) {
		this.node = node;
		this.size = size;
		this.index = index;
	}
	
	public void changeNode(Node newNode) {
		this.node = newNode;
	}
	
	public void changeSize(int size) {
		this.size = size;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Node getNode() {
		return node;
	}
	
	public String getName() {
		if (node == null)  return null; 
		return node.getName();
	}

	public int getSize() {
		return size;
	}


	public int getIndex() {
		return index;
	}
}
