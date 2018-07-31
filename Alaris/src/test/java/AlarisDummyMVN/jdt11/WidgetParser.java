package AlarisDummyMVN.jdt11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class WidgetParser {
	
	ArrayList<BehaviourMap> map;
	
	public WidgetParser(String file){
		map = new ArrayList<BehaviourMap>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line ="";
			while((line = br.readLine())!=null){
				if(line.contains("addActionListener")){
					String widget = line.split("\\.")[0].trim();
					System.out.println(widget);
					while(!(line = br.readLine()).contains("actionPerformed")){
						System.out.println(line);
					}
					String behaviour = "";
					while(!(line = br.readLine()).contains("}")){
						behaviour += line;
					}
					System.out.println("Behaviour = " + behaviour);
				}
			}
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

}

class BehaviourMap {
	String widget;
	String behaviour;
	
	public BehaviourMap(String w, String b){
		widget = w;
		behaviour = b;
	}
}
