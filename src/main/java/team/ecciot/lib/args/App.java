package team.ecciot.lib.args;

import java.util.List;

import team.ecciot.lib.args.annotation.CmdArgsAnnotation;
import team.ecciot.lib.args.annotation.EventArgsAnnotation;
import team.ecciot.lib.args.utils.ClassUtil;

public class App {
	public static void main(String[] args) {
		
		System.out.println("package : team.ecciot.lib.args.event");
		System.out.println();
		
		List<Class<?>> lst = ClassUtil.getClasses("team.ecciot.lib.args");
		
		for(Class<?> c:lst){
			try{
				if(c.getAnnotations().length>0){
					if(c.isAnnotationPresent(CmdArgsAnnotation.class)){
						CmdArgsAnnotation an = c.getAnnotation(CmdArgsAnnotation.class);
						System.out.println(String.format("%s\t%s\t%s", c.getName(),CmdArgsAnnotation.class.getName(),an.action()));
					}else if(c.isAnnotationPresent(EventArgsAnnotation.class)){
						EventArgsAnnotation an = c.getAnnotation(EventArgsAnnotation.class);
						System.out.println(String.format("%s\t%s\t%s", c.getName(),EventArgsAnnotation.class.getName(),an.action()));
					}else{
						System.out.println(c.getName() + "\t" + "other");
					}
				}
			}catch (ClassCastException e) {
				System.out.println(c.getName());
			}
			
		}
		
		
	}
	
	
}
