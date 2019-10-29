package app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import app.model.Turnover;

@Service
public class TurnoverService {

	public List<String> createTurnoverPatern(String line) {
		List<String> output = new ArrayList<>();
		Pattern pattern = Pattern.compile("^(.{3})(.{16})(.{16})(.{13})(.{12})(.{1})(.{10})(.{10})(.{10})(.{6})(.{20})(.{1})(.{4})(.{6}).*");
		Matcher matcher = pattern.matcher(line);
		
		if (matcher.matches()) {
		     for (int i = 1; i <= matcher.groupCount(); i++) {
		         output.add(matcher.group(i));
		     }
		}
		System.out.println(output);
		return output;
	}
	
	public List<Turnover> createTurnoverObject(String charStream) {
		List<Turnover> turnover = new ArrayList<>();
		String lines[] = charStream.split("\\r?\\n");
		for(int i=0; i<lines.length; i++) {
			String firstThreeChar = lines[i].substring(0, 3);
			if(firstThreeChar.equals("075")) {
				List<String> object = createTurnoverPatern(lines[i]);
				turnover.add(new Turnover(object.get(0), object.get(1), object.get(2), object.get(3), object.get(4), object.get(5), object.get(6), object.get(7), object.get(8), object.get(9), object.get(10), object.get(11), object.get(12), object.get(13)));
				System.out.println("Added to list");
			}else{
				System.out.println("Invalid Data.");
			}
		}
		return turnover;
	}
}
