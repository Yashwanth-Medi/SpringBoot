package org.onlineshoppingportal.dao;

import org.onlineshoppingportal.entity.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface RoleDao {

	public Role findRoleByRoleNAme(String role);
}
