package ydg.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ydg.hrms.business.abstracts.UsersService;
import ydg.hrms.dataAccess.abstracts.UsersDao;
import ydg.hrms.entities.concretes.Users;

@Service
public class UsersManager implements UsersService {

	private UsersDao usersDao;
	
	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	
	
	@Override
	public List<Users> getAll() {
		
		return this.usersDao.findAll();
	}

}
