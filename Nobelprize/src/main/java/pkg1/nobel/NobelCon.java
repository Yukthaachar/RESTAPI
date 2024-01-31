package pkg1.nobel;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NobelCon {
	@GetMapping("/getWinners")
	public ArrayList<String>getData()throws FileNotFoundException{
		ArrayList<String>list1=new ArrayList<>();
		File f1=new File("Nobel51.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	}

}
