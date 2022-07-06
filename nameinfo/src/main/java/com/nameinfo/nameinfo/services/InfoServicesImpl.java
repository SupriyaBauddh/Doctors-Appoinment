package com.nameinfo.nameinfo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.nameinfo.nameinfo.entities.Info;

@Service
public class InfoServicesImpl implements InfoService {

	List<Info> list;
	
	public InfoServicesImpl()
	{
	
		list=new ArrayList<>();
		list.add(new Info(1,"sup",21));
		list.add(new Info(2,"abhi",22));
		list.add(new Info(3,"ak",26));
	}
	
	@Override
	public List<Info> getInfo() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Info get1Info(long id) {
		// TODO Auto-generated method stub
		Info i=null;
		for(Info in:list)
		{
			if(in.getId()==id)
			{
				i=in;
				break;
			}
		}
		return i;
	}

}
