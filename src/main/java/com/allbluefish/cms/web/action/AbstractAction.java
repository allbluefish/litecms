package com.allbluefish.cms.web.action;

import org.springframework.http.HttpHeaders;



public abstract class AbstractAction{

	protected static final String LIST = "list";
	
	protected static final String INDEX = "index";
	
	protected static final String SHOW = "show";
	
	protected static final String CREATE = "create";
	
	protected static final String NEW = "new";
	
	protected static final String EDIT = "edit";
	
	protected static final String UPDATE = "update";
	
	protected static final String DESTROY = "destroy";
	
	protected static final String SUCCESS = "success";
	
	protected static final String TIP = "tip";
	
	protected static final String EDITNEW = "editNew";
	
	protected static final String NO_RIGHT = "noRight";
	
	protected static final String TO_INDEX = "toIndex";
	
	protected static final int SMALL_NUMBER = 5;
    
	protected static final int MEDIUM_NUMBER = 10;
    
	protected static final int LARGE_NUMBER = 15;
	
	protected static final int SUPER_LARGE_NUMBER = 25;
	
	public abstract HttpHeaders index();

	public abstract HttpHeaders show();

	public abstract HttpHeaders create();

	public abstract HttpHeaders editNew();

	public abstract String update();

	public abstract String edit();

	public abstract String destroy();
	
}
