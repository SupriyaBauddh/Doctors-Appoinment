package com.nameinfo.nameinfo.services;

import java.util.*;

import com.nameinfo.nameinfo.entities.Info;

public interface InfoService {

	public List<Info> getInfo();


	public Info get1Info(long id);
}
