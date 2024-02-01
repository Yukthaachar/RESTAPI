package pkg1.nobel;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;

public class Lambda1 {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String>list1=new ArrayList<>();
		File f1=new File("words.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		System.out.println(list1);
		System.out.println(list1.stream().filter(w->w.startsWith("Ap")).collect(Collectors.toList()));
		System.out.println(list1.stream().filter(w->w.endsWith("am")).collect(Collectors.toList()));
	}

}
