package com.allbluefish.cms.model.node;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.allbluefish.cms.model.user.User;

/**
 * 每条节点的详细内容
 * @author Blue
 *
 */
@Entity
public class Entry implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	private String title;
	
	@Lob
	private String content;
	
	private String plainText;
	
	@Temporal(TemporalType.DATE )
	private Date timeline = new Date();
	
	/**
	 * 所属节点
	 */
	@ManyToOne
	@JoinColumn(name="node_id")
	private Node belonged;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User author;
	
	/**
	 * 是否是超链接
	 */
	private boolean link;
	
	//private Image image;
	
	/**
	 * 点击数
	 */
	private int hits;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	public Date getTimeline() {
		return timeline;
	}

	public void setTimeline(Date timeline) {
		this.timeline = timeline;
	}

	public Node getBelonged() {
		return belonged;
	}

	public void setBelonged(Node belonged) {
		this.belonged = belonged;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public boolean isLink() {
		return link;
	}

	public void setLink(boolean link) {
		this.link = link;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	
	
}
