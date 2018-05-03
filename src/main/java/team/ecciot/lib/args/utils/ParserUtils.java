package team.ecciot.lib.args.utils;

import java.util.HashMap;
import java.util.List;

import team.ecciot.lib.args.annotation.ArgsAnnotation;

/**
 * 扫描参数模型的工具类
 * @author Landriesnidis
 *
 */
public class ParserUtils{
	public static HashMap<String, String> HM_ACTION_ARGS;
	
	static{
		try {
			HM_ACTION_ARGS =scanPackage("team.ecciot.lib.args.model") ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static HashMap<String, String> scanPackage(String pkg) throws Exception {
		List<Class<?>> lst = ClassUtil.getClasses(pkg);
		HashMap<String, String> hm = new HashMap<String, String>();
		
		for(Class<?> c:lst){
			if(c.getAnnotations().length>0){
				if(c.isAnnotationPresent(ArgsAnnotation.class)){
					ArgsAnnotation an = c.getAnnotation(ArgsAnnotation.class);
					String action = an.action();
					if(hm.containsKey(action)){
						throw new Exception(String.format("action:%s has already been registered.", action));
					}else{
						hm.put(action, c.getName());
					}
				}
			}
		}
		return hm;
	}
}