package com.Registeration.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Registeration.demo.model.Registeration;
import com.Registeration.demo.repository.RegisterationRepository;

@Service
public class RegisterationService {

	@Autowired
	RegisterationRepository RegisterationService;
	
	public List<Registeration> getAllRegisteration()
	{
		List<Registeration>registerationList=RegisterationService.findAll();
		return registerationList;
	}
	public Registeration saveRegisteration(Registeration r)
	{
		return RegisterationService.save(r);
	}
	public String login(String firstname,String password)
	{
		List<Registeration>log=RegisterationService.findAll();;
		String result=null;
		for(Registeration i:log) {
			if(i.getFirstname().equals(firstname)&&i.getPassword().equals(password))
			{
				result="LoginSuccessfull";
			}
		}
		if(result==null)
		{
			result="LoginFailed";
		}
		return result;
	}
}
