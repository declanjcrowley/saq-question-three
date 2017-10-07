package ie.cit.soft8027.saq3.domain;

import java.util.List;

import ie.cit.soft8027.saq3.interfaces.Editor;

public class Newspaper {
	
	private String title;
	
	private List<EditorImpl> editorList;

	@Override
	public String toString() {
		String out = title + "\n";
		for(int i=0; i<editorList.size(); i++)
		    out += editorList.get(i).toString() + "\n";
		return out;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<EditorImpl> getEditorList() {
		return editorList;
	}
	public void setEditorList(List<EditorImpl> editorList) {
		this.editorList = editorList;
	}

}
