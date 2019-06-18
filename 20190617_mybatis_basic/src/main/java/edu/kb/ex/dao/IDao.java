package edu.kb.ex.dao;

import java.util.ArrayList;

import edu.kb.ex.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao();
	
	public void deleteDao(String mid);
	
	public void writeDao(String mwriter, String mcontent);
	
	public ContentDto readDao(String mid);
}
