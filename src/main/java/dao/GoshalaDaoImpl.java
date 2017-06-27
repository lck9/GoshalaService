package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.fusion.GoshalaStore;

import model.Gallery;
import model.GoshalaData;
import model.Members;

@Repository
public class GoshalaDaoImpl implements GoshalaDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
		sessionFactory = hemf.getSessionFactory();
	    return sessionFactory;
	}
	
	public List<GoshalaStore> getAllGoshalaData() {
		List<GoshalaStore> list = new ArrayList<GoshalaStore>(); 
		Session session = this.sessionFactory.getCurrentSession();
		List<GoshalaData> sensorList = (List<GoshalaData>) session.createQuery("from GoshalaData").list();
		System.out.println(sensorList.size());
		
		Iterator<GoshalaData> iterator = sensorList.iterator();
		while(iterator.hasNext()){
			GoshalaStore goshalaStore = new GoshalaStore();
			GoshalaData goshalaData = iterator.next();
			goshalaStore.setId(goshalaData.getId());
			goshalaStore.setPage(goshalaData.getPage());
			goshalaStore.setText(goshalaData.getText());
			goshalaStore.setUrl(goshalaData.getUrl());
			goshalaStore.setCreateDateTime(goshalaData.getCreateDateTime().toString());
			goshalaStore.setUpdateDateTime(goshalaData.getUpdateDateTime().toString());
			list.add(goshalaStore);
		}
		return list;
	}

	@Override
	public String addGoshalaData(GoshalaData goshalaData) {
		String result = "";
		Integer value = 0;
		Session session = this.sessionFactory.getCurrentSession();
		value = (Integer) session.save(goshalaData);
		if(value != 0)
			result =  goshalaData.getPage() + " added successfully";
		return result;
	}

	@Override
	public String addMembers(Members members) {
		String result = "";
		Integer value = 0;
		Session session = this.sessionFactory.getCurrentSession();
		value = (Integer) session.save(members);
		if(value != 0)
			result =  members.getType() + " added successfully";
		return result;
	}

	@Override
	public String addGallery(Gallery gallery) {
		String result = "";
		Integer value = 0;
		Session session = this.sessionFactory.getCurrentSession();
		value = (Integer) session.save(gallery);
		if(value != 0)
			result =  gallery.getUrl() + " added successfully";
		return result;
	}

}
