package com.daviros.thriftpractice;

import org.apache.thrift.transport.TTransportException;

import com.daviros.thriftpractice.server.ContactServer;

public class Application {

	public static void main(String[] args) throws TTransportException {
		ContactServer server = new ContactServer();
        server.start();
	}

}
