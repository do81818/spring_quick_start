package com.springbook.ioc.injection;

import java.util.*;

public class CollectionBean {
	private Properties addressList;

	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}

	public Properties getAddressList() {
		return addressList;
	}
}
