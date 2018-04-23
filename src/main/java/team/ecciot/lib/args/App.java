package team.ecciot.lib.args;

import java.util.List;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.utils.ClassUtil;

public class App {
	public static void main(String[] args) {
		
		System.out.println("package : team.ecciot.lib.args.event");
		System.out.println();
		
		List<Class<?>> lst = ClassUtil.getClasses("team.ecciot.lib.args");
		
		for(Class<?> c:lst){
			try{
				if(c.getAnnotations().length>0){
					if(c.isAnnotationPresent(ArgsAnnotation.class)){
						ArgsAnnotation an = c.getAnnotation(ArgsAnnotation.class);
						System.out.println(String.format("%s\t%s\t%s", c.getName(),ArgsAnnotation.class.getName(),an.action()));
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
