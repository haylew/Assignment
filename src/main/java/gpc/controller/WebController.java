package gpc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gpc.model.Statement;
import gpc.model.Turnover;
import gpc.services.FileService;

@Controller
public class WebController {

	private String fileName="file/Pohyby_na_uctu-1.gpc";
	private String charStream;
	private List<Statement> statment;
	private List<Turnover> turnover;
	@Autowired
	private FileService fileService;
	
	@RequestMapping("/")
	public String sayHi(Model model) throws IOException {
		charStream = fileService.readFile(fileName);
		statment = fileService.mapStatmentObject(charStream);
		turnover = fileService.mapTurnoverObject(charStream);
		model.addAttribute("statement",statment);
		model.addAttribute("turnover",turnover);
		return "index";
	}
}
