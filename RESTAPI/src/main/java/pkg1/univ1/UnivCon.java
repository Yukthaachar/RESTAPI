package pkg1.univ1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

@RestController
public class UnivCon {
	public ArrayList<String>loadData(String fname) throws FileNotFoundException{
		File f1=new File(fname);
		ArrayList<String>list1=new ArrayList<>();
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		return list1;
		
	}
	@GetMapping("/getUniv1")
	public ArrayList<String>getUniv1() throws FileNotFoundException{
		return loadData("univUSA.txt");	
	}
	@Autowired
	UnivRepo univRepo;
	
	@PostMapping("/addUniv1")
	public String addUniv1() throws FileNotFoundException{
		ArrayList<String>list1=new ArrayList<>();
		list1=getUniv1();
		List<UnivEntity>info1=new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			info1.add(new UnivEntity(list1.get(i)));
			univRepo.saveAll(info1);
		}
		return "Inserted Successfully";
	}

}
