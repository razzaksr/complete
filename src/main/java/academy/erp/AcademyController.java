package academy.erp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcademyController 
{
	@Autowired
	RepoAcademy repo;
	
	@InitBinder
	public void act(WebDataBinder web)
	{
		SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
		web.registerCustomEditor(Date.class, "dateofjoined",new CustomDateEditor(simple,false));
		web.registerCustomEditor(Date.class, "firstdatepaid",new CustomDateEditor(simple,false));
		web.registerCustomEditor(Date.class, "datetobepaid",new CustomDateEditor(simple,false));
	}
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView home(@RequestParam("user") String user, @RequestParam("pass") String pass)
	{
		if(user.equals("razzak")&&pass.equals("rasheedha")) 
		{
			return new ModelAndView("home").addObject("logger", user);
		}
		else
		{
			return new ModelAndView("index");
		}
	}
	
	@RequestMapping("/enroll")
	public ModelAndView enroll()
	{
		return new ModelAndView("enroll");
	}
	
	@RequestMapping(value="/enrolled",method = RequestMethod.POST)
	public ModelAndView enrolled(@Valid Academy academy, BindingResult bind)
	{
		if(bind.hasErrors()) {return new ModelAndView("enroll");}
		repo.save(academy);
		return new ModelAndView("enrolled").addObject("newly", academy);
	}
	
	// Update by Id via Post
	@RequestMapping("/update")
	public ModelAndView update()
	{
		return new ModelAndView("update");
	}
	
	@RequestMapping(value="/letup",method=RequestMethod.POST)
	public ModelAndView letUpdate(@RequestParam("id") int id)
	{
		Academy aca=repo.getOne(id);
		return new ModelAndView("letupdate").addObject("one", aca);
	}
	
	@RequestMapping(value="/updated",method=RequestMethod.POST)
	public ModelAndView updated(Academy academy)
	{
		repo.save(academy);
		return new ModelAndView("updated").addObject("status", academy);
	}
	// Update by id via Post ends here
	
	@RequestMapping("/listAll")
	public ModelAndView list()
	{
		List<Academy> fetch=new ArrayList<Academy>();
		repo.findAll().forEach(fetch::add);
		return new ModelAndView("list").addObject("every",fetch);
	}
	
	
	// Update by Id from listing via Get
	@RequestMapping(value="/listeditid/{id}",method=RequestMethod.GET)
	public ModelAndView letUpdateListeditid(@PathVariable("id") int id)
	{
		Academy aca=repo.getOne(id);
		return new ModelAndView("listeditid").addObject("one", aca);
	}
	
	@RequestMapping(value="/listeditid/{id}/updated",method=RequestMethod.POST)
	public ModelAndView updatedListeditid(Academy academy)
	{
		repo.save(academy);
		return new ModelAndView("updated").addObject("status", academy);
	}
	// Update by Id from listing via get ends here
	
	
	// Update by Name supported by Id from listing via Get
	@RequestMapping(value="/listByName/{name}",method=RequestMethod.GET)
	public ModelAndView listByName(@PathVariable("name") String name)
	{
		List<Academy> fetch=new ArrayList<Academy>();
		repo.findAllByName(name).forEach(fetch::add);
		return new ModelAndView("list").addObject("every",fetch);
	}
	
	@RequestMapping(value="/listByName/listeditid/{id}",method=RequestMethod.GET)
	public ModelAndView letUpdateListByName(@PathVariable("id") int id)
	{
		Academy aca=repo.getOne(id);
		return new ModelAndView("listeditid").addObject("one", aca);
	}
	
	@RequestMapping(value="/listByName/listeditid/{id}/updated",method=RequestMethod.POST)
	public ModelAndView updatedListByName(Academy academy)
	{
		repo.save(academy);
		return new ModelAndView("updated").addObject("status", academy);
	}
	// Update by Name supported by Id from listing via Get ends here
	
	
	// Update by Course supported by Id from listing via Get
	@RequestMapping(value="/listByCourse/{course}",method=RequestMethod.GET)
	public ModelAndView listByCourse(@PathVariable("course") String course)
	{
		List<Academy> fetch=new ArrayList<Academy>();
		repo.findAllByCourse(course).forEach(fetch::add);
		return new ModelAndView("list").addObject("every",fetch);
	}
	
	@RequestMapping(value="/listByCourse/listeditid/{id}",method=RequestMethod.GET)
	public ModelAndView letUpdateListByCourse(@PathVariable("id") int id)
	{
		Academy aca=repo.getOne(id);
		return new ModelAndView("listeditid").addObject("one", aca);
	}
	
	@RequestMapping(value="/listByCourse/listeditid/{id}/updated",method=RequestMethod.POST)
	public ModelAndView updatedListByCourse(Academy academy)
	{
		repo.save(academy);
		return new ModelAndView("updated").addObject("status", academy);
	}
	// Update by Course supported by Id from listing via Get ends Here
}