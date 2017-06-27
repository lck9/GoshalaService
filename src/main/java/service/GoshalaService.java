package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fusion.GoshalaStore;

import dao.GoshalaDao;
import dao.GoshalaDaoFactory;
import model.Gallery;
import model.GoshalaData;
import model.Members;

@Service("GoshalaService")
public class GoshalaService {

	@Autowired
	GoshalaDao goshalaDao = GoshalaDaoFactory.getInstance();
	
	@Transactional
	public List<GoshalaStore> getAllGoshalaData() {
		return goshalaDao.getAllGoshalaData();
	}

	@Transactional
	public String addGoshalaData(GoshalaData goshalaData) {
		return goshalaDao.addGoshalaData(goshalaData);
	}
	
	@Transactional
	public String addMembers(Members members) {
		return goshalaDao.addMembers(members);
	}

	@Transactional
	public String addGallery(Gallery gallery) {
		return goshalaDao.addGallery(gallery);
	}
	
	/*@Transactional
	public Sensor getSensor(int id) {
		return SensorDao.getSensor(id);
	}

	@Transactional
	public void addSensor(Sensor Sensor) {
		SensorDao.addSensor(Sensor);
	}

	@Transactional
	public void updateSensor(Sensor Sensor) {
		SensorDao.updateSensor(Sensor);

	}

	@Transactional
	public void deleteSensor(int id) {
		SensorDao.deleteSensor(id);
	}*/

	
}
