package ela;

import entity.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class sd {

	public static void main(String[] args) throws FileNotFoundException {
		/*List<String> list=new ArrayList<>();
		Stream<String> stream=list.stream();*/

		List<Person> list = new ArrayList<>();
		list.add(new Person("jack", 20));
		list.add(new Person("mike", 25));
		list.add(new Person("tom", 30));

		list= list.stream().filter(person -> person.getName().equals("jack")).collect(toList());

		list.forEach(e-> System.out.println(e));
	}
}