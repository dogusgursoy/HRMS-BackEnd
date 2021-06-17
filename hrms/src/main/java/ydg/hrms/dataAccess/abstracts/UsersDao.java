package ydg.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ydg.hrms.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer> {

}
