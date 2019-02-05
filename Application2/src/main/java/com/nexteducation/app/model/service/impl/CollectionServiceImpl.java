package com.nexteducation.app.model.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.nexteducation.app.model.service.core.CollectionService;

@Service
public class CollectionServiceImpl implements CollectionService{

	@Override
	public String differetWaysofStreams() {
		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		stringList.add("five");
		
		Integer arr[] = {1,2,3,4,5};
		
		Stream<String> streamData = stringList.stream();
		Stream<Integer> streamData1 = Stream.of(arr);
		
		IntStream itStream = IntStream.of(1,2,3,4,5);
		
		IntStream itStreamRange = IntStream.range(1, 10);
		
		DoubleStream dStream = DoubleStream.of(1.0,2.0,3.0);
		
		DoubleStream dStreamrandom = DoubleStream.generate(()->{return (double)(Math.random()*100);});
		
		/*Iterator<String> it = streamData.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		//streamData.forEach(item->System.out.println(item));
		
		streamData.forEach(System.out::println);
		return null;
	}
	
	
}
