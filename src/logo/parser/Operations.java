package logo.parser;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked","rawtypes"})
public class Operations {

	public static Object add(Object o1, Object o2){
		if (o1 instanceof List){
			List newList = new ArrayList((List)o1);
			if (o2 instanceof List){
				newList.addAll((List)o2);
			} else {
				newList.add(o2);
			}
			return newList;
		}
		if (o1 instanceof String || o2 instanceof String){
			return new StringBuilder().append(o1).append(o2).toString();
		} 
		if (o1 instanceof Integer && o2 instanceof Integer){
			return ((Integer)o1) + ((Integer)o2);
		} else {
			return ((Number)o1).doubleValue() + ((Number)o2).doubleValue();
		}
	}
	public static Object sub(Object o1, Object o2){
		
		if (o1 instanceof List){
			List newList = new ArrayList((List)o1);
			if (o2 instanceof List){
				newList.removeAll((List)o2);
			} else {
				newList.remove(o2);
			}
			return newList;
		}
		
		if (o1 instanceof String || o2 instanceof String){
			return o1;
		} 
		if (o1 instanceof Integer && o2 instanceof Integer){
			return ((Integer)o1) - ((Integer)o2);
		} else {
			return ((Number)o1).doubleValue() - ((Number)o2).doubleValue();
		}
	}
	public static Object mul(Object o1, Object o2){
		
		if (o1 instanceof List && o2 instanceof Number){
			List newList = new ArrayList();
			for (int i=0;i<((Number)o2).intValue();i++){
				newList.addAll((List)o1);
			}
			return newList;
		}
		
		if (o1 instanceof String){
			if (o2 instanceof Number){
				StringBuilder builder = new StringBuilder();
				for (int i=0;i<((Number)o2).intValue();i++){
					builder.append(o1);
				}
				return builder.toString();
			}
			return o1;
		} 
		if (o1 instanceof Integer && o2 instanceof Integer){
			return ((Integer)o1) * ((Integer)o2);
		} else {
			return ((Number)o1).doubleValue() * ((Number)o2).doubleValue();
		}
	}
	public static Object div(Object o1, Object o2){
		if (o1 instanceof Integer && o2 instanceof Integer){
			return ((Integer)o1) * ((Integer)o2);
		} else if (o1 instanceof Number && o2 instanceof Number){
			return ((Number)o1).doubleValue() * ((Number)o2).doubleValue();
		}
		return 0;
	}
	public static Object or(Object o1, Object o2){
		return true;
	}
	public static Object xor(Object o1, Object o2){
		return true;
	}
	public static Object and(Object o1, Object o2){
		return true;
	}
	public static Integer le(Object o1, Object o2){
		if (o1 == null && o2 == null){
			return 1;
		} else if (o1 == null && o2 != null){
			return 1;
		} else if (o1 instanceof Number && o2 instanceof Number){
			return ((Number)o1).doubleValue() <=((Number)o2).doubleValue() ? 1 : 0;
		}  
		return 0;
	}
	public static Integer ge(Object o1, Object o2){
		if (o1 == null && o2 == null){
			return 1;
		} else if (o1 != null && o2 == null){
			return 1;
		} else if (o1 instanceof Number && o2 instanceof Number){
			return ((Number)o1).doubleValue() >=((Number)o2).doubleValue() ? 1 : 0;
		}  
		return 0;
	}
	public static Integer lt(Object o1, Object o2){
		if (o1 == null && o2 == null){
			return 0;
		} else if (o1 == null && o2 != null){
			return 1;
		} else if (o1 instanceof Number && o2 instanceof Number){
			return ((Number)o1).doubleValue() < ((Number)o2).doubleValue() ? 1 : 0;
		}  
		return 0;
	}
	public static Integer gt(Object o1, Object o2){
		if (o1 == null && o2 == null){
			return 0;
		} else if (o1 != null && o2 == null){
			return 1;
		} else if (o1 instanceof Number && o2 instanceof Number){
			return ((Number)o1).doubleValue() > ((Number)o2).doubleValue() ? 1 : 0;
		}  
		return 0;
	}
	public static Integer eq(Object o1, Object o2){
		if (o1 == null && o2 == null){
			return 1;
		} else if ((o1 == null && o2 != null) || (o1 != null && o2 == null)){
			return 0;
		} else {
			return o1.equals(o2) ? 1 : 0;
		}
	}
}
