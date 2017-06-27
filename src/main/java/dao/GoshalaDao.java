package dao;

import java.util.List;

import com.fusion.GoshalaStore;

import model.Gallery;
import model.GoshalaData;
import model.Members;

public interface GoshalaDao {

	public List<GoshalaStore> getAllGoshalaData();
	
	public String addGoshalaData(GoshalaData goshalaData);
	
	public String addMembers(Members members);
	
	public String addGallery(Gallery gallery);
	
	
}
