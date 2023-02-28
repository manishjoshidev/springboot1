package org.jsp.bootproject.Repository;

import org.jsp.bootproject.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.phone=?1 and u.password=?2")
	User verifyUser(long phone, String password);

}
