package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import model.ContainerElement;
import model.ElementStruct;
import model.ParameterElement;

public class ElementTest {
	
	public static void main(String args[]) {
		
		Map<Long, ElementStruct> dataStructure = new HashMap<>();
		
		ElementStruct logContainer = new ContainerElement.Builder()
				.index(0)
				.build();
		
		ElementStruct dltParameter = new ParameterElement.Builder()
				.index(1)
				.build();
		
		
		dataStructure.put(logContainer.getIndex(), logContainer);
		dataStructure.put(dltParameter.getIndex(), dltParameter);
		
		Iterator<Long> iterator = dataStructure.keySet().iterator();
		
		while(iterator.hasNext()) {
			long index = iterator.next();
			System.out.println("index : " + index + "\tvalue : " + dataStructure.get(index));
		}
	}

}
