package com.example.demo.util;

/**import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
*/
import org.springframework.stereotype.Service;

//import com.example.learning.model.UserInfo;

@Service
public class UserService implements IUserService{
	private final IUserServicedao userServicedao;

	UserService(IUserServicedao userServicedao) {
		this.userServicedao = userServicedao;
	}

	/**
	 * private static final Map<String, UserInfo> USERS_MAP = new
	 * ConcurrentHashMap<>();
	 * 
	 * static { UserInfo wizardry = new UserInfo("Lakshmi", "Deepala", "05Nov1989");
	 * USERS_MAP.put(wizardry.getFirstName(), wizardry); }
	 * 
	 * Collection<UserInfo> getCourses() { return USERS_MAP.values(); }
	 * 
	 * public UserInfo getUserInfo(String firstName) { return
	 * USERS_MAP.get(firstName); }
	 */
	@Override
	public String getUserInfo(String firstName) {
		return userServicedao.getUserInfo(firstName);
	}
}
