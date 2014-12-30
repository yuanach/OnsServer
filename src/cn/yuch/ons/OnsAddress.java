package cn.yuch.ons;

import java.net.InetAddress;

public class OnsAddress {
	private InetAddress host;
	private int port;

	public OnsAddress() {

	}

	public OnsAddress(InetAddress host, int port) {
		this.host = host;
		this.port = port;
	}

	public InetAddress getHost() {
		return host;
	}

	public void setHost(InetAddress host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
