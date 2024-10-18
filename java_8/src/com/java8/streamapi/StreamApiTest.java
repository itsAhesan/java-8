package com.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTest {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student(101, "Jony", "Male", 22), new Student(102, "Rahat", "Male", 21),
				new Student(102, "JK", "Male", 19), new Student(104, "Yana", "Female", 5),
				new Student(105, "Mou", "Female", 21));

		System.out.println("========Maximum Age========");
		list.stream().max(Comparator.comparing(Student::getAge)).ifPresent(System.out::println);

		System.out.println("========Minimum Age========");
		list.stream().min(Comparator.comparing(Student::getAge).reversed()).ifPresent(System.out::println);

		System.out.println("========Ascending Order=======");
		list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("========Descending Order========");
		list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("========Above 20 years Age========");
		list.stream().filter(st -> st.getAge() > 20).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("========filter Male students========");
		list.stream().filter(st->st.getGender().equals("Male")).collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("========Group by gender========");
		list.stream().collect(Collectors.groupingBy(Student::getGender))
			.forEach((gen,st)->{
				System.out.println(gen);
				st.forEach(System.out::println);
				
			});
		
	}

}
