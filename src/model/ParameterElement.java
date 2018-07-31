package model;

import java.util.ArrayList;
import java.util.List;

public class ParameterElement extends ElementStruct {
	
	private final long index;
	private final long upperIndex;
	private final String ecucDefName;
	private final int type;
	private final String content;
	
	private ParameterElement (Builder builder) {
		index = builder.index;
		upperIndex = builder.upperIndex;
		ecucDefName = builder.ecucDefName;
		type = builder.type;
		content = builder.content;
	}
	
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
		
		public ParameterElement build() {
			return new ParameterElement(this);
		}
		
	}

}
