package net.codejava;

import org.springframework.stereotype.Service;

@Service
public class SecruityBusinessService {

	public boolean authenticate(String username, String password) {
		System.out.println("Hello from the SecurityBusinessService");
		return true;
	}
}
