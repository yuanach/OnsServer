package cn.yuch.ons;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketRequest extends AbstractOnsRequest{
	
	
	@Override
	public void sendRequest(OnsAddress addr, OnsContext request) throws IOException {
		
		InetSocketAddress local=new InetSocketAddress("OnsClient", 0);
		
		Socket socket = new Socket(addr.getHost(),addr.getPort(),local.getAddress(),0);
		
		DataOutputStream out =new DataOutputStream(socket.getOutputStream());
		out.write(request.getEPC().getBytes());
		out.flush();
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		
		String response=null;

		int len=0;
		byte [] buffer = new byte[1024];
		response = "";
		while((len=in.read(buffer))!=-1){
			response += new String(buffer,0,len);
		}
		
		this.stringRes = response;

		socket.close();
	}
}
