package model;

import java.util.ArrayList;
import java.util.List;

public class ContainerElement extends ElementStruct {
	
	private final long index;
	private final long upperIndex;
	private final String ecucDefName;
	private final int type;
	private final String content;
	
	private final String shortName;
	private final List<Long> memberList;
	
	private ContainerElement (Builder builder) {
		index = builder.index;
		upperIndex = builder.upperIndex;
		ecucDefName = builder.ecucDefName;
		type = builder.type;
		content = builder.content;
		shortName = builder.shortName;
		memberList = builder.memberList;
	}
	
	@Override
	public long getIndex() {
		
		return this.index;
	}
	
	public static class Builder {
		//Required Parameters(필수인자)
		private long index;
		private long upperIndex;
		private String ecucDefName;
		private int type;
		private String content;
		private String shortName;
		private List<Long> memberList;
		
		public Builder index(long index) {
			this.index = index;
			return this;
		}
		
		public Builder upperIndex(long upperIndex) {
			this.upperIndex = upperIndex;
			return this;
		}
		
		public Builder ecucDefName (String ecucDefName) {
			this.ecucDefName = ecucDefName;
			return this;
		}
		
		public Builder type (int type) {
			this.type = type;
			return this;
		}
		
		public Builder content(String content) {
			this.content = content;
			return this;
		}
		
		public Builder shortName(String ShrotName) {
			this.shortName = ShrotName;
			return this;
		}
		
		public Builder memberList() {
			this.memberList = new ArrayList<>();
			return this;
		
		}
		
		public ContainerElement build() {
			return new ContainerElement(this);
		}
		
	}

	

}
