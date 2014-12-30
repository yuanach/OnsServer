package cn.yuch.onsclient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import cn.yuch.ons.GidOnsContext;
import cn.yuch.ons.OnsAddress;
import cn.yuch.ons.OnsContext;
import cn.yuch.ons.OnsRequest;
import cn.yuch.ons.OnsResponse;
import cn.yuch.ons.Response;
import cn.yuch.ons.SocketRequest;

public class Request {

	public static void main(String[] args) throws IOException {
		
		OnsContext ctx = new GidOnsContext("urn.epc:1.983622.75484660544.23440960917");
		InetAddress addr=InetAddress.getByName("172.21.60.1");
		OnsAddress host =new OnsAddress(addr,9001);
		
		OnsRequest request = new SocketRequest();
		request.sendRequest(host, ctx);
		OnsResponse res = new Response();
		
		ctx = res.receiveResponse(request);
		
		System.out.println("URI:"+ctx.getEPC());
		
	}

}
