package com.nisum.streams;

import java.util.Optional;


public class StreamsConcept {

	public static void main(String[] args) throws InterruptedException {
//        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
//        stream.forEach(System.out::println);
//        Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
//        stream.forEach(p -> System.out.println(p));
//        List<Integer> list = new ArrayList<Integer>();
//        
//        for(int i = 1; i< 10; i++){
//            list.add(i);
//        }
//
//        Stream<Integer> stream = list.stream();
//        stream.forEach(p -> System.out.println(p));
//        Stream<Date> stream = Stream.generate(Date::new).limit(5);
//        stream.forEach(p -> System.out.println(p));

//        IntStream stream = "12345_abcdefg".chars();
//        stream.forEach(p -> System.out.println(p));

		// OR

//        Stream<String> stream = Stream.of("A$B$C".split("\\$"));
//        stream.forEach(p -> System.out.println(p));

//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 1; i < 10; i++) {
//			list.add(i);
//		}
//		Stream<Integer> stream = list.stream();
//		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.print(evenNumbersList);

//        List<Integer> list = new ArrayList<Integer>();
//        for(int i = 1; i< 10; i++){
//            list.add(i);
//        }
//        Stream<Integer> stream = list.stream();
//        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
//        System.out.print(Arrays.toString(evenNumbersArr));
//		List<String> memberNames = new ArrayList<>();
//		memberNames.add("Amitabh");
//		memberNames.add("Shekhar");
//		memberNames.add("Aman");
//		memberNames.add("Rahul");
//		memberNames.add("Shahrukh");
//		memberNames.add("Salman");
//		memberNames.add("Yana");
//		memberNames.add("Lokesh");
//		memberNames.stream().sorted((str1,str2)->str1.length()-str2.length()).map(String::toUpperCase)
//        .forEach(System.out::println);
//		boolean matchedResult = memberNames.stream()
//                .noneMatch((s) -> {System.out.println(s);return s.startsWith("A");});
//
//System.out.println(matchedResult);

//		String firstMatchedName = memberNames.parallelStream().filter((s) -> {System.out.println(s);return s.startsWith("A");}).findFirst().get();

//System.out.println(firstMatchedName);
//
//matchedResult = memberNames.stream()
//                .allMatch((s) -> s.startsWith("A"));
//
//System.out.println(matchedResult);
//
//matchedResult = memberNames.stream()
//                .noneMatch((s) -> s.startsWith("A"));
//
//System.out.println(matchedResult);

//		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
//
//		System.out.println(totalMatched);
//		 memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2).ifPresent(System.out::println);;
//        List<Integer> list1 = Arrays.asList(1,2,3);
//        List<Integer> list2 = Arrays.asList(4,5,6);
//        List<Integer> list3 = Arrays.asList(7,8,9);
//          
//        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
//         
//        List<Integer> listOfAllIntegers = listOfLists.stream()
//                                    .flatMap(x -> x.stream())
//                                    .collect(Collectors.toList());
//  
//        System.out.println(listOfAllIntegers);
//        System.out.println(listOfLists);

		
//        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
//        
//        List<String> listOfAllChars = Arrays.stream(dataArray)
//                                    .flatMap(x -> Arrays.stream(x))
//                                    .collect(Collectors.toList());
//  
//        System.out.println(listOfAllChars);
		
//		 List<String> fullNames = Arrays.asList("Barry Allen", "Allen Wayne", "Clark Kent");
//
//		 fullNames.stream()
//		            .flatMap(x -> Arrays.stream(x.split("\\s+"))).distinct().sorted()
//		            .forEach(System.out::println);
//		SalesTerritories.getAllTerritories()
//		    .stream()
//		    .flatMap( t -> t.getGeographicExtents()
//		        .stream()
//		        .map( ge -> new SimpleEntry<>( t.getTerritoryName(), ge ) )
//		    )
//		    .map( e -> String.format( "%-30s : %s",
//		                              e.getKey(),
//		                              e.getValue() ) )
//		    .forEach( System.out::println );	
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		 
//		list.stream()
//		    .peek( System.out::println ).count();       //prints nothing
//		Stream.iterate(1, n -> n + 2)
//        .limit(10)
//        .forEach(x -> System.out.println(x));
//		int sum = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
//		.limit(20)
//		.map(n -> n[0])
//		.mapToInt(n->n).sum();
//		System.out.println(sum);
//		Stream.of("Hello", "How", "Are", "You?")
//	    .skip(1)
//	    .forEach(System.out::println);

//        PerformanceTestUtil.runTest("unordered parallel skip", () -> {
//            IntStream intStream = IntStream.range(1, 100000000);
//            intStream.unordered().parallel().skip(1000).toArray();
//        });
//        PerformanceTestUtil.runTest("ordered parallel skip", () -> {
//            IntStream intStream = IntStream.range(1, 100000000);
//            intStream.parallel().skip(1000).toArray();
//        });
		
//        PerformanceTestUtil.runTest("unordered stream", () -> {
//            IntStream stream = IntStream.range(0, 1000000);
//            stream.unordered().parallel().distinct().count();
//        });
//
//        PerformanceTestUtil.runTest("ordered stream", () -> {
//            IntStream stream = IntStream.range(0, 1000000);
//            stream.parallel().distinct().count();
//        });

//		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
//		
//      PerformanceTestUtil.runTest("forEach stream", () -> {
//    	  list.stream().parallel().forEach( System.out::println );   
//  });
//		 
//      PerformanceTestUtil.runTest("forEachOrdered stream", () -> {
//  		list.stream().parallel().forEachOrdered( System.out::println ); //2
//  });		 

		
//		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 
//		
//      PerformanceTestUtil.runTest("forEachOrdered stream", () -> {
//  		list.stream().parallel()
//        .sorted(Comparator.reverseOrder())
//        .forEachOrdered(System.out::println);
//  });	
//		 
//      PerformanceTestUtil.runTest("parallel with out ordered stream", () -> {
//  		list.stream().parallel()
//        .sorted(Comparator.reverseOrder())
//        .forEach(System.out::println);
//  });	
//      PerformanceTestUtil.runTest("without parallel with out ordered stream", () -> {
//  		list.stream()
//        .sorted(Comparator.reverseOrder())
//        .forEach(System.out::println);
//  });
		
//		Stream<String> tokenStream = Arrays.asList("A", "B", "C", "D").stream();  //stream
//        
//		 //array
//		 
//		System.out.println(Arrays.toString(tokenStream.toArray(String[]::new)));
		
//		IntStream infiniteNumberStream = IntStream.iterate(1, i -> i+1);
//        
//		int[] intArray = infiniteNumberStream.limit(10)
//		                            .toArray();
//		 
//		System.out.println(Arrays.toString(intArray));  
		
//		IntStream infiniteNumberStream = IntStream.iterate(1, i -> i+1);
//		 
//		Integer[] integerArray = infiniteNumberStream.limit(10)
//		                                .boxed()
//		                                .toArray(Integer[]::new);
//		 
//		System.out.println(Arrays.toString(integerArray));
		
//        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8,0);
//        
//        Optional<Integer> maxNumber = list.stream()
//                                .max((i, j) -> i-j);
//        
//        Optional<Integer> minNumber = list.stream()
//                .min((i, j) -> i-j);
// 
//        System.out.println("min element: "+minNumber.get()+" max element: "+maxNumber.get());
		
//		   long count = Stream.of("how","to","do","in","java").count();
//		    System.out.printf("There are %d elements in the stream %n", count);
//		     
//		    count = IntStream.of(1,2,3,4,5,6,7,8,9).count();
//		    System.out.printf("There are %d elements in the stream %n", count);
//		     
//		    count = LongStream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).count();
//		    System.out.printf("There are %d elements in the stream %n", count);
		    
//		    long count = Stream.of("how","to","do","in","java").collect(Collectors.counting());
//		    System.out.printf("There are %d elements in the stream %n", count);
//		     
//		    count = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.counting());
//		    System.out.printf("There are %d elements in the stream %n", count);
//		     
//		    count = Stream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).collect(Collectors.counting());
//		    System.out.printf("There are %d elements in the stream %n", count);
		
//        Stream<String> stream = Stream.of("one", "two", "three", "four");
//        
//		boolean match = stream.noneMatch(s -> {
//			System.out.println(s.matches("\\d+"));
//			return s.matches("\\d+");
//		});
//         
//        System.out.println(match);      //true
		
		//working on Optional
//		Optional<Integer> possible = Optional.ofNullable(5);
//		Optional<Integer> possible = Optional.of(5);
		Optional<Integer> possible = Optional.empty();
//		possible.ifPresent(System.out::println);
//		if(possible.isPresent()){
//		    System.out.println(possible.get());
//		}
		System.out.println(possible.get());
		//Assume this value has returned from a method
//		Optional<Integer> companyOptional = Optional.of(10);
		 
		//Now check optional; if value is present then return it, 
		//else create a new Company object and retur it
//		Integer company = companyOptional.orElse(new Integer(10));
//		System.out.println(company);
		 
		//OR you can throw an exception as well
//		Integer company1 = companyOptional.orElseThrow(IllegalStateException::new);	
//		System.out.println(company1);
//		companyOptional.filter(x-> x ==10)
//                .ifPresent(System.out::println);
	}

}
