package CommonUtil;



public class ShorteningValues {
	private static String unit = null;

	public void shortening(String value,String U) {	
		unit= U;
		double v;
		try
		  { 
		
			v= Double.parseDouble(value);
		  }
		 catch(Exception ex) 
		  {
		     v=0.0; 		     
		     System.out.println("value: undefined, valueUnit:"+unit);
		  }
		
		
		if(v>0)
		{
		shortening(v);
		}
				
	}

	private static void shortening(double v) {
		double value=0; 
		switch(unit)
		{
		
		case "K":value = v/(Math.pow(10, 3));				 
				break;
		case "M":value = v/(Math.pow(10, 6));
				break;
		case "bn":value = v/(Math.pow(10, 9));
				break;
		case "T":value = v/(Math.pow(10, 12));
				break;
		case " ":value =findUnit(v);
			 	break;
				default:unit="not a real unit";value= v;
		}
		
		
		System.out.println("value : "+value+ "  ValueUnit: "+unit);
		
	}

	private static double findUnit(double v) {
		double value = 0;
		if(v>(Math.pow(10, 12)))
		{
			value= v/(Math.pow(10, 12));
			unit="T";
		}
		else if(v<(Math.pow(10, 12))&&v>(Math.pow(10, 9)))
		{
			value= v/((Math.pow(10, 9)));
			unit="bn";
		}
		else if(v<(Math.pow(10, 9))&&v>(Math.pow(10, 6)))
		{
			value= v/((Math.pow(10, 6)));
			unit="M";
		}
		else if(v<(Math.pow(10, 6))&&v>(Math.pow(10, 3)))
		{
			value= v/((Math.pow(10, 3)));
			unit="K";
		}
		else 
		{
			value= v/(Math.pow(10, 3));
			unit="K";
		}
		return value;
	}

}


