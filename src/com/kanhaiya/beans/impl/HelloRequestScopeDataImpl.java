package com.kanhaiya.beans.impl;

import java.util.Date;

import com.kanhaiya.beans.HelloRequestScopeData;

public class HelloRequestScopeDataImpl implements HelloRequestScopeData {
	private final Date date;

	public HelloRequestScopeDataImpl(Date date) {
		this.date = date;
	}

	@Override
	public String getDate() {
		return date.toString();
	}
}
