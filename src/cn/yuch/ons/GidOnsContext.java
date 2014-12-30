package cn.yuch.ons;

public class GidOnsContext implements OnsContext{
	protected String epc;
	protected int version;
	protected int filterValue;
	protected int partion;
	protected long cmnPrefix;
	protected long classifiedCode;
	protected long sequence;
	
	public GidOnsContext(String epc){
		this.epc = epc;
	}
	
	@Override
	public String getEPC() {
		return epc;
	}
}

