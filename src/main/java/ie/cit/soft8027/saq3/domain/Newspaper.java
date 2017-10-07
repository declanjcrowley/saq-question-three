package ie.cit.soft8027.saq3.domain;

import java.util.List;

import ie.cit.soft8027.saq3.interfaces.Editor;

public class Newspaper {
	
	private String title;
	
	private List<String> editorList;

	@Override
	public String toString() {
		return "Newspaper [title=" + title + ", editorList=" + editorList + "]";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getEditorList() {
		return editorList;
	}
	public void setEditorList(List<String> editorList) {
		this.editorList = editorList;
	}

}
