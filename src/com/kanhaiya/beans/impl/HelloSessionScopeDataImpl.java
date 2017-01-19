package com.kanhaiya.beans.impl;

import java.util.Date;

import com.kanhaiya.beans.HelloSessionScopeData;

public class HelloSessionScopeDataImpl implements HelloSessionScopeData{
	private final Date date;

	public HelloSessionScopeDataImpl(Date date) {
		this.date = date;
	}

	@Override
	public String getDate() {
		return date.toString();
	}
}
